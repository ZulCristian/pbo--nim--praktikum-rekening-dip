public interface BisaDitarik {
    // KONTRAK: true kalau berhasil, false kalau gagal.
    // Tidak pernah melempar exception.
    boolean tarik(int jumlah);
    String getNomor();
}