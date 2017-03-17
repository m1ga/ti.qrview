var Barcode = require('ti.qrview');
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
