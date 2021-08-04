$(function () {

    $(document).ready(function () {
        var url = new URL(window.location.href);
        var id = url.searchParams.get("id");
        if (id !== null) getRoomById(id);
    });

    function getRoomById(id) {

        $.ajax({
            url: 'http://localhost:8080/api/room/' + id,
            type: 'GET',
        }).done(function (data) {
            console.log(data.roomType);
            $('#roomId').val(data.roomId);
            $('#roomType').val(data.roomType);
            $('#roomSize').val(data.roomSize);
            $('#roomPrice').val(data.roomPrice);
              showFacilities(data.roomFacilities.toString());
        });
    }

    // click on button submit
    $("#submit").on('click', function () {
        getFacilities();
        $.ajax({
            url: 'http://localhost:8080/api/room/add',
            type: 'PUT',
            contentType: 'application/json',
            dataType: "json",
            data: JSON.stringify({
                "roomId": document.getElementById('roomId').value,
                "roomType": document.getElementById('roomType').value,
                "roomSize": document.getElementById('roomSize').value,
                "roomPrice": document.getElementById('roomPrice').value,
                "roomFacilities": document.getElementById('roomFacilities').value
            }),
            crossDomain: true,
            success: function (result) {
                $("#messageLabel").html("Your data was successfully saved.");
                setTimeout("$('#messageLabel').html('');", 2000);
                setTimeout("location.href = 'http://localhost:8080/rooms.html';", 2000);
            },
            error: function (e) {
                console.log(e);
            },
        });
    });

    function showFacilities(facilities) {
    //  console.log(facilities);
      var form = document.getElementById('input-facilities');
      var myArray = [];
      myArray = facilities.toString().split(',');
      form.querySelectorAll('input').forEach(function (input) {
        if (input.type === 'checkbox') {
          for (let i = 0, len = myArray.length; i < len; i++) {
    //          console.log(myArray[i]);
              if (input.value == myArray[i].trim()){
                input.checked = true;
              }
          }
        }
      })
    }

});
