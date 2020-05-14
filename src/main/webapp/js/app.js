// "use strict";
// $(function () {
//
//     // testAddItems();
//     // testFetchItems();
//     //
//     // displayClock();
//     // fetchAllPets();
//     addPet();
// });
//
// function testFetchItems() {
//
//     fetch('http://localhost:8080/PetAdoptionWebApp/registeredJsonAPI', { method: 'GET' })
//         .then(response => {
//             console.log("Fetch items response --> ", response)
//             if (response.ok) { return response.json(); }
//             else {
//                 return Promise.reject({ status: response.status, statusText: response.body });
//             }
//         })
//         .then(items => {
//             console.log("Items ---> ", items)
//
//         })
//         .catch(error => {
//             console.log('Error on fetching items:', error)
//         });
//
// }
//
// function testAddItems() {
//     const newItem = {
//         itemName: "Orange Juice",
//         description: "This is nice juice",
//         category: "lunch"
//     }
//     fetch('http://localhost:8080/PetAdoptionWebApp/registeredJsonAPI', {
//         method: 'POST',
//         body: JSON.stringify(newItem),
//         headers: {
//             'Content-Type': 'application/json'
//         }
//     })
//         .then(response => {
//             console.log('Post item response --> ', response);
//             if (response.ok) { return response.json(); }
//
//         })
//         .then(addedItem => {
//             console.log('addedItem --> ', addedItem);
//         })
//         .catch(error => {
//             console.log('Error on posting item -->', error)
//
//         });
// };
//
//
// function fetchAllPets() {
//     let counter = 100;
//     let petsTable = $("#petsTable");
//     let petTableError = $('#petsTableError');
//
//     fetch('/http://localhost:8080/PetAdoptionWebApp/registeredJsonAPI', { method: 'GET' })
//         .then(response => {
//             console.log(response)
//             if (response.ok) { return response.json(); }
//             else {
//                 return Promise.reject({ status: response.status, statusText: response.body });
//             }
//         })
//         .then(pets => {
//             pets.forEach(pet => {
//                 counter++;
//                 $("#pet-body").append(
//                 "\n" +
//                     "        <div class=\"card card-pet\" style=\"width: 18rem;\">\n" +
//                     "            <div class=\"row\">\n" +
//                     "                <div class=\"col-sm-4\">                    \n" +
//                     "            <img class=\"card-img-top\" src=\"./images/cute-puppy.jpg\" alt=\"Pet image\">\n" +
//                     "                </div>\n" +
//                     "                <div class=\"col-sm-8\">\n" +
//                     "                    <div class=\"row\">\n" +
//                     "                        <div class=\"col-sm-6\">Animal ID: </div>\n" +
//                     "                        <div class=\"col-sm-6\">"+ counter+"</div>\n" +
//                     "                    </div>\n" +
//                     "                    <div class=\"row\">\n" +
//                     "                        <div class=\"col-sm-6\">Type: </div>\n" +
//                     "                        <div class=\"col-sm-6\">"+ pet.type+"</div>\n" +
//                     "                    </div>\n" +
//                     "                    <div class=\"row\">\n" +
//                     "                        <div class=\"col-sm-6\">Sex: </div>\n" +
//                     "                        <div class=\"col-sm-6\">"+ pet.sex+"</div>\n" +
//                     "                    </div>\n" +
//                     "                    <div class=\"row\">\n" +
//                     "                        <div class=\"col-sm-6\">Color: </div>\n" +
//                     "                        <div class=\"col-sm-6\">"+ pet.color+"</div>\n" +
//                     "                    </div>\n" +
//                     "                    <div class=\"row\">\n" +
//                     "                        <div class=\"col-sm-6\">Weight: </div>\n" +
//                     "                        <div class=\"col-sm-6\">"+ pet.weight+"</div>\n" +
//                     "                    </div>\n" +
//                     "                </div>\n" +
//                     "            </div>\n" +
//                     "            <div class=\"row\">\n" +
//                     "                \n" +
//                     "            </div>\n" +
//                     "            <div class=\"card-body\">\n" +
//                     "                <h5 class=\"card-title\">"+ pet.type+"</h5>\n" +
//                     "                <p class=\"card-text\">"+ pet.description+"</p>\n" +
//                     "            </div>\n" +
//                     "        </div>"
//                 );
//             });
//             petsTable.css("display", "inline-flex");
//         })
//         .catch(error => {
//             console.log('Error on fetching pets:', error)
//             petTableError.text(error.message);
//             petTableError.css("display", "block");
//         });
// };
//
// function addPet() {
//     $("#register-pet").submit(event => {
//         event.preventDefault();
//         // let animalName = $("#animalName");
//         // let customFile = $("#customFile");
//         let type = $("#type");
//         let breed = $("#breed");
//         let sex = $("input[name='sexName']:checked").val();
//         let color = $("#color");
//         let description = $("#description");
//         let date = $("#date");
//         let weight = $("#weight");
//
//         let petCreateError = $("#petCreateError");
//
//         const newpet = {
//             "type": type.val(),
//             "breed": breed.val(),
//             "sex": sex,
//             "color": color.val(),
//             "weight": weight.val(),
//             "description": description.val(),
//             "date": date.val()
//         }
//         const myVar = JSON.stringify(newpet);
//         fetch('http://localhost:8080/PetAdoptionWebApp/registeredJsonAPI', {
//             method: 'POST',
//             body: JSON.stringify(newpet),
//             headers: {
//                 'Content-Type': 'application/json'
//             }
//         })
//             .then(response => {
//                 console.log('Post response', response);
//                 if (response.ok) { return response.json(); }
//
//             })
//             .then(jsonResponseData => {
//                 console.log('jsonResponseData ', jsonResponseData);
//                 // animalName.val('');
//                 type.val('');
//                 breed.val('');
//                 sex.val('');
//                 color.val('');
//                 weight.val('');
//                 description.val('');
//                 date.val('');
//                 window.location.href = "./home";
//             })
//             .catch(error => {
//                 console.log('Error on posting a pet:', error);
//                 petCreateError.text(error);
//                 petCreateError.css("display", "block");
//
//             });
//     });
// };
//
//
// function displayClock() {
//     let d = new Date();
//     let year = d.getFullYear();
//     let date = d.getDate();
//     date = date < 10 ? "0" + date : date;
//     let minutes = d.getMinutes();
//     minutes = minutes < 10 ? "0" + minutes : minutes;
//
//     let seconds = d.getSeconds();
//     seconds = seconds < 10 ? "0" + seconds : seconds;
//
//     let months = new Array();
//     months[0] = "January";
//     months[1] = "February";
//     months[2] = "March";
//     months[3] = "April";
//     months[4] = "May";
//     months[5] = "June";
//     months[6] = "July";
//     months[7] = "August";
//     months[8] = "September";
//     months[9] = "October";
//     months[10] = "November";
//     months[11] = "December";
//     let month = months[d.getMonth()];
//
//     let weekday = new Array(7);
//     weekday[0] = "Sunday";
//     weekday[1] = "Monday";
//     weekday[2] = "Tuesday";
//     weekday[3] = "Wednesday";
//     weekday[4] = "Thursday";
//     weekday[5] = "Friday";
//     weekday[6] = "Saturday";
//     let dayOfWeek = weekday[d.getDay()];
//
//     let hours = d.getHours();
//     let amOrPm = (hours < 12) ? "AM" : "PM";
//     let hour = (hours < 12) ? hours : hours - 12;
//     hour = hour < 10 ? "0" + hour : hour;
//
//     let d2 = `${dayOfWeek},  ${date} ${month} ${year}`;
//     console.log("date today ", d2)
//
//     document.getElementById('clock').innerHTML = d2;
//     setTimeout(displayClock, 1000);
//
// }