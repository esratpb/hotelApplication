//$(function () {
//    //include header
//    $("#includedContent").load("header.html");
//});
    $(function getAllRooms() {  //not all rooms,only needs to be cleaning rooms
        $.ajax({
            url: 'http://localhost:8080/api/room/needscleaning',
            type: 'GET',
            contentType: 'application/json',
            dataType: "json",
            crossDomain: true
        }).done(function (data) {

            $('#roomTable').dataTable({
                data: data,
                columns: [

                    { data: "roomId", title: "Room Id" },
                    { data: "roomType", title: "Room Type" },

                    {
                        data: "roomNeedsCleaning", title: "Needs Cleaning",
                        render: function (data) {
                            if (data) {
                                return '<i class="fa fa-flag red-color"></i>';
                            } else {
                                return null;
                            }
                        }
                    },
                ]
            });
        });
    });
