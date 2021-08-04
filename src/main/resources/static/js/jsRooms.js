$(function () {
    //include header
    $("#includedContent").load("header.html");
});
    $(function getAllRooms() {
        $.ajax({
            url: 'http://localhost:8080/api/rooms',
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
                    { data: "roomSize", title: "Max Capacity" },
                    { data: "roomPrice", title: "Price" },
                    { data: "roomFacilities", title: "Facilities" },
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
                    {
                        title: "Edit",
                        data: "roomId",
                        "searchable": false,
                        "sortable": false,
                        "render": function (data) {
                            var roomIdEdit = "editRoom.html?id=" + data;
                            //                     console.log(roomIdEdit);
                            return '<a href="' + roomIdEdit + '" class="editRoom"><i class="fa fa-pencil fa-fw"></a>';
                        }
                    },
                    {
                        title: "Delete",
                        data: "roomId",
                        "searchable": false,
                        "sortable": false,
                        "render": function (data) {
                            var roomIdEdit = "deleteRoom.html?id=" + data;
                            return '<a href="' + roomIdEdit + '" class="deleteRoom"><i class="fa fa-trash fa-fw"></a>';
                        }
                    }
                ]
            });
        });
    });
