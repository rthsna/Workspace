<?php

echo "<br>MD5<br>";
echo crypt('Vive#Les#S1aux','$1$duSel');
echo "<br>SHA256<br>";
echo crypt('Vive#Les#S1aux','$5$duSel');
echo "<br>SHA512<br>";
echo crypt('Vive#Les#S1aux','$6$duSel');
echo "<br>SHA256Fin<br>";
echo crypt('Vive#Les#S1aux','$5$duSelFin');
echo "<br>SHA256G<br>";
echo crypt('Vive#Les#S1aux','$5$duGrosSel');



 
