

Bài thực Hành 2:
1. GIỚI THIỆU BÀI TOÁN

  Chương trình bao gồm các chức năng chính:
-Đếm số sinh viên đạt loại Giỏi
-Tính điểm trung bình của các điểm hợp lệ
-Viết kiểm thử đơn vị bằng JUnit để đảm bảo tính đúng đắn của chương trình
-Quản lý mã nguồn và quy trình làm việc bằng GitHub

Mục tiêu của bài tập là giúp sinh viên làm quen với Unit Testing, JUnit và quy trình phát triển phần mềm chuyên nghiệp.

2. PHÂN TÍCH YÊU CẦU

2.1 Yêu cầu chức năng

  Lớp StudentAnalyzer gồm 2 phương thức:
  countExcellentStudents(List<Double> scores)
  Đếm số sinh viên có điểm ≥ 8.0
  Bỏ qua các điểm < 0 hoặc > 10
  Nếu danh sách rỗng, trả về 0
  calculateValidAverage(List<Double> scores)
  Tính điểm trung bình của các điểm hợp lệ (0–10)
  Nếu không có điểm hợp lệ, trả về 0

2.2 Yêu cầu kỹ thuật

  Sử dụng Java
  Áp dụng vòng lặp để duyệt danh sách điểm
  Kiểm tra dữ liệu đầu vào (validate)
  Viết kiểm thử đơn vị bằng JUnit 5
  
3. CÀI ĐẶT CHƯƠNG TRÌNH

3.1 Cấu trúc thư mục

  unit-test/ src/ StudentAnalyzer.java     
  unit-test/test/StudentAnalyzerTest.java
  unit-test/README.md

3.2 Cài đặt lớp StudentAnalyzer

Lớp StudentAnalyzer được xây dựng để xử lý dữ liệu điểm số.
Trong quá trình cài đặt:
  -Sử dụng vòng lặp for để duyệt danh sách
  -Áp dụng điều kiện kiểm tra để loại bỏ dữ liệu không hợp lệ
  -Đảm bảo chương trình không phát sinh lỗi khi danh sách rỗng

<img width="905" height="583" alt="image" src="https://github.com/user-attachments/assets/48f05bd4-a837-4c8a-8fc2-54f7e6b5681b" />

4. KIỂM THỬ ĐƠN VỊ VỚI JUNIT

4.1 Giới thiệu JUnit

  JUnit là một framework phổ biến dùng để kiểm thử đơn vị trong Java, giúp phát hiện lỗi sớm và đảm bảo chất lượng phần mềm.

4.2 Các trường hợp kiểm thử

  -Các ca kiểm thử được xây dựng bao gồm:
  -Trường hợp bình thường
  -Danh sách có điểm hợp lệ và không hợp lệ
  -Trường hợp biên
  -Danh sách rỗng
  -Danh sách chỉ chứa 0 hoặc 10
  -Trường hợp ngoại lệ
  -Điểm âm hoặc lớn hơn 10
  
4.3 Kết quả kiểm thử

  -Kết quả chạy kiểm thử:
  -Tất cả các test case đều PASS
  -Chương trình hoạt động đúng theo yêu cầu đề bài

  <img width="1919" height="1021" alt="image" src="https://github.com/user-attachments/assets/00ad7277-e913-430c-a6aa-ca8d24e12b4c" />

5. QUẢN LÝ MÃ NGUỒN VỚI GITHUB

5.1 Sử dụng Issue

  Đã tạo các Issue để quản lý công việc:
  -Issue #1: Viết hàm countExcellentStudents
  -Issue #2: Viết hàm calculateValidAverage
  -Issue #3: Viết kiểm thử đơn vị
  -Issue #4: Viết README

5.2 Gắn commit với Issue

  Trong quá trình commit, sinh viên sử dụng cú pháp #issue_number, fixes, closes để liên kết commit với Issue tương ứng.
  Ví dụ:
            "feat: implement calculateValidAverage() closes #2"


Bài thực hành 3: Bài tập thực hành kiểm thử tự động End-to-End với Cypress

1. Mục tiêu bài thực hành

Bài thực hành nhằm làm quen với kiểm thử tự động end-to-end (E2E) bằng công cụ Cypress, thông qua việc xây dựng và thực thi các kịch bản kiểm thử trên một website mẫu. Qua đó hiểu được quy trình viết test case, chạy kiểm thử tự động và đánh giá kết quả kiểm thử.

2. Công cụ và môi trường sử dụng

Node.js (phiên bản 14 trở lên)
-Cypress
-Visual Studio Code
-Git & GitHub (hoặc GitLab)
-Website kiểm thử: https://www.saucedemo.com

3. Nội dung thực hành

3.1 Cài đặt Cypress

<img width="559" height="362" alt="image" src="https://github.com/user-attachments/assets/bc443bbb-81b1-417d-8f2c-20947c912ffb" />

Khởi tạo dự án với npm

<img width="508" height="193" alt="image" src="https://github.com/user-attachments/assets/b3ac1621-48e6-4ff9-b046-70275f8ed119" />

-Cài đặt Cypress bằng npm

<img width="1480" height="981" alt="image" src="https://github.com/user-attachments/assets/2ad0a952-7ad4-4db2-a725-6a95df3637ca" />

-Mở Cypress và tạo cấu trúc thư mục kiểm thử

-3.2 Các kịch bản kiểm thử đã thực hiện

-Kiểm thử đăng nhập thành công với tài khoản hợp lệ
-Kiểm thử đăng nhập thất bại với tài khoản không hợp lệ
-Kiểm thử thêm sản phẩm vào giỏ hàng
-Kiểm thử sắp xếp sản phẩm theo giá tăng dần
-Kiểm thử xóa sản phẩm khỏi giỏ hàng
-Kiểm thử quy trình thanh toán (checkout)
-Các kịch bản được viết trong các file:

-login_spec.cy.js

<img width="1919" height="1018" alt="image" src="https://github.com/user-attachments/assets/a43102aa-bbdc-4e76-979e-eeecb1e33e71" />

-cart_spec.cy.js

<img width="1910" height="1012" alt="image" src="https://github.com/user-attachments/assets/17daed1f-9482-4503-82bb-7c77f39ae92c" />

4. Kết quả đạt được

-Tất cả các kịch bản kiểm thử đều chạy thành công trên Cypress
-Xác minh đúng các chức năng chính của website: đăng nhập, giỏ hàng và thanh toán
-Kết quả chạy kiểm thử được lưu dưới dạng ảnh chụp màn hình

5. Kết luận

Qua bài thực hành này, nắm được cách cài đặt và sử dụng Cypress để viết kiểm thử tự động end-to-end. Bài thực hành giúp hiểu rõ hơn về kiểm thử phần mềm, giảm thiểu lỗi thủ công và nâng cao chất lượng ứng dụng web.
