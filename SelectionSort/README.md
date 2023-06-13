# Sắp xếp chọn
- là một thuật toán sắp xếp đơn giản và hiệu quả, hoạt động bằng cách chọn lặp lại phần tử nhỏ nhất (hoặc lớn nhất) từ phần chưa sắp xếp của danh sách và di chuyển nó đến phần đã sắp xếp của danh sách.
# Thuật toán Sắp xếp Lựa chọn hoạt động như thế nào?
Hãy xem xét mảng sau đây làm ví dụ: arr[] = {64, 25, 12, 22, 11}
Đầu tiên vượt qua:
- Đối với vị trí đầu tiên trong mảng đã sắp xếp, toàn bộ mảng được duyệt tuần tự từ chỉ số 0 đến 4. Vị trí đầu tiên nơi 64 được lưu trữ hiện tại, sau khi duyệt qua toàn bộ mảng, rõ ràng 11 là giá trị thấp nhất.
- Do đó, hãy thay thế 64 bằng 11. Sau một lần lặp lại 11 , giá trị nhỏ nhất trong mảng, có xu hướng xuất hiện ở vị trí đầu tiên của danh sách đã sắp xếp.
- Thuật toán Sắp xếp Lựa chọn | Hoán đổi phần tử đầu tiên với phần tử tối thiểu trong mảng
  Vượt qua thứ hai:
- Đối với vị trí thứ hai, trong đó có 25, hãy duyệt lại phần còn lại của mảng theo cách tuần tự.
- Sau khi duyệt qua, chúng tôi thấy rằng 12 là giá trị thấp thứ hai trong mảng và nó sẽ xuất hiện ở vị trí thứ hai trong mảng, do đó hãy hoán đổi các giá trị này.
  Vượt qua thứ ba:
- Bây giờ, đối với vị trí thứ ba, trong đó 25 xuất hiện một lần nữa duyệt qua phần còn lại của mảng và tìm giá trị nhỏ thứ ba có trong mảng.
- Trong khi duyệt, 22 trở thành giá trị nhỏ thứ ba và nó sẽ xuất hiện ở vị trí thứ ba trong mảng, do đó hoán đổi 22 với phần tử có mặt ở vị trí thứ ba.
  Vượt qua thứ tư:
- Tương tự, đối với vị trí thứ tư, duyệt qua phần còn lại của mảng và tìm phần tử nhỏ thứ tư trong mảng
- Vì 25 là giá trị thấp thứ 4 nên nó sẽ đứng ở vị trí thứ tư.
  Vượt qua thứ năm:
- Cuối cùng, giá trị lớn nhất có trong mảng sẽ tự động được đặt ở vị trí cuối cùng trong mảng
- Mảng kết quả là mảng đã sắp xếp.
# Phân tích độ phức tạp của Sắp xếp lựa chọn
# Độ phức tạp về thời gian:
Độ phức tạp về thời gian của Sắp xếp lựa chọn là O(N 2 ) vì có hai vòng lặp lồng nhau:
- Một vòng lặp để chọn từng phần tử của Mảng = O(N)
- Một vòng lặp khác để so sánh phần tử đó với mọi phần tử Mảng khác = O(N)
- Do đó độ phức tạp tổng thể = O(N) * O(N) = O(N*N) = O(N 2 )
# Không gian phụ trợ:
- O(1) là bộ nhớ bổ sung duy nhất được sử dụng cho các biến tạm thời trong khi hoán đổi hai giá trị trong Mảng. Sắp xếp lựa chọn không bao giờ tạo ra nhiều hơn O(N) hoán đổi và có thể hữu ích khi việc ghi bộ nhớ tốn kém.
# Ưu điểm của thuật toán sắp xếp lựa chọn
- Đơn giản và dễ hiểu.
- Hoạt động tốt với các tập dữ liệu nhỏ.
# Nhược điểm của thuật toán sắp xếp lựa chọn
- Sắp xếp lựa chọn có độ phức tạp về thời gian là O(n^2) trong trường hợp xấu nhất và trung bình.
- Không hoạt động tốt trên các tập dữ liệu lớn.
- Không duy trì thứ tự tương đối của các mục có khóa bằng nhau, điều đó có nghĩa là nó không ổn định.
