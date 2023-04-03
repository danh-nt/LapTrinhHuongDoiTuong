
package ProjectSGK;
import ProjectSGK.ListBaiTap;
import ProjectSGK.ListLyThuyet;
import ProjectSGK.LyThuyet;
import ProjectSGK.BaiTap;
import java.io.File;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListBaiTap LBT = new ListBaiTap();
        ListLyThuyet LLT = new ListLyThuyet();
        LyThuyet LT = new LyThuyet();
        BaiTap BT = new BaiTap();
        int chon = 0;
        int chon2 = 0;
        int chon3 = 0;
        do{
            System.out.println("-------------------------QUAN LY KHO SACH GIAO KHOA-------------------------");
            System.out.println("SACH GIAO KHOA BAO GOM : SACH GIAO KHOA -LY THUYET- VA SACH GIAO KHOA -BAI TAP-");
            System.out.println("BAN CHON:\n");
            System.out.println("1 : QUAN LY SACH GIAO KHOA LY THUYET");
            System.out.println("2 : QUAN LY SACH GIAO KHOA BAI TAP");
            System.out.println("0 : THOAT KHOI CHUONG TRINH");
            
            chon = input.nextInt();
            input.nextLine();
            switch(chon){
                case 1:{
        do{
            System.out.println("\n-------------------------QUAN LY SACH GIAO KHOA |LY THUYET|-------------------------");
            System.out.println("CHON : ");
            System.out.println("1. Them SGK ly thuyet");
            System.out.println("2. In danh sach");
            System.out.println("3. Dem so luong SGK ly thuyet");
            System.out.println("4. Tim ten SGK ly thuyet");
            System.out.println("5. Sap xep SGK ly thuyet theo so luong giam dan");
            System.out.println("6. Sua doi thong tin SGK ly thuyet");
            System.out.println("7. Xoa SGK");
            System.out.println("8. Luu thanh 1 file txt");
            System.out.println("9. Doc du lieu file txt");
            System.out.println("10. Tao ra phieu xuat ");
            System.out.println("0. Thoat ra khoi chuong trinh \n");
            
            chon2 = input.nextInt();
            input.nextLine();
            switch(chon2){
            case 1:
            { 
                System.out.print("Nhap ma SGK Ly thuyet: "); String ma = input.next();
                System.out.print("Nhap ten SGK Ly thuyet: "); String ten = input.next();
                    int lop;
                        do {
                            System.out.print("Nhap lop: ");
                            lop = input.nextInt();    
                        } while (lop <= 0 || lop > 12);
                    System.out.print("Nha xuat ban: "); String NXB = input.next();
                    int namXB;
                        do {
                            System.out.print("Nhap nam xuat ban: ");
                            namXB = input.nextInt();
                        } while (namXB <= 0);
                    System.out.print("Nhap ngay nhap: "); int day = input.nextInt();
                    System.out.print("Nhap thang nhap: "); int month = input.nextInt();
                    System.out.print("Nhap nam nhap: "); int year = input.nextInt();
                        LT.hien(day, month, year);
                    int SL;
                        do {
                            System.out.print("Nhap so luong: ");
                            SL = input.nextInt();    
                        } while (SL <= 0);
                    double gia;
                        do {
                            System.out.print("Nhap gia sach: ");
                            gia = input.nextDouble();    
                        } while (gia <= 0);

                LyThuyet SLT1 = new LyThuyet(ma,ten,lop,namXB,NXB,SL,gia,LT.getNgayNhap());
                LLT.themSLT(SLT1);
                break;
            }
                case 2:{
                    LLT.inSLT();
                    break; 
            }
                case 3:{
                    System.out.println("So luong : " + LLT.demSLT());
                    break;
            }
                case 4:{
                System.out.println("Ten SGK Ly Thuyet : "); String ten = input.nextLine();
                System.out.println("Ket qua : ");
                LLT.timSLT(ten);
                break;
            }
                case 5:{
                LLT.SXSLT();
                LLT.inSLT();
                break;
            }
                case 6:{
                LLT.suaSLT();
                break;
            }
             case 7:{
                LLT.xoaSLT();
                break;
            }
             case 8:{
                System.out.print("Ten file : ");
                String tenfilel = input.nextLine();
                File fl = new File(tenfilel);
                LLT.luuSLT(fl);
                break;
            }
             case 9:{
                System.out.print("Nhap ten file : ");
                String tenfiled = input.nextLine();
                File fd = new File(tenfiled);
                LLT.docSLT(fd);
                LLT.inSLT();
                break;
            }
             case 10:{
                 LLT.xuatSLT();
                 break;
             }  
                    
        }   
        }while(chon2!=0);
        break;
                }
                case 2:{
        do{
            System.out.println("\n-------------------------QUAN LY SACH GIAO KHOA |BAI TAP|-------------------------");
            System.out.println("CHON : ");
            System.out.println("1. Them SGK Bai Tap");
            System.out.println("2. In danh sach");
            System.out.println("3. Dem so luong SGK Bai Tap");
            System.out.println("4. Tim ten SGK Bai Tap");
            System.out.println("5. Sap xep SGK Bai Tap theo so luong giam dan");
            System.out.println("6. Sua doi thong thin SGK Bai Tap");
            System.out.println("7. Xoa SGK ");
            System.out.println("8. Luu thanh file txt");
            System.out.println("9. Doc du lieu file txt");
            System.out.println("10. Tao ra phieu xuat ");
            System.out.println("0. Thoat ra khoi chuong trinh ");
            
            chon3 = input.nextInt();
            input.nextLine();
            switch(chon3){
                case 1:{
                    System.out.print("Nhap ma SGK Bai tap: "); String ma = input.next();
                    System.out.print("Nhap ten SGK Bai tap: "); String ten = input.next();
                    int lop;
                        do {
                            System.out.print("Nhap lop: ");
                            lop = input.nextInt();    
                        } while (lop <= 0 || lop > 12);
                    System.out.print("Nha xuat ban: "); String NXB = input.next();
                    int namXB;
                        do {
                            System.out.print("Nhap nam xuat ban: ");
                            namXB = input.nextInt();
                        } while (namXB <= 0);
                    System.out.print("Nhap ngay nhap: "); int day = input.nextInt();
                    System.out.print("Nhap thang nhap: "); int month = input.nextInt();
                    System.out.print("Nhap nam nhap: "); int year = input.nextInt();
                        BT.hien(day, month, year);
                    int SL;
                        do {
                            System.out.print("Nhap so luong: ");
                            SL = input.nextInt();    
                        } while (SL <= 0);
                    double gia;
                        do {
                            System.out.print("Nhap gia sach: ");
                            gia = input.nextDouble();    
                        } while (gia <= 0);
                 
                    BaiTap BT1 = new BaiTap(ma,ten,lop,namXB,NXB,SL,gia,BT.getNgayNhap());
                    LBT.themSBT(BT1);
                    break;
                }

                case 2:{
                    LBT.inSBT();
                    break;
                }
                case 3:{
                    System.out.println("So luong : " + LBT.demSBT());
                    break;
                }
                case 4:{
                    System.out.println("Ten SGK Bai Tap :"); String ten = input.nextLine();
                    System.out.println("Ket qua : ");
                    LBT.timSBT(ten);
                    break;
                }
                case 5:{
                    LBT.sapXepSBT();
                    LBT.inSBT();
                    break;
                }
                case 6:{
                    LBT.suaSBT();
                    break;
                }
                case 7:{
                    LBT.xoaSBT();
                    break;
                }
                case 8:{
                    System.out.print("Ten file luu : ");
                    String tenfilel = input.nextLine();
                    File fl = new File(tenfilel);
                    LBT.luuSBT(fl);
                    break;
                }
                case 9:{
                    System.out.print("Ten file de doc du lieu : ");
                    String tenfiled = input.nextLine();
                    File fd = new File(tenfiled);
                    LBT.docSBT(fd);
                    LBT.inSBT();
                    break;
                }
                case 10:{
                    LBT.xuatSBT();
                }    
            }
            } while(chon3!=0);
                break;
                }
                }
            }while(chon!=0);

        }
}
    