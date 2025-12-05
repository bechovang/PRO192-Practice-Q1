# **PRO192 - Java OOP Practice Q1**  
**Bộ đề luyện thi thực hành Q1 - 5 Bài tập OOP cơ bản**

## 🎯 **Mục đích**
Bộ công cụ này giúp sinh viên luyện tập cho phần thi **Q1 (Practical Exam)** môn **PRO192 (Java OOP)** với 5 bài tập được thiết kế sát đề thi thực tế, bao gồm hệ thống tự động chấm điểm.

## 📚 **5 Bài tập trong bộ**

| # | Class | Mô tả ngắn | Điểm khó | Kỹ năng luyện tập |
|---|-------|------------|----------|-------------------|
| 1 | `Employee` | Quản lý nhân viên, tính lương thưởng | ⭐⭐⭐ | `toUpperCase()`, tính % |
| 2 | `Book` | Quản lý sách, giảm giá theo thể loại | ⭐⭐⭐⭐ | `equalsIgnoreCase()`, cắt chuỗi ngược |
| 3 | `Ticket` | Vé xem phim, tính giá VIP | ⭐⭐⭐ | `substring()`, cộng số |
| 4 | `Room` | Phòng khách sạn, tính giá theo diện tích | ⭐⭐ | `substring(0,3)`, điều kiện đơn giản |
| 5 | `Account` | Tài khoản ngân hàng, tính phí | ⭐⭐⭐⭐ | Boolean logic, chuẩn hóa tên |


## 🚀 **Cách sử dụng**

### **Cho sinh viên (luyện tập):**
1. **Chọn 1 bài** trong 5 thư mục
2. **Đọc `Question.txt`** để hiểu yêu cầu
3. **Tự viết code** vào file `.java` tương ứng
4. **Chạy `TestMain.java`** để kiểm tra kết quả
5. **So sánh** với file lời giải mẫu (nếu cần)

### **Cho giảng viên (tạo đề/chấm bài):**
1. **Sử dụng Prompt mẫu** để tạo đề mới
2. **Copy cấu trúc TestMain** để tạo auto-grader
3. **Điều chỉnh test cases** theo yêu cầu

## 🔧 **Công cụ hỗ trợ**

### **Prompt tạo đề tự động:**
```text
"Hãy đóng vai một trình tạo đề thi và chấm thi tự động cho môn Java OOP (PRO192). 
Tôi cần bạn tạo ra 2 file dựa trên mô tả đề bài dưới đây:

**Input Data (Đề bài):**
[Dán mô tả đề bài vào đây]

**Yêu cầu Output:**
1. **File 1 (Question.txt):** Đề bài bằng tiếng Anh chuẩn
2. **File 2 (TestMain.java):** Auto-grader với format INPUT→OUTPUT→EXPECTED
```

### **Template viết class nhanh:**
```java
public class ClassName {
    // 1. Attributes
    private type attr1;
    private type attr2;
    
    // 2. Constructors
    public ClassName() {}
    public ClassName(type attr1, type attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }
    
    // 3. Methods
    public returnType methodName() {
        // Logic here
    }
    
    public String toString() {
        return String.format("format", values);
    }
}
```

## 📊 **Hệ thống chấm điểm (Auto-grader)**
Mỗi bài có `TestMain.java` với các tính năng:
- ✅ **Format rõ ràng:** INPUT → OUTPUT → EXPECTED
- ✅ **Test cases đầy đủ:** 6-8 test/bài
- ✅ **Thông báo lỗi chi tiết:** Gợi ý sửa lỗi
- ✅ **Tính điểm tự động:** Tổng điểm 10.0
- ✅ **Xử lý edge cases:** null, rỗng, biên

**Ví dụ output TestMain:**
```
========== EMPLOYEE CLASS TEST ==========
Format: INPUT → OUTPUT → EXPECTED → RESULT

=== TEST 1: getTitle() - Lowercase first, uppercase rest ===
INPUT: new Book("Java", 100.0, "IT")
OUTPUT:   "jAVA"
EXPECTED: "jAVA"
RESULT: ✅ PASSED

TEST SUMMARY:
Passed: 6/6
Score: 10.0/10.0
🎉 EXCELLENT! All tests passed!
```

## 🎯 **Mục tiêu luyện tập**
Mỗi bài tập rèn luyện các kỹ năng cụ thể:

| Bài tập | Kỹ năng chính | Method quan trọng |
|---------|---------------|-------------------|
| Employee | Format chuỗi, tính % | `toUpperCase()`, `* 1.2` |
| Book | So sánh không phân biệt hoa thường | `equalsIgnoreCase()`, `substring()` |
| Ticket | Cắt chuỗi từ vị trí | `substring(2)`, `+ 50` |
| Room | Lấy phần đầu chuỗi | `substring(0,3)`, điều kiện `>` |
| Account | Xử lý boolean, chuẩn hóa tên | `isEmpty()`, `toLowerCase()` |

## ⚠️ **Lỗi thường gặp trong đề thi**
1. **Quên kiểm tra null/empty** → NullPointerException
2. **Nhầm lẫn `equals()` vs `equalsIgnoreCase()`**
3. **Không xử lý edge cases** (chuỗi ngắn, số 0)
4. **Format số sai** (`.2f` thay vì `.1f`)
5. **Không tái sử dụng method** trong toString()

## 🔄 **Quy trình luyện tập hiệu quả**
1. **Đọc kỹ đề** - Hiểu rõ yêu cầu
2. **Viết từng phần** - Attributes → Constructors → Methods
3. **Test thủ công** - Tạo vài đối tượng test
4. **Chạy auto-grader** - Xem điểm số
5. **Sửa lỗi** - Dựa trên gợi ý từ test
6. **So sánh với mẫu** - Học cách viết tốt hơn

## 📈 **Tiêu chí đánh giá (Rubric)**
- **Đúng logic (4 điểm):** Tính toán, điều kiện chính xác
- **Xử lý chuỗi (3 điểm):** Format đúng yêu cầu
- **OOP cơ bản (2 điểm):** Encapsulation, constructor
- **Code sạch (1 điểm):** Format, comment, tái sử dụng

## 🏆 **Mục tiêu cuối cùng**
- ✅ **Tự tin** làm bài thi Q1 trong 60-90 phút
- ✅ **Xử lý tốt** các dạng đề biến thể
- ✅ **Tránh được** các lỗi phổ biến
- ✅ **Đạt 8-10 điểm** cho phần thực hành

---
**"Practice makes perfect!"** - Luyện tập đều đặn với 5 bài này sẽ giúp bạn làm chủ phần thi Q1 môn PRO192. Chúc bạn học tập hiệu quả! 🚀

**Tags:** `#JavaOOP` `#PRO192` `#PracticeExam` `#AutoGrader` `#FPTU`
