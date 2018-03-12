# PDFC
Pdf compressor with itextpdf libs

# Compile And Running
to compile, you use the AIDE app, then grab the classes.dex.zip file and sign in using the zipsigner app. then rename with filename pdfc.jar and put in your internal storage (sdcard) create a new file with the name pdfc.sh then fill in as follows :
``` 
base=$PWD
export CLASSPATH=$base/pdfc.jar
exec app_process /system/bin com.glanexdev.pdf.compressor Main "$@"
```
# Running
open Terminal Emulator app, then type follows
```
localhasot@android:/sdcard $ sh pdfc.sh InputPdf.pdf OutputPdf.pdf
```

<b>Screenshot:</b>
<img src="https://raw.githubusercontent.com/Hendriyawan/PDFC/master/ss.jpg" width="250" />


