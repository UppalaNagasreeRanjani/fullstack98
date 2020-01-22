var day;
(function (day) {
    day[day["sunday"] = 0] = "sunday";
    day[day["monday"] = 1] = "monday";
    day[day["tuesday"] = 5] = "tuesday";
    day[day["wednessday"] = 6] = "wednessday";
})(day || (day = {}));
console.log(day);
