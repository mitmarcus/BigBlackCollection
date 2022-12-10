

$.get("vehicle.xml", function (xml, status) {
    var txt = "<table class='myClass'><tr><th class='myClass'>Manual Gear</th><th class='myClass'>Volume</th><th class='myClass'>Horse Power</th><th class='myClass'>Type</th><th class='myClass'>Is Diesel?</th></tr>";
    $(xml).find("list").each(function(){

        var manualGear = $(this).find("manualGear").text();
        var volume = $(this).find("volume").text();
        var horsePower = $(this).find("horsePower").text();
        var type = $(this).find("type").text();
        var isDiesel = $(this).find("isDiesel").text();

        txt += "<tr><td class='myClass'>" + manualGear + "</td><td class='myClass'>" + volume + "</td><td class='myClass'>" + horsePower + "</td><td class='myClass'>" + type + "</td><td class='myClass'>" + isDiesel + "</td></tr>";
    });
    txt += "</table>";
    $("#textField1").html(txt);
});













