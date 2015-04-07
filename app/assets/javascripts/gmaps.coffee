# Load a google map
if(typeof google != 'undefined')
  for mapCanvas in document.querySelectorAll(".map")
    center = map = null
    initialize = () ->
      mapOptions = {
        center: myLatlng,
        zoom: 18,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        draggable: false,
        disableDefaultUI: true,
        scrollwheel: false,
        disableDoubleClickZoom: true
      }
#      mapCanvas = document.querySelector('.map')
      myLatlng = new google.maps.LatLng(mapCanvas.dataset.latitude, mapCanvas.dataset.longitude)
      map = new google.maps.Map(mapCanvas, mapOptions)
      marker = new google.maps.Marker({
        position: myLatlng,
        map: map,
        title: 'Office location'
      })
      center = myLatlng
      google.maps.event.addDomListener window, 'load', initialize
      google.maps.event.addDomListener window, 'resize', () ->
        map.setCenter(center) # keep map centered on resize

  # disable info window popups
  set = google.maps.InfoWindow.prototype.set
  google.maps.InfoWindow.prototype.set = (key, val) ->
    return if (key == 'map' && !this.get('noSupress'))
    set.apply(this, arguments)