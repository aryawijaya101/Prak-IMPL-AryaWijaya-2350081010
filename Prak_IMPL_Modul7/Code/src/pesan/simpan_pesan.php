<?php
$idPenerima  = isset($_POST['Penerima']) ? $_POST['Penerima'] : '';
$judul       = isset($_POST['judul']) ? $_POST['judul'] : '';
$TextPesan   = isset($_POST['TextPesan']) ? $_POST['TextPesan'] : '';
$date        = date('Y-m-d H:i:s');

$idPengirim = 1; 

if ($idPenerima === '' || $judul === '' || $TextPesan === '') {
    echo "Data tidak lengkap, pesan gagal dikirim.";
    exit;
}

require_once 'config/koneksi.php';

$idPenerima = mysqli_real_escape_string($conn, $idPenerima);
$judul      = mysqli_real_escape_string($conn, $judul);
$TextPesan  = mysqli_real_escape_string($conn, $TextPesan);
$date       = mysqli_real_escape_string($conn, $date);
$idPengirim = mysqli_real_escape_string($conn, $idPengirim); 

$sql = "
    INSERT INTO pesan (idPesan, idPenerima, idPengirim, Judul, TextPesan, WktPesan)
    VALUES (NULL, '$idPenerima', '$idPengirim', '$judul', '$TextPesan', '$date')
";

$result = mysqli_query($conn, $sql);

if ($result) {
    echo "Pesan berhasil ditambahkan (pesan telah terkirim). <a href='tampil_pesan.php'>Kembali ke daftar pesan</a>";
} else {
    echo "Pesan gagal ditambahkan: " . mysqli_error($conn);
}

mysqli_close($conn);
?>
