# Sắp xếp đếm ?
là một kỹ thuật sắp xếp dựa trên các khóa giữa một phạm vi cụ thể. Nó hoạt động bằng cách đếm số đối tượng có các giá trị khóa riêng biệt (một loại băm). Sau đó thực hiện một số phép toán số học để tính toán vị trí của từng đối tượng trong chuỗi đầu ra. 
# Thuật toán sắp xếp đếm hoạt động như thế nào?
- Để đơn giản, hãy xem xét dữ liệu trong phạm vi từ 0 đến 9.
- Dữ liệu đầu vào: {1, 4, 1, 2, 7, 5, 2}
- Lấy một mảng đếm để lưu trữ số lượng của từng đối tượng duy nhất.
- Bây giờ, lưu trữ số lượng của từng phần tử duy nhất trong mảng đếm
- Nếu bất kỳ phần tử nào lặp lại chính nó, chỉ cần tăng số lượng của nó.
- Ở đây, số lượng của từng phần tử duy nhất trong mảng đếm được hiển thị bên dưới:
  - Chỉ số:  0 1 2 3 4 5 6 7 8 9
  - Đếm: 0 2 2 0 1 1 0 1 0 0
- Sửa đổi mảng đếm sao cho mỗi phần tử tại mỗi chỉ mục lưu trữ tổng của các lần đếm trước đó.
  - Chỉ số:   0 1 2 3 4 5 6 7 8 9
  - Đếm:  0 2 4 4 5 6 6 7 7 7
- Mảng đếm được sửa đổi cho biết vị trí của từng đối tượng trong chuỗi đầu ra.
- Tìm chỉ số của từng phần tử của mảng ban đầu trong mảng đếm. Điều này mang lại số lượng tích lũy.
- Xoay mảng theo chiều kim đồng hồ một lần.
  - Chỉ số:   0 1 2 3 4 5 6 7 8 9
  - Đếm: 0 0 2 4 4 5 6 6 7 7
- Xuất từng đối tượng từ chuỗi đầu vào, sau đó tăng số lượng của nó lên 1.
- Xử lý dữ liệu đầu vào: {1, 4, 1, 2, 7, 5, 2}. Vị trí của 1 là 0.
- Đặt dữ liệu 1 tại chỉ số 0 trong đầu ra. Tăng số lượng lên 1 để đặt dữ liệu tiếp theo 1 tại chỉ mục 1 lớn hơn chỉ mục này.
- Sau khi đặt từng phần tử vào đúng vị trí của nó, hãy giảm số lượng của nó xuống một.
# Đặc điểm của sắp xếp đếm:
- Sắp xếp đếm đưa ra các giả định về dữ liệu, ví dụ: nó giả định rằng các giá trị sẽ nằm trong khoảng từ 0 đến 10 hoặc 10 – 99, v.v. Một số giả định khác về sắp xếp đếm đưa ra là dữ liệu đầu vào sẽ là số nguyên dương.
- Giống như các thuật toán khác, thuật toán sắp xếp này không phải là thuật toán dựa trên so sánh, nó băm giá trị trong một mảng đếm tạm thời và sử dụng chúng để sắp xếp.
- Nó sử dụng một mảng tạm thời làm cho nó trở thành một thuật toán Non-In Place .****
# Điểm quan trọng:
- Sắp xếp đếm hiệu quả nếu phạm vi dữ liệu đầu vào không lớn hơn đáng kể so với số lượng đối tượng được sắp xếp. Xem xét tình huống khi chuỗi đầu vào nằm trong khoảng từ 1 đến 10K và dữ liệu là 10, 5, 10K, 5K.
- Nó không phải là một phân loại dựa trên so sánh. Độ phức tạp thời gian chạy của nó là O(n) với không gian tỷ lệ thuận với phạm vi dữ liệu.
- Sắp xếp đếm có thể đạt được điều này bởi vì chúng tôi đang đưa ra các giả định về dữ liệu mà chúng tôi đang sắp xếp.
- Nó thường được sử dụng như một thói quen con cho một thuật toán sắp xếp khác như sắp xếp cơ số.
- Sắp xếp đếm sử dụng hàm băm một phần để đếm số lần xuất hiện của đối tượng dữ liệu trong O(1).
- Sắp xếp đếm cũng có thể được mở rộng để hoạt động cho các đầu vào âm.
- Sắp xếp đếm là một thuật toán ổn định . Nhưng nó có thể ổn định với một số thay đổi mã.