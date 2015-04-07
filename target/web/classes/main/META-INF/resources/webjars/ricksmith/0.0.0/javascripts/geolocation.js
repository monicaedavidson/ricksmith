function initialize()
{
    var latlng = new google.maps.LatLng(47.6168229,-122.3296371);
    var latlng2 = new google.maps.LatLng(33.674211,-111.858454);
    var latlng3 = new google.maps.LatLng(49.2569684,-123.1239135);
    var myOptions =
    {
        zoom: 15,
        draggable: false,
        disableDefaultUI: true,
        center: latlng,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        scrollwheel: false,
        disableDoubleClickZoom: true
    };

    var myOptions2 =
    {
        zoom: 15,
        draggable: false,
        disableDefaultUI: true,
        center: latlng2,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        scrollwheel: false,
        disableDoubleClickZoom: true
    };

    var myOptions3 =
    {
        zoom: 15,
        draggable: false,
        disableDefaultUI: true,
        center: latlng3,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        scrollwheel: false,
        disableDoubleClickZoom: true
    };

    var map = new google.maps.Map(document.getElementById("map-canvas"), myOptions);

    var map2 = new google.maps.Map(document.getElementById("map-canvas2"), myOptions2);

    var map3 = new google.maps.Map(document.getElementById("map-canvas3"), myOptions3);

    var myMarker = new google.maps.Marker(
        {
            position: latlng,
            map: map,
            title:"Taser"
        });

    var myMarker2 = new google.maps.Marker(
        {
            position: latlng2,
            map: map2,
            title:"Taser Scottsdale"
        });

    var myMarker3 = new google.maps.Marker(
        {
            position: latlng3,
            map: map3,
            title:"Canada"
        });
}