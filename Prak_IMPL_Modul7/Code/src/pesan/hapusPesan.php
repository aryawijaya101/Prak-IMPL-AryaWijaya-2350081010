<?php
$idPesan = isset($_GET['idPesan']) ? $_GET['idPesan'] : '';

if ($idPesan === '') {
    echo "ID Pesan tidak ditemukan.";
    exit;
}

require_once 'config/koneksi.php';

function hapus_datapesan($conn, $idPesan)
{
    $idPesan = mysqli_real_escape_string($conn, $idPesan);
    $sql = "DELETE FROM pesan WHERE idPesan = '$idPesan'";
    return mysqli_query($conn, $sql);
}

$hasil = hapus_datapesan($conn, $idPesan);

if ($hasil) {
    echo "Pesan berhasil dihapus. <a href='tampil_pesan.php'>Kembali ke daftar pesan</a>";
} else {
    echo "Pesan gagal dihapus.";
}

mysqli_close($conn);
?>
