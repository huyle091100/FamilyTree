package com.familytree.models;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "f_id")
    private String f_id;
    @Column(name = "m_id")
    private String m_id;
    @Column(name = "ten")
    private String ten;
    @Column(name = "gioi_tinh")
    private String gioi_tinh;
    @Column(name = "ngay_sinh")
    private String ngay_sinh;
    @Column(name = "ngay_mat")
    private String ngay_mat;

    public Member() {
    }

    public Member(String f_id, String m_id, String ten, String gioi_tinh, String ngay_sinh, String ngay_mat) {
        this.f_id = f_id;
        this.m_id = m_id;
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_sinh = ngay_sinh;
        this.ngay_mat = ngay_mat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_id() {
        return f_id;
    }

    public void setF_id(String f_id) {
        this.f_id = f_id;
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getNgay_mat() {
        return ngay_mat;
    }

    public void setNgay_mat(String ngay_mat) {
        this.ngay_mat = ngay_mat;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", f_id='" + f_id + '\'' +
                ", m_id='" + m_id + '\'' +
                ", ten='" + ten + '\'' +
                ", gioi_tinh='" + gioi_tinh + '\'' +
                ", ngay_sinh='" + ngay_sinh + '\'' +
                ", ngay_mat='" + ngay_mat + '\'' +
                '}';
    }
}
