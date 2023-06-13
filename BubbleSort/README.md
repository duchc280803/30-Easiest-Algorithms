- Sắp xếp nổi bọt ? 
là thuật toán sắp xếp đơn giản nhất hoạt động bằng cách hoán đổi liên tục các phần tử liền kề nếu chúng sắp xếp sai thứ tự. Thuật toán này không phù hợp với các tập dữ liệu lớn vì độ phức tạp thời gian trung bình và trường hợp xấu nhất của nó là khá cao.
# Thuật toán sắp xếp nổi bọt
Trong thuật toán này
- đi qua từ bên trái và so sánh các phần tử liền kề và phần tử cao hơn được đặt ở bên phải.
- Theo cách này, phần tử lớn nhất được di chuyển đến đầu ngoài cùng bên phải lúc đầu.
- Quá trình này sau đó được tiếp tục để tìm lớn thứ hai và đặt nó, v.v. cho đến khi dữ liệu được sắp xếp. 
# Sắp xếp bong bóng nổi bọt như thế nào?
Hãy cho chúng tôi hiểu hoạt động của sắp xếp bong bóng với sự trợ giúp của hình minh họa sau:
Dữ liệu vào: mảng[] = {6, 3, 0, 5}
Đầu tiên vượt qua:
Phần tử lớn nhất được đặt vào đúng vị trí của nó, tức là cuối mảng.
Vượt qua thứ hai:
Đặt phần tử lớn thứ hai vào đúng vị trí
Vượt qua thứ ba:
Đặt hai phần tử còn lại vào đúng vị trí của chúng.
# Phân tích độ phức tạp của sắp xếp bong bóng :
Độ phức tạp thời gian: O(N 2 )
Không gian phụ: O(1)
# Ưu điểm của Sắp xếp bong bóng:
- Sắp xếp bong bóng rất dễ hiểu và dễ thực hiện.
- Nó không yêu cầu bất kỳ không gian bộ nhớ bổ sung nào.
- Đây là một thuật toán sắp xếp ổn định, nghĩa là các phần tử có cùng giá trị khóa sẽ duy trì thứ tự tương đối của chúng trong đầu ra được sắp xếp.
# Nhược điểm của Sắp xếp bong bóng:
- Sắp xếp bong bóng có độ phức tạp về thời gian là O(N 2 ) nên rất chậm đối với các tập dữ liệu lớn.
- Sắp xếp bong bóng là thuật toán sắp xếp dựa trên so sánh, nghĩa là nó yêu cầu toán tử so sánh xác định thứ tự tương đối của các phần tử trong tập dữ liệu đầu vào. Nó có thể hạn chế hiệu quả của thuật toán trong một số trường hợp nhất định.