package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//đặt tên đúng y hệt với các biến mà đề bài cho 

public class SinhVien implements Serializable
{
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException
    {
        this.ma = String.format("B20DCCN%03d", id + 1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = sdf.parse(ngaysinh);
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + sdf.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
