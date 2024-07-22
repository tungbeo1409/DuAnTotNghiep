package com.poly.du_an_tot_nghiep_f6.controller;

import com.poly.du_an_tot_nghiep_f6.entity.*;
import com.poly.du_an_tot_nghiep_f6.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("")
    public String index() {
        return "user/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin/home";
    }

    @GetMapping("/addData")
    public String createData(){
        addData();
        return "user/home";
    }



    @Autowired
    ColorRepo colorRepo;
    @Autowired
    MaterialRepo materialRepo;
    @Autowired
    DirectoryRepo directoryRepo;
    @Autowired
    SizeRepo sizeRepo;
    @Autowired
    StyleRepo styleRepo;
    @Autowired
    TrademarkRepo trademarkRepo;
    @Autowired
    VoucherRepo voucherRepo;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    EmployeeRepo employeeRepo;

    public void addData() {
        colorRepo.deleteAll();
        materialRepo.deleteAll();
        directoryRepo.deleteAll();
        sizeRepo.deleteAll();
        styleRepo.deleteAll();
        trademarkRepo.deleteAll();
        voucherRepo.deleteAll();
        customerRepo.deleteAll();
        employeeRepo.deleteAll();
        List<Color> colors = Arrays.asList(
                new Color(0, "Đen"),
                new Color(1, "Trắng"),
                new Color(2, "Đỏ"),
                new Color(3, "Xanh dương"),
                new Color(4, "Xanh lá cây"),
                new Color(5, "Vàng"),
                new Color(6, "Cam"),
                new Color(7, "Hồng"),
                new Color(8, "Tím"),
                new Color(9, "Nâu"),
                new Color(10, "Xám"),
                new Color(11, "Bạc"),
                new Color(12, "Vàng nhạt"),
                new Color(13, "Xanh lục nhạt"),
                new Color(14, "Xanh da trời"),
                new Color(15, "Tím than"),
                new Color(16, "Xanh lam"),
                new Color(17, "Be"),
                new Color(18, "Đỏ đậm"),
                new Color(19, "Cam nhạt"),
                new Color(20, "Vàng chanh"),
                new Color(21, "Xanh chuối"),
                new Color(22, "Xanh ngọc"),
                new Color(23, "Xanh biển"),
                new Color(24, "Tím nhạt")
        );

        List<Material> materials = Arrays.asList(
                new Material(0, "Cotton", new Date(), new Date(), "Chất liệu mềm mại và thoáng khí", true),
                new Material(1, "Lụa", new Date(), new Date(), "Chất liệu cao cấp, mềm mịn", true),
                new Material(2, "Len", new Date(), new Date(), "Chất liệu giữ ấm tốt", true),
                new Material(3, "Polyester", new Date(), new Date(), "Chất liệu bền, dễ chăm sóc", true),
                new Material(4, "Nỉ", new Date(), new Date(), "Chất liệu giữ ấm, mềm mại", true),
                new Material(5, "Vải thun", new Date(), new Date(), "Chất liệu co giãn, thoải mái", true),
                new Material(6, "Vải lanh", new Date(), new Date(), "Chất liệu mát mẻ, thoáng khí", true),
                new Material(7, "Vải bố", new Date(), new Date(), "Chất liệu bền, thô", true),
                new Material(8, "Da", new Date(), new Date(), "Chất liệu cao cấp, bền bỉ", true),
                new Material(9, "Vải ren", new Date(), new Date(), "Chất liệu nhẹ, thấm hút", true),
                new Material(10, "Viscose", new Date(), new Date(), "Chất liệu mềm mại, thấm hút tốt", true),
                new Material(11, "Acrylic", new Date(), new Date(), "Chất liệu giữ ấm, nhẹ", true),
                new Material(12, "Spandex", new Date(), new Date(), "Chất liệu co giãn, bền", true),
                new Material(13, "Vải voan", new Date(), new Date(), "Chất liệu nhẹ, thoáng mát", true),
                new Material(14, "Vải đũi", new Date(), new Date(), "Chất liệu mềm mại, thoáng khí", true),
                new Material(15, "Vải satin", new Date(), new Date(), "Chất liệu bóng, mượt", true),
                new Material(16, "Vải dạ", new Date(), new Date(), "Chất liệu ấm áp, mềm mại", true),
                new Material(17, "Vải denim", new Date(), new Date(), "Chất liệu bền, chắc", true),
                new Material(18, "Vải lưới", new Date(), new Date(), "Chất liệu nhẹ, thoáng mát", true),
                new Material(19, "Vải nhung", new Date(), new Date(), "Chất liệu mềm mại, cao cấp", true)
        );

        List<Size> sizes = Arrays.asList(
                new Size(0, "XS", new Date(), new Date(), "Extra Small", true),
                new Size(1, "S", new Date(), new Date(), "Small", true),
                new Size(2, "M", new Date(), new Date(), "Medium", true),
                new Size(3, "L", new Date(), new Date(), "Large", true),
                new Size(4, "XL", new Date(), new Date(), "Extra Large", true),
                new Size(5, "XXL", new Date(), new Date(), "Double Extra Large", true),
                new Size(6, "3XL", new Date(), new Date(), "Triple Extra Large", true),
                new Size(7, "4XL", new Date(), new Date(), "Quadruple Extra Large", true)
        );

        List<Style> styles = Arrays.asList(
                new Style(0, "Cổ tròn", new Date(), new Date(), "Kiểu dáng cổ tròn", true),
                new Style(1, "Cổ V", new Date(), new Date(), "Kiểu dáng cổ chữ V", true),
                new Style(2, "Cổ lọ", new Date(), new Date(), "Kiểu dáng cổ lọ", true),
                new Style(3, "Không tay", new Date(), new Date(), "Kiểu dáng không tay", true),
                new Style(4, "Tay dài", new Date(), new Date(), "Kiểu dáng tay dài", true),
                new Style(5, "Tay ngắn", new Date(), new Date(), "Kiểu dáng tay ngắn", true),
                new Style(6, "Sát nách", new Date(), new Date(), "Kiểu dáng sát nách", true),
                new Style(7, "Form rộng", new Date(), new Date(), "Kiểu dáng form rộng", true),
                new Style(8, "Form ôm", new Date(), new Date(), "Kiểu dáng form ôm", true)
        );

        List<Trademark> trademarks = Arrays.asList(
                new Trademark(0, "Nike", new Date(), new Date(), "Thương hiệu thể thao nổi tiếng", true),
                new Trademark(1, "Adidas", new Date(), new Date(), "Thương hiệu thể thao hàng đầu", true),
                new Trademark(2, "Puma", new Date(), new Date(), "Thương hiệu thể thao chất lượng", true),
                new Trademark(3, "Gucci", new Date(), new Date(), "Thương hiệu thời trang cao cấp", true),
                new Trademark(4, "Louis Vuitton", new Date(), new Date(), "Thương hiệu thời trang xa xỉ", true),
                new Trademark(5, "Chanel", new Date(), new Date(), "Thương hiệu thời trang danh tiếng", true),
                new Trademark(6, "Zara", new Date(), new Date(), "Thương hiệu thời trang phổ thông", true),
                new Trademark(7, "H&M", new Date(), new Date(), "Thương hiệu thời trang bình dân", true),
                new Trademark(8, "Uniqlo", new Date(), new Date(), "Thương hiệu thời trang tiện lợi", true)
        );

        List<Directory> directories = Arrays.asList(
                new Directory(0, "Áo", new Date(), new Date(), "Danh mục các loại áo", true),
                new Directory(1, "Quần", new Date(), new Date(), "Danh mục các loại quần", true),
                new Directory(2, "Giày dép", new Date(), new Date(), "Danh mục các loại giày dép", true),
                new Directory(3, "Phụ kiện", new Date(), new Date(), "Danh mục các loại phụ kiện", true),
                new Directory(4, "Túi xách", new Date(), new Date(), "Danh mục các loại túi xách", true),
                new Directory(5, "Đồ thể thao", new Date(), new Date(), "Danh mục đồ thể thao", true),
                new Directory(6, "Đồ ngủ", new Date(), new Date(), "Danh mục đồ ngủ", true),
                new Directory(7, "Đồ bơi", new Date(), new Date(), "Danh mục đồ bơi", true),
                new Directory(8, "Đồ lót", new Date(), new Date(), "Danh mục đồ lót", true)
        );

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Nguyễn Văn A", "0123456789", "123 Đường A, TP. HCM", "a@example.com", "nguyenvana", "password1", "123456789", new Date(), new Date(), "Quản lý bán hàng", true),
                new Employee(2, "Trần Thị B", "0987654321", "456 Đường B, TP. HCM", "b@example.com", "tranthib", "password2", "987654321", new Date(), new Date(), "Nhân viên kho", true),
                new Employee(3, "Lê Văn C", "0112233445", "789 Đường C, TP. HCM", "c@example.com", "levanc", "password3", "112233445", new Date(), new Date(), "Nhân viên kỹ thuật", true),
                new Employee(4, "Phạm Văn D", "0123344556", "101 Đường D, TP. HCM", "d@example.com", "phamvand", "password4", "556677889", new Date(), new Date(), "Nhân viên chăm sóc khách hàng", true),
                new Employee(5, "Ngô Thị E", "0987766554", "202 Đường E, TP. HCM", "e@example.com", "gothie", "password5", "667788990", new Date(), new Date(), "Nhân viên hành chính", true),
                new Employee(6, "Vũ Văn F", "0112233445", "303 Đường F, TP. HCM", "f@example.com", "vufanf", "password6", "778899001", new Date(), new Date(), "Nhân viên tài chính", true),
                new Employee(7, "Bùi Thị G", "0123456789", "404 Đường G, TP. HCM", "g@example.com", "buithig", "password7", "889900112", new Date(), new Date(), "Nhân viên marketing", true),
                new Employee(8, "Đinh Văn H", "0987654321", "505 Đường H, TP. HCM", "h@example.com", "dinhvanh", "password8", "990011223", new Date(), new Date(), "Nhân viên sản xuất", true),
                new Employee(9, "Lâm Thị I", "0112233445", "606 Đường I, TP. HCM", "i@example.com", "lamthi", "password9", "001122334", new Date(), new Date(), "Nhân viên thiết kế", true),
                new Employee(10, "Hồ Văn J", "0123344556", "707 Đường J, TP. HCM", "j@example.com", "hovanj", "password10", "112233445", new Date(), new Date(), "Nhân viên quản lý chất lượng", true),
                new Employee(11, "Lê Thị K", "0987766554", "808 Đường K, TP. HCM", "k@example.com", "lethik", "password11", "223344556", new Date(), new Date(), "Nhân viên phát triển sản phẩm", true),
                new Employee(12, "Nguyễn Văn L", "0112233445", "909 Đường L, TP. HCM", "l@example.com", "nguyenvanl", "password12", "334455667", new Date(), new Date(), "Nhân viên dịch vụ khách hàng", true),
                new Employee(13, "Trần Văn M", "0123456789", "1010 Đường M, TP. HCM", "m@example.com", "tranvanm", "password13", "445566778", new Date(), new Date(), "Nhân viên nghiên cứu và phát triển", true),
                new Employee(14, "Vũ Thị N", "0987654321", "1111 Đường N, TP. HCM", "n@example.com", "vuthin", "password14", "556677889", new Date(), new Date(), "Nhân viên logistics", true),
                new Employee(15, "Ngô Văn O", "0112233445", "1212 Đường O, TP. HCM", "o@example.com", "govano", "password15", "667788990", new Date(), new Date(), "Nhân viên hỗ trợ kỹ thuật", true)
        );

        List<Customer> customers = Arrays.asList(
                new Customer(1, "Nguyễn Văn A", "0123456789", "a@example.com", "123 Đường A, TP. HCM", "nguyenvana", "password1", new Date(), new Date(), "Khách hàng VIP", true),
                new Customer(2, "Trần Thị B", "0987654321", "b@example.com", "456 Đường B, TP. HCM", "tranthib", "password2", new Date(), new Date(), "Khách hàng thường xuyên", true),
                new Customer(3, "Lê Văn C", "0112233445", "c@example.com", "789 Đường C, TP. HCM", "levanc", "password3", new Date(), new Date(), "Khách hàng mới", true),
                new Customer(4, "Phạm Thị D", "0123344556", "d@example.com", "101 Đường D, TP. HCM", "phamthid", "password4", new Date(), new Date(), "Khách hàng lâu năm", true),
                new Customer(5, "Ngô Văn E", "0987766554", "e@example.com", "202 Đường E, TP. HCM", "govane", "password5", new Date(), new Date(), "Khách hàng thân thiết", true),
                new Customer(6, "Vũ Thị F", "0112233445", "f@example.com", "303 Đường F, TP. HCM", "vuthif", "password6", new Date(), new Date(), "Khách hàng cao cấp", true),
                new Customer(7, "Bùi Văn G", "0123456789", "g@example.com", "404 Đường G, TP. HCM", "buivang", "password7", new Date(), new Date(), "Khách hàng tiềm năng", true),
                new Customer(8, "Đinh Thị H", "0987654321", "h@example.com", "505 Đường H, TP. HCM", "dinhthih", "password8", new Date(), new Date(), "Khách hàng cũ", true),
                new Customer(9, "Lâm Văn I", "0112233445", "i@example.com", "606 Đường I, TP. HCM", "lamvani", "password9", new Date(), new Date(), "Khách hàng mới", true),
                new Customer(10, "Hồ Thị J", "0123344556", "j@example.com", "707 Đường J, TP. HCM", "hothij", "password10", new Date(), new Date(), "Khách hàng lâu năm", true),
                new Customer(11, "Lê Văn K", "0987766554", "k@example.com", "808 Đường K, TP. HCM", "levank", "password11", new Date(), new Date(), "Khách hàng thường xuyên", true),
                new Customer(12, "Nguyễn Thị L", "0112233445", "l@example.com", "909 Đường L, TP. HCM", "nguyenthil", "password12", new Date(), new Date(), "Khách hàng tiềm năng", true),
                new Customer(13, "Trần Văn M", "0123456789", "m@example.com", "1010 Đường M, TP. HCM", "tranvanm", "password13", new Date(), new Date(), "Khách hàng VIP", true),
                new Customer(14, "Vũ Thị N", "0987654321", "n@example.com", "1111 Đường N, TP. HCM", "vuthin", "password14", new Date(), new Date(), "Khách hàng thân thiết", true),
                new Customer(15, "Ngô Văn O", "0112233445", "o@example.com", "1212 Đường O, TP. HCM", "govano", "password15", new Date(), new Date(), "Khách hàng mới", true)
        );

        List<Voucher> vouchers = Arrays.asList(
                new Voucher(1, "Voucher Giảm Giá 10%", "DISC10", 10, 100, new Date(), new Date(System.currentTimeMillis() + 86400000L * 30), "Giảm giá 10% cho đơn hàng từ 100.000đ", true),
                new Voucher(2, "Voucher Giảm Giá 20%", "DISC20", 20, 50, new Date(), new Date(System.currentTimeMillis() + 86400000L * 60), "Giảm giá 20% cho đơn hàng từ 200.000đ", true),
                new Voucher(3, "Voucher Giảm Giá 30%", "DISC30", 30, 30, new Date(), new Date(System.currentTimeMillis() + 86400000L * 90), "Giảm giá 30% cho đơn hàng từ 300.000đ", true),
                new Voucher(4, "Voucher Giảm Giá 40%", "DISC40", 40, 20, new Date(), new Date(System.currentTimeMillis() + 86400000L * 120), "Giảm giá 40% cho đơn hàng từ 400.000đ", true),
                new Voucher(5, "Voucher Giảm Giá 50%", "DISC50", 50, 10, new Date(), new Date(System.currentTimeMillis() + 86400000L * 150), "Giảm giá 50% cho đơn hàng từ 500.000đ", true),
                new Voucher(6, "Voucher Giảm Giá 15%", "DISC15", 15, 80, new Date(), new Date(System.currentTimeMillis() + 86400000L * 30), "Giảm giá 15% cho đơn hàng từ 150.000đ", true),
                new Voucher(7, "Voucher Giảm Giá 25%", "DISC25", 25, 60, new Date(), new Date(System.currentTimeMillis() + 86400000L * 60), "Giảm giá 25% cho đơn hàng từ 250.000đ", true),
                new Voucher(8, "Voucher Giảm Giá 35%", "DISC35", 35, 40, new Date(), new Date(System.currentTimeMillis() + 86400000L * 90), "Giảm giá 35% cho đơn hàng từ 350.000đ", true),
                new Voucher(9, "Voucher Giảm Giá 45%", "DISC45", 45, 25, new Date(), new Date(System.currentTimeMillis() + 86400000L * 120), "Giảm giá 45% cho đơn hàng từ 450.000đ", true),
                new Voucher(10, "Voucher Giảm Giá 55%", "DISC55", 55, 15, new Date(), new Date(System.currentTimeMillis() + 86400000L * 150), "Giảm giá 55% cho đơn hàng từ 550.000đ", true),
                new Voucher(11, "Voucher Giảm Giá 5%", "DISC05", 5, 200, new Date(), new Date(System.currentTimeMillis() + 86400000L * 30), "Giảm giá 5% cho đơn hàng từ 50.000đ", true),
                new Voucher(12, "Voucher Giảm Giá 10%", "DISC10X", 10, 90, new Date(), new Date(System.currentTimeMillis() + 86400000L * 60), "Giảm giá 10% cho đơn hàng từ 100.000đ", true),
                new Voucher(13, "Voucher Giảm Giá 20%", "DISC20X", 20, 70, new Date(), new Date(System.currentTimeMillis() + 86400000L * 90), "Giảm giá 20% cho đơn hàng từ 200.000đ", true),
                new Voucher(14, "Voucher Giảm Giá 30%", "DISC30X", 30, 50, new Date(), new Date(System.currentTimeMillis() + 86400000L * 120), "Giảm giá 30% cho đơn hàng từ 300.000đ", true),
                new Voucher(15, "Voucher Giảm Giá 40%", "DISC40X", 40, 40, new Date(), new Date(System.currentTimeMillis() + 86400000L * 150), "Giảm giá 40% cho đơn hàng từ 400.000đ", true)
        );
        voucherRepo.saveAll(vouchers);
        customerRepo.saveAll(customers);
        colorRepo.saveAll(colors);
        directoryRepo.saveAll(directories);
        materialRepo.saveAll(materials);
        sizeRepo.saveAll(sizes);
        styleRepo.saveAll(styles);
        trademarkRepo.saveAll(trademarks);
        voucherRepo.saveAll(vouchers);
        employeeRepo.saveAll(employees);
    }
}
