## Appcelerator Titanium QR Code module for Android

Preview version

Uses https://github.com/dlazaro66/QRCodeReaderView

**Features/Limitations:**
* QR code only
* can be placed/sized like a normal Titanium view
* do not use `borderRadius`
* non fullscreen camera views might be stretched

**Demo**
```javascript
var Barcode = require('ti.barcode');
var win = Ti.UI.createWindow({
    backgroundColor: 'white'
});

var qr = Barcode.createBarcodeView({
    width: Ti.UI.FILL,
    height: Ti.UI.FILL,
    useFrontCamera: false
});

qr.addEventListener("found",function(e){
    console.log(e.text);
})

win.add(qr);

win.addEventListener("open", function(e) {
    qr.startCamera();
});
win.open();
```
