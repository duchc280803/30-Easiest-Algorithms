# QuickSort
- là một thuật toán sắp xếp dựa trên thuật toán Chia để trị chọn một phần tử làm trục và phân vùng mảng đã cho xung quanh trục
  đã chọn bằng cách đặt trục vào đúng vị trí của nó trong mảng được sắp xếp.
# QuickSort hoạt động như thế nào?
Quá trình quan trọng trong quickSort là một phân vùng() . Mục tiêu của các phân vùng là đặt trục (bất kỳ phần tử nào cũng có thể được chọn làm trục)
vào đúng vị trí của nó trong mảng đã sắp xếp và đặt tất cả các phần tử nhỏ hơn ở bên trái của trục và tất cả các phần tử lớn hơn ở bên phải của trục .
Phân vùng được thực hiện đệ quy ở mỗi bên của trục sau khi trục được đặt vào đúng vị trí của nó và điều này cuối cùng sắp xếp mảng.
# Lựa chọn Xoay:
- Luôn chọn phần tử đầu tiên làm trục .
- Luôn chọn phần tử cuối cùng làm trục (triển khai bên dưới)
- Chọn một yếu tố ngẫu nhiên làm trục .
- Chọn giữa làm trục.
# Thuật toán sắp xếp nhanh:
Logic rất đơn giản, chúng ta bắt đầu từ phần tử ngoài cùng bên trái và theo dõi chỉ số của các phần tử nhỏ hơn (hoặc bằng) là i .
Trong khi di chuyển ngang, nếu tìm thấy phần tử nhỏ hơn, chúng ta hoán đổi phần tử hiện tại bằng arr[i]. Mặt khác, chúng tôi bỏ qua phần tử hiện tại.
Xét: mảng[] = {10, 80, 30, 90, 40}.
- So sánh 10 với trục và vì nó nhỏ hơn trục nên sắp xếp nó theo chiều dọc.
- So sánh 80 với trục. Nó lớn hơn trục.
- So sánh 30 với trục. Nó ít hơn so với trục nên sắp xếp nó cho phù hợp.
- So sánh 90 với trục. Nó lớn hơn trục quay.
- Sắp xếp trục quay vào đúng vị trí của nó.
# Phân tích độ phức tạp của sắp xếp nhanh :
Thời gian phức tạp:
Trường hợp tốt nhất: \omega (N * nhật ký N)
Trường hợp trung bình: \Theta (N * logN)
Trường hợp xấu nhất: O(N 2 )
Không gian phụ: O(1) vì không sử dụng thêm không gian
# Ưu điểm của Sắp xếp nhanh:
- Nó là một thuật toán chia để trị giúp giải quyết vấn đề dễ dàng hơn.
- Nó hiệu quả trên các tập dữ liệu lớn.
- Nó có chi phí hoạt động thấp vì nó chỉ yêu cầu một lượng nhỏ bộ nhớ để hoạt động.
# Nhược điểm của Sắp xếp nhanh:
- Nó có độ phức tạp thời gian trong trường hợp xấu nhất là O(N 2 ), xảy ra khi trục được chọn kém.
- Nó không phải là một lựa chọn tốt cho các tập dữ liệu nhỏ.
- Nó không phải là một sắp xếp ổn định, nghĩa là nếu hai phần tử có cùng một khóa,
  thì thứ tự tương đối của chúng sẽ không được giữ nguyên trong đầu ra được sắp xếp trong trường hợp sắp xếp nhanh,
  vì ở đây chúng ta hoán đổi các phần tử theo vị trí của trục (không xét đến vị trí ban đầu của chúng). chức vụ).
