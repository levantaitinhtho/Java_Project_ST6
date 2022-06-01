--drop database Management
CREATE DATABASE Management
GO
USE Management;

--Tao ra bang tang 
GO
CREATE TABLE Tang(
	maTang nvarchar(10) NOT NULL,
	tenTang nvarchar(50) not null,
	soPhong int NULL,
	PRIMARY KEY (maTang)
 )

--Tao ra bang Phong
 GO
 CREATE TABLE Phong(
	maPhong nvarchar(10) NOT NULL,
	maTang nvarchar(10) NULL,
	tenPhong nvarchar(10) NULL,
	loaiPhong bit NULL,
	soNguoiHienTai int NULL,
	soNguoiToiDa int NULL,
	tinhTrangPhong nvarchar(50) NULL
 CONSTRAINT [PK_Phong] PRIMARY KEY (maPhong) 
)

--Tao ra bang Sinh Vien
go
CREATE TABLE SinhVien(
	maSV nvarchar(10) NOT NULL,
	maKTX nvarchar(10) NOT NULL,
	HoTen nvarchar(20) NULL,
	CMND nvarchar(10) NULL,
	gioiTinh bit NULL,
	ngaySinh date NULL,
	SDT nvarchar(15) NULL,
	queQuan nvarchar(100) NULL,
	ngayLamHopDong date NULL,
	maPhong nvarchar(10) NULL,
	Hinh nvarchar(100) NULL,
	hoTenGH nvarchar(50) NULL,
	sdtGH nvarchar(15) NULL,
	quanHe nvarchar(10) NULL,
	Nghenghiep nvarchar(100) NULL,
 CONSTRAINT  [PK_SV] PRIMARY KEY (maSV,maKTX)
)

--Tai bang quan ly cac Tai Khoan
go
CREATE TABLE Taikhoan(
	userName nvarchar(20) NOT NULL,
	Pass nvarchar(20) NULL,
	hoVaTen nvarchar(50) NULL,
	gioiTinh bit NULL,
	Quyen nvarchar(20) NULL,
	SDT nvarchar(15) NULL,
 CONSTRAINT [PK_Taikhoan] PRIMARY KEY (userName)
)

--Tao bang Dien nuoc
go
CREATE TABLE Diennuoc(
	maPhong nvarchar(10) NOT NULL,
	Thang date NOT NULL,
	CScudien int NULL,
	CSmoidien int NULL,
	CScunuoc int NULL,
	CSmoinuoc int NULL,
 CONSTRAINT [PK_Diennuoc] PRIMARY KEY (maPhong,Thang)
 )

--Thuc hien insert du lieu vao ban dien nuoc
 GO
INSERT Diennuoc (maPhong, Thang, CScudien, CSmoidien, CScunuoc, CSmoinuoc) 
VALUES  (N'MPA2', CAST(N'2017-06-14' AS Date), 100, 145, 15, 20),
		(N'MPA3', CAST(N'2017-06-16' AS Date), 100, 9999, 19, 18),
		(N'MPB1', CAST(N'2017-06-14' AS Date), 100, 120, 10, 12)

--Thuc hien insert du lieu vao bang Tang
GO
INSERT Tang (maTang, tenTang,soPhong) 
VALUES  (N'MT01', N'Tang 1',4),
		(N'MT02', N'Tang 2',4),
		(N'MT03', N'Tang 3',4)

--Thuc hien insert du lieeu vao bang Phong
GO
INSERT Phong (maPhong, maTang, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa)
VALUES  (N'MPA1', N'MT01', N'A101', 1, 5, 8),
		(N'MPA2', N'MT01', N'A102', 1, 7, 8),
		(N'MPA3', N'MT01', N'A103', 1, 6, 8),
		(N'MPA4', N'MT01', N'A104', 1, 4, 8),

		(N'MPB1', N'MT02', N'B101', 1, 7, 8),
		(N'MPB2', N'MT02', N'B102', 1, 8, 8),
		(N'MPB3', N'MT02', N'B103', 1, 4, 8),
		(N'MPB4', N'MT02', N'B104', 1, 7, 8), 

		(N'MPC1', N'MT03', N'C101', 1, 6, 8),
		(N'MPC2', N'MT03', N'C102', 0, 3, 8),
		(N'MPC3', N'MT03', N'C103', 0, 6, 8),
		(N'MPC4', N'MT03', N'C104', 0, 8, 8)

--Thuc hien insert du lieu vao bang Sinh Vien
GO
INSERT SinhVien (maSV, maKTX, HoTen , CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) 
VALUES  (N'MSV001', N'MKTX01', N'TRẦN THUẬN', N'2345678', 0, CAST(N'1996-01-05' AS Date), N'423424242', N'HUẾ', CAST(N'2017-06-12' AS Date),               N'MPA1', N'HÌNH 12', N'TRẦN VĂN ', N'111', N'CHA', N'GIÁO VIÊN'),
		(N'MSV002', N'MKTX02', N'PHẠMM LUẬN', N'2345678', 0, CAST(N'1997-01-05' AS Date), N'423424232', N'QUẢNG TRỊ', CAST(N'2017-06-12' AS Date),         N'MPA1', N'HÌNH 14', N'PHẠM THỊ ', N'114', N'MẸ', N'NÔNG'),
		(N'MSV003', N'MKTX02', N'PHÙNG ĐÌNH PHÁT', N'2345678', 0, CAST(N'1997-01-05' AS Date), N'423424232', N'QUẢNG TRỊ', CAST(N'2017-06-12' AS Date),         N'MPA1', N'HÌNH 14', N'NÔNG VĂN', N'114', N'MẸ', N'NÔNG'),
		(N'MSV004', N'MKTX02', N'HỮU QUANG', N'2345678', 0, CAST(N'1997-01-05' AS Date), N'423424232', N'QUẢNG TRỊ', CAST(N'2017-06-12' AS Date),          N'MPA1', N'HÌNH 14', N'ĐÀO ÁNH', N'114', N'MẸ', N'NÔNG'),


		(N'MSV005', N'MKTX03', N'NGUYÊN HUỆ', N'232456', 1, CAST(N'1996-02-12' AS Date), N'12345', N'HUẾ', CAST(N'2017-02-02' AS Date),                      N'MPA2', N'HÌNH 15', N'BÁCH KHOA', N'115', N'CHA', N'GIÁO VIÊN'),
		(N'MSV006', N'MKTX04', N'NGÔ TIẾN', N'455788667', 0, CAST(N'1997-04-03' AS Date), N'01635286957', N'QUẢNG BÌNH', CAST(N'2017-06-12' AS Date),        N'MPA2', N'HINH 1', N'NGÔ THANH', N'009', N'CHA', N'NÔNG'),
		(N'MSV007', N'MKTX04', N'NGÔ LÂM', N'455788667', 0, CAST(N'1997-04-15' AS Date), N'21635286957', N'QUẢNG BÌNH', CAST(N'2017-06-12' AS Date),         N'MPA2', N'HINH 1', N'NGÔ THANH', N'009', N'CHA', N'NÔNG'),
		(N'MSV008', N'MKTX04', N'NGÔ TÙNG', N'455788667', 0, CAST(N'1997-04-03' AS Date), N'03235286935', N'QUẢNG BÌNH', CAST(N'2017-06-12' AS Date),        N'MPA2', N'HINH 1', N'NGÔ THANH', N'009', N'CHA', N'NÔNG'),

		(N'MSV009', N'MKTX05', N'PHẠM DUY NHẤT', N'44234121', 0, CAST(N'1997-03-10' AS Date), N'4232323232', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),    N'MPA3', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),
		(N'MSV010', N'MKTX05', N'PHAN VĂN QUÂN', N'44234121', 0, CAST(N'1997-01-17' AS Date), N'8632323277', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),    N'MPA3', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),
		(N'MSV011', N'MKTX05', N'PHẠM DUY SƠN', N'44234121', 0, CAST(N'1997-05-10' AS Date), N'4232323232', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),     N'MPA3', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),
		(N'MSV012', N'MKTX05', N'ĐỖ HỮU HÒA', N'44234121', 0, CAST(N'1997-06-20' AS Date), N'8332323212', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),     N'MPA3', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),

		(N'MSV013', N'MKTX05', N'PHẠM DUY LÂM', N'44234121', 0, CAST(N'1997-01-10' AS Date), N'4232323645', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),    N'MPA4', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),
		(N'MSV014', N'MKTX05', N'PHẠM DUY ĐẠI', N'44234121', 0, CAST(N'1997-01-21' AS Date), N'4642323232', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),    N'MPA4', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),
		(N'MSV015', N'MKTX05', N'ĐỖ VĂN BỜ', N'44234121', 0, CAST(N'1997-01-18' AS Date), N'352323232', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),     N'MPA4', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),
		(N'MSV016', N'MKTX05', N'PHẠM DUY HIỆP', N'44234121', 0, CAST(N'1997-01-19' AS Date), N'7632323232', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date),     N'MPA4', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG'),

		(N'MSV017', N'MKTX06', N'DƯƠNG DƯƠNG', N'2344242', 1, CAST(N'1998-03-12' AS Date), N'3242342', N'HÀ NỘII', CAST(N'2017-06-12' AS Date),             N'MPB1', N'HÌNH 22', N'PHẠM THỊ THƯ', N'117', N'MẸ', N'GIÁO VIÊN'),
		(N'MSV018', N'MKTX07', N'NGUYỄN VĂN TÂM', N'24253535', 1, CAST(N'1996-03-25' AS Date), N'09784937222', N'HUẾ', CAST(N'2017-06-13' AS Date),         N'MPB1', N'HÌNH 23 ', N'NGUYỄN BÌNH', N'118', N'MẸ', N'CÔNG AN'),
		(N'MSV019', N'MKTX07', N'LƯƠNG VĂN HIỆP', N'24253535', 1, CAST(N'1996-03-07' AS Date), N'07784937222', N'HUẾ', CAST(N'2017-06-13' AS Date),        N'MPB1', N'HÌNH 23 ', N'NGUYỄN BÌNH', N'118', N'MẸ', N'CÔNG AN'),
		(N'MSV020', N'MKTX07', N'NGUYỄN VĂN TÙNG', N'24253535', 1, CAST(N'1996-03-17' AS Date), N'0578493775', N'HUẾ', CAST(N'2017-06-13' AS Date),        N'MPB1', N'HÌNH 23 ', N'NGUYỄN BÌNH', N'118', N'MẸ', N'CÔNG AN'),

		(N'MSV021', N'MKTX08', N'NGUYỄN HOÀI', N'372958390', 1, CAST(N'1997-04-04' AS Date), N'018375273522', N'QUẢNG NGÃI', CAST(N'2017-06-13' AS Date),  N'MPB2', N'HÌNH 26', N'TRẦN THỊ LY', N'119', N'MẸ', N'GIÁO VIÊN'),
		(N'MSV022', N'MKTX09', N'HỒ PHƯỚC DANH', N'232617286', 1, CAST(N'1997-03-09' AS Date), N'0167435', N'QUẢNG BÌNH', CAST(N'2017-06-13' AS Date),       N'MPB2', N'HÌNH 17', N'TRƯƠNG THƯ', N'120', N'MẸ', N'NÔNG'),
		(N'MSV023', N'MKTX09', N'TRƯƠNG VĂN PHƯỚC', N'232617286', 1, CAST(N'1997-03-09' AS Date), N'0167354364', N'QUẢNG BÌNH', CAST(N'2017-06-13' AS Date),      N'MPB2', N'HÌNH 17', N'TRƯƠNG THƯ', N'120', N'MẸ', N'NÔNG'),
		(N'MSV024', N'MKTX09', N'LÝ ĐỊNH THUẬN', N'232617286', 1, CAST(N'1997-03-09' AS Date), N'016754572', N'QUẢNG BÌNH', CAST(N'2017-06-13' AS Date),      N'MPB2', N'HÌNH 17', N'TRƯƠNG THƯ', N'120', N'MẸ', N'NÔNG'),

		(N'MSV025', N'MKTX10', N'PHẠM GIA HUY', N'121323', 1, CAST(N'1998-03-05' AS Date), N'182182676546', N'VŨNG TÀU', CAST(N'2017-06-13' AS Date),             N'MPB3', N'HÌH 4', N'PHẠM TÙNG', N'121', N'CHA', N'GIÁO VIÊN'),
		(N'MSV026', N'MKTX11', N'NGUYỄN HOÀI NAM', N'2342', 1, CAST(N'1997-04-06' AS Date), N'32424645756', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date),            N'MPB3', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN'),
		(N'MSV027', N'MKTX11', N'LÊ VĂN ĐỨC', N'2342', 1, CAST(N'1997-04-06' AS Date), N'3242434553', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date),            N'MPB3', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN'),
		(N'MSV028', N'MKTX11', N'NGUYỄN CÔNG LỘC', N'2342', 1, CAST(N'1997-04-06' AS Date), N'32424565732', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date),            N'MPB3', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN'),

		(N'MSV029', N'MKTX10', N'PHẠM GIA DŨNG', N'121323', 1, CAST(N'1998-03-05' AS Date), N'18218234573', N'VŨNG TÀU', CAST(N'2017-06-13' AS Date),             N'MPB4', N'HÌH 4', N'PHẠM TÙNG', N'121', N'CHA', N'GIÁO VIÊN'),
		(N'MSV030', N'MKTX11', N'NGUYỄN HOÀI HẢI', N'2342', 1, CAST(N'1997-04-07' AS Date), N'32424345347', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date),            N'MPB4', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN'),
		(N'MSV031', N'MKTX11', N'NÔNG VĂN THỊNH', N'2342', 1, CAST(N'1999-04-18' AS Date), N'3242445345', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date),            N'MPB4', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN'),
		(N'MSV032', N'MKTX11', N'DƯƠNG ĐÌNH PHƯỚC', N'2342', 1, CAST(N'1997-04-06' AS Date), N'3242498575', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date),            N'MPB4', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN'),

		(N'MSV033', N'MKTX13', N'BÁCH THỊ HOA', N'76565', 1, CAST(N'1997-03-06' AS Date), N'65658465676', N'NINH THUẬN', CAST(N'2017-06-14' AS Date),             N'MPC1', N'HÌNH 8', N'HẢI HẬU', N'123', N'CHA', N'BÁC SĨ'),
		(N'MSV034', N'MKTX15', N'PHÙNG THANH ĐỘ', N'4523', 1, CAST(N'1998-04-06' AS Date), N'452324567', N'BÌNH THẠNH', CAST(N'2017-06-14' AS Date),            N'MPC1', N'HÌNH 21', N'TRẦN TUẤN', N'124', N'CHUS', N'CHỦ TỊCH'),
		(N'MSV035', N'MKTX15', N'ĐỊNH HẢI QUỐC', N'4523', 1, CAST(N'2002-04-17' AS Date), N'4523265764', N'BÌNH THẠNH', CAST(N'2017-06-14' AS Date),          N'MPC1', N'HÌNH 21', N'TRẦN TUẤN', N'124', N'CHUS', N'CHỦ TỊCH'),
		(N'MSV036', N'MKTX15', N'PHÙNG THANH PHƯỚC', N'4523', 1, CAST(N'1998-04-06' AS Date), N'4523256757', N'BÌNH THẠNH', CAST(N'2017-06-14' AS Date),         N'MPC1', N'HÌNH 21', N'TRẦN TUẤN', N'124', N'CHUS', N'CHỦ TỊCH'),

		(N'MSV037', N'MKTX16', N'LÊ VĂN TÙNG', N'BKJBKB', 1, CAST(N'1999-05-05' AS Date), N'JBJKBKJB', N'QUẢNG BÌNH', CAST(N'2017-06-14' AS Date),          N'MPC2', N'HÌNH 27', N'VĂN TÀI', N'125', N'CHA', N'CA SĨ'),
		(N'MSV038', N'MKTX17', N'NGUYỄN KHANG', N'37291038', 1, CAST(N'1997-06-08' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),     N'MPC2', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),
		(N'MSV039', N'MKTX17', N'PHAN ANH LẬP', N'37291038', 1, CAST(N'1998-06-15' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),       N'MPC2', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),
		(N'MSV040', N'MKTX17', N'LẠI VĂN DUY', N'37291038', 1, CAST(N'1997-06-27' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),       N'MPC2', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),

		(N'MSV041', N'MKTX16', N'LÊ VĂN HOÀ', N'BKJBKB', 1, CAST(N'1999-05-04' AS Date), N'JBJKBKJB', N'QUẢNG BÌNH', CAST(N'2017-06-14' AS Date),          N'MPC3', N'HÌNH 27', N'VĂN TÀI', N'125', N'CHA', N'CA SĨ'),
		(N'MSV042', N'MKTX17', N'NGUYỄN ĐỊNH ', N'37291038', 1, CAST(N'2022-06-16' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),     N'MPC3', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),
		(N'MSV043', N'MKTX17', N'HUỲNH SƠN NAM', N'37291038', 1, CAST(N'1999-06-08' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),       N'MPC3', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),
		(N'MSV044', N'MKTX17', N'NGUYỄN TRẦN TIẾN', N'37291038', 1, CAST(N'1999-06-21' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),       N'MPC3', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),

		(N'MSV045', N'MKTX16', N'LÊ VĂN TRUNG', N'BKJBKB', 1, CAST(N'1999-05-16' AS Date), N'JBJKBKJB', N'QUẢNG BÌNH', CAST(N'2017-06-14' AS Date),          N'MPC4', N'HÌNH 27', N'VĂN TÀI', N'125', N'CHA', N'CA SĨ'),
		(N'MSV046', N'MKTX17', N'NGUYỄN BẢO', N'37291038', 1, CAST(N'2001-06-18' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),     N'MPC4', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),
		(N'MSV047', N'MKTX17', N'BÁCH TÙNG LA', N'37291038', 1, CAST(N'1997-06-16' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),       N'MPC4', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ'),
		(N'MSV048', N'MKTX17', N'NGUYỄN ĐẠT', N'37291038', 1, CAST(N'2003-06-26' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date),       N'MPC4', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ')


--Thuc hien insert bang Tai khoang
INSERT Taikhoan (userName, Pass, hoVaTen, gioiTinh, Quyen, SDT) 
VALUES (N'levantaitinhtho', N'123', N'Lê Văn Tài', 0, N'Admin', N'0386733025'),
		(N'HuynhHaiHau123', N'12345', N'Huỳnh Thị Hải Hậu', 0, N'Admin', N'0386733025'),
		(N'DoTanTu22@', N'25062002', N'Đỗ Tấn Từ', 0, N'Admin', N'0775543228'),
		(N'TranAnhTuan2002', N'077554', N'Trần Anh Tuấn', 0, N'Admin', N'0905733025'),
		(N'TuanLe123', N'123@tl', N'Lê Hoàng Anh Tuấn', 0, N'Admin', N'0386733025')

GO
ALTER TABLE Diennuoc  WITH CHECK ADD  CONSTRAINT [FK_Diennuoc_Phong] FOREIGN KEY(maPhong)
REFERENCES Phong (maPhong)


GO
ALTER TABLE Phong  WITH CHECK ADD  CONSTRAINT [FK_Tang_Phong] FOREIGN KEY(maTang)
REFERENCES Tang (maTang)

GO
ALTER TABLE SinhVien  WITH CHECK ADD  CONSTRAINT [FK_SV_Phong] FOREIGN KEY(maPhong)
REFERENCES Phong(maPhong)

CREATE TABLE Xe(
	maXe VARCHAR(50) NOT NULL PRIMARY KEY,
	maSV nvarchar(10) NOT NULL, 
	bienSo NVARCHAR(50) NOT NULL,
	ngayGui DATE,
)

INSERT INTO dbo.Xe
(
    maXe,
    maSV,
    bienSo,
    ngayGui
)
VALUES
('X003', N'MSV02', N'73B-XD5 326.79', GETDATE()),
('X004', N'MSV02', N'73B-XD5 326.79', GETDATE()),
('X001', N'MSV01', N'73B-XD5 326.78', GETDATE()),
('X002', N'MSV02', N'73B-XD5 326.79', GETDATE())
