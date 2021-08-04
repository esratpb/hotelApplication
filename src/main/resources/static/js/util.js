
function getFacilities() {
  var form = document.getElementById('input-facilities');

  var myArray = [];
  form.querySelectorAll('input').forEach(function (input) {
    if (input.type === 'checkbox' && input.checked) {
      myArray.push(input.value);
    }
  })
  document.getElementById('roomFacilities').value = myArray.toString();
}

function showFacilities(facilities) {
  var form = document.getElementById('input-facilities');

  var myArray = [];
  myArray = facilities.split(',')
  form.querySelectorAll('input').forEach(function (input) {
    if (input.type === 'checkbox' && input.checked) {
      for(item in myArray){
          if (input.value == item){
            input.checked = true;
          }
      }
    }
  })
}

function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}