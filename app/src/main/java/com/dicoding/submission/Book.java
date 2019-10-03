package com.dicoding.submission;

public class Book {
    private String nama_buku, nama_penulis, nama_penerbit, deskripsi_buku, tahun_terbit, halaman_buku, isbn_buku;
    private int img_buku;


    public String getNama_buku() {
        return nama_buku;
    }

    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    public String getNama_penulis() {
        return nama_penulis;
    }

    public void setNama_penulis(String nama_penulis) {
        this.nama_penulis = nama_penulis;
    }

    public String getHalaman_buku() {
        return halaman_buku;
    }

    public void setHalaman_buku(String halaman_buku) {
        this.halaman_buku = halaman_buku;
    }

    public String getIsbn_buku() {
        return isbn_buku;
    }

    public void setIsbn_buku(String isbn_buku) {
        this.isbn_buku = isbn_buku;
    }

    public String getNama_penerbit() {
        return nama_penerbit;
    }

    public void setNama_penerbit(String nama_penerbit) {
        this.nama_penerbit = nama_penerbit;
    }

    public String getDeskripsi_buku() {
        return deskripsi_buku;
    }

    public void setDeskripsi_buku(String deskripsi_buku) {
        this.deskripsi_buku = deskripsi_buku;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public int getImg_buku() {
        return img_buku;
    }

    public void setImg_buku(int img_buku) {
        this.img_buku = img_buku;
    }
}
