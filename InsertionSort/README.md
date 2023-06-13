# Sắp xếp chèn là ?
một thuật toán sắp xếp đơn giản hoạt động tương tự như cách bạn sắp xếp các quân bài trên tay của mình.
Mảng hầu như được chia thành một phần được sắp xếp và một phần chưa được sắp xếp. Các giá trị từ phần chưa sắp xếp được chọn và đặt vào đúng vị trí trong phần đã sắp xếp.
# Thuật toán sắp xếp chèn
Để sắp xếp một mảng có kích thước N theo thứ tự tăng dần, lặp lại mảng và so sánh phần tử hiện tại (khóa) với phần tử tiền nhiệm của nó,
nếu phần tử chính nhỏ hơn phần tử tiền nhiệm của nó, hãy so sánh nó với các phần tử trước đó.
Di chuyển các phần tử lớn hơn lên một vị trí để tạo khoảng trống cho phần tử được hoán đổi.
# Hoạt động của thuật toán Insertion Sort
Xét một ví dụ: arr[]: {12, 11, 13, 5, 6}
12   	   11   	   13   	   5   	   6   
Đầu tiên vượt qua:
- Ban đầu, hai phần tử đầu tiên của mảng được so sánh theo sắp xếp chèn.
  12   	   11   	   13   	   5   	   6
- Ở đây, 12 lớn hơn 11 do đó chúng không theo thứ tự tăng dần và 12 không ở đúng vị trí của nó. Do đó, hoán đổi 11 và 12.
- Vì vậy, hiện tại 11 được lưu trữ trong một mảng con được sắp xếp.
  11   	   12   	   13   	   5   	   6   
  Vượt qua thứ hai:
- Bây giờ, chuyển sang hai yếu tố tiếp theo và so sánh chúng
  11   	   12   	   13   	   5   	   6
- Ở đây, 13 lớn hơn 12, do đó cả hai phần tử dường như theo thứ tự tăng dần, do đó, sẽ không xảy ra hoán đổi.
  12 cũng được lưu trữ trong một mảng con được sắp xếp cùng với 11
  Vượt qua thứ ba:
- Bây giờ, hai phần tử có mặt trong mảng con được sắp xếp là 11 và 12
- Tiến tới hai phần tử tiếp theo là 13 và 5
  11   	   12   	   13   	   5   	   6
- Cả 5 và 13 đều không có mặt ở đúng vị trí của chúng, vì vậy hãy hoán đổi chúng
  11   	   12   	   5   	   13   	   6   
  Sau khi hoán đổi, phần tử 12 và 5 không được sắp xếp, do đó hoán đổi lại
  11   	   5   	   12   	   13   	   6
- Ở đây, một lần nữa 11 và 5 không được sắp xếp, do đó hoán đổi lại
  5   	   11   	   12   	   13   	   6
- Ở đây, 5 ở đúng vị trí của nó
  Vượt qua thứ tư:
- Bây giờ, các phần tử có mặt trong mảng con được sắp xếp là 5, 11 và 12
- Di chuyển đến hai yếu tố tiếp theo 13 và 6
  5   	   11   	   12   	   13   	   6
- Rõ ràng, chúng không được sắp xếp, do đó thực hiện trao đổi giữa cả hai
  5   	   11   	   12   	   6   	   13
- Bây giờ, 6 nhỏ hơn 12, do đó, đổi chỗ một lần nữa
  5   	   11   	   6   	   12   	   13
- Ở đây, việc hoán đổi cũng làm cho 11 và 6 không được sắp xếp, do đó, hoán đổi lại
  5   	   6   	   11   	   12   	   13
- Cuối cùng, mảng được sắp xếp hoàn toàn.
# Phân tích độ phức tạp của sắp xếp chèn:
Độ phức tạp về thời gian của sắp xếp chèn
- Độ phức tạp thời gian trong trường hợp xấu nhất của sắp xếp Chèn là O(N^2)
- Độ phức tạp thời gian trường hợp trung bình của sắp xếp Chèn là O(N^2)
- Độ phức tạp thời gian của trường hợp tốt nhất là O(N) .
# Độ phức tạp không gian của sắp xếp chèn
- Độ phức tạp không gian phụ của Sắp xếp chèn là O(1)
# Đặc điểm của sắp xếp chèn
- Thuật toán này là một trong những thuật toán đơn giản nhất với cách thực hiện đơn giản
- Về cơ bản, sắp xếp chèn hiệu quả đối với các giá trị dữ liệu nhỏ
- Sắp xếp chèn có bản chất thích ứng, nghĩa là nó phù hợp với các tập dữ liệu đã được sắp xếp một phần.
