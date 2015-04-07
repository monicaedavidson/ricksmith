(function() {
  var center, initialize, map, mapCanvas, set, _i, _len, _ref;

  if (typeof google !== 'undefined') {
    _ref = document.querySelectorAll(".map");
    for (_i = 0, _len = _ref.length; _i < _len; _i++) {
      mapCanvas = _ref[_i];
      center = map = null;
      initialize = function() {
        var mapOptions, marker, myLatlng;
        mapOptions = {
          center: myLatlng,
          zoom: 18,
          mapTypeId: google.maps.MapTypeId.ROADMAP,
          draggable: false,
          disableDefaultUI: true,
          scrollwheel: false,
          disableDoubleClickZoom: true
        };
        myLatlng = new google.maps.LatLng(mapCanvas.dataset.latitude, mapCanvas.dataset.longitude);
        map = new google.maps.Map(mapCanvas, mapOptions);
        marker = new google.maps.Marker({
          position: myLatlng,
          map: map,
          title: 'Office location'
        });
        center = myLatlng;
        google.maps.event.addDomListener(window, 'load', initialize);
        return google.maps.event.addDomListener(window, 'resize', function() {
          return map.setCenter(center);
        });
      };
    }
    set = google.maps.InfoWindow.prototype.set;
    google.maps.InfoWindow.prototype.set = function(key, val) {
      if (key === 'map' && !this.get('noSupress')) {
        return;
      }
      return set.apply(this, arguments);
    };
  }

}).call(this);
