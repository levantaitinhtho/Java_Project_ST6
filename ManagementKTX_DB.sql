CREATE DATABASE ManagementKTX
GO
USE ManagementKTX;
go
CREATE TABLE Khu(
	maKhu nvarchar(10) NOT NULL,
	tenKhu nvarchar(20) NULL,
 CONSTRAINT [PK_Khu_1] PRIMARY KEY (maKhu)
 )
 SELECT * FROM Khu
 GO
 CREATE TABLE Phong(
	maPhong nvarchar(10) NOT NULL,
	maKhu nvarchar(10) NULL,
	tenPhong nvarchar(10) NULL,
	loaiPhong bit NULL,
	soNguoiHienTai int NULL,
	soNguoiToiDa int NULL,
 CONSTRAINT [PK_Phong] PRIMARY KEY (maPhong) 
)
SELECT * FROM PHONG
go
CREATE TABLE SinhVien(
	maSV nvarchar(10) NOT NULL,
	maKTX nvarchar(10) NOT NULL,
	Ho nvarchar(20) NULL,
	Ten nvarchar(10) NULL,
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
SELECT * FROM TaiKhoan
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
 SELECT * FROM DienNuoc
 GO
INSERT Diennuoc (maPhong, Thang, CScudien, CSmoidien, CScunuoc, CSmoinuoc) VALUES (N'MPA2', CAST(N'2017-06-14' AS Date), 100, 145, 15, 20)
INSERT Diennuoc (maPhong, Thang, CScudien, CSmoidien, CScunuoc, CSmoinuoc) VALUES (N'MPA3', CAST(N'2017-06-16' AS Date), 100, 9999, 19, 18)
INSERT Diennuoc (maPhong, Thang, CScudien, CSmoidien, CScunuoc, CSmoinuoc) VALUES (N'MPB1', CAST(N'2017-06-14' AS Date), 100, 120, 10, 12)
GO
INSERT Khu (maKhu, tenKhu) VALUES (N'MKA', N'Khu A')
INSERT Khu (maKhu, tenKhu) VALUES (N'MKB', N'Khu B')
INSERT Khu (maKhu, tenKhu) VALUES (N'MKC', N'Khu C')
INSERT Khu (maKhu, tenKhu) VALUES (N'MKD', N'Khu D')
GO
INSERT Phong (maPhong, maKhu, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa) VALUES (N'MPA1.1', N'MKA', N'PhongA', 1, 2, 4)
INSERT Phong (maPhong, maKhu, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa) VALUES (N'MPA2', N'MKB', N'A2.2', 1, 2, 4)
INSERT Phong (maPhong, maKhu, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa) VALUES (N'MPA3', N'MKA', N'A3.1', 1, 0, 4)
INSERT Phong (maPhong, maKhu, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa) VALUES (N'MPA4', N'MKA', N'A4.1', 1, 0, 4)
INSERT Phong (maPhong, maKhu, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa) VALUES (N'MPB1', N'MKB', N'B1.1', 1, 3, 4)
INSERT Phong (maPhong, maKhu, tenPhong, loaiPhong, soNguoiHienTai, soNguoiToiDa) VALUES (N'MPC1', N'MKC', N'C1.1', 0, 0, 4)
GO
DELETE SinhVien
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MP14', N'MKTX14', N'LÊ', N'TÀI', N'665656', 1, CAST(N'1996-04-04' AS Date), N'86586586', N'THANH HÓA', CAST(N'2017-06-14' AS Date), N'MPA2', N'HÌNH 11', N'VŨ THANH', N'113', N'CHA', N'NHÂN VIÊN VỆ SINH')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV01', N'MKTX01', N'TRẦN', N'THUẬN', N'2345678', 0, CAST(N'1996-01-05' AS Date), N'423424242', N'HUẾ', CAST(N'2017-06-12' AS Date), N'MPA2', N'HÌNH 12', N'TRẦN VĂN ', N'111', N'CHA', N'GIÁO VIÊN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV02', N'MKTX02', N'PHẠMM', N'CHANH', N'2345678', 0, CAST(N'1997-01-05' AS Date), N'423424232', N'QUẢNG TRỊ', CAST(N'2017-06-12' AS Date), N'MPA3', N'HÌNH 14', N'PHẠM THỊ', N'114', N'MẸ', N'NÔNG')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV03', N'MKTX03', N'NGUYÊN', N'HUỆ', N'232456', 1, CAST(N'1996-02-12' AS Date), N'12345', N'HUẾ', CAST(N'2017-02-02' AS Date), N'MPA2', N'HÌNH 15', N'BÁCH KHOA', N'115', N'CHA', N'GIÁO VIÊN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV04', N'MKTX04', N'NGÔ', N'BẢO', N'455788667', 0, CAST(N'1997-04-03' AS Date), N'01635286957', N'QUẢNG BÌNH', CAST(N'2017-06-12' AS Date), N'MPB1', N'HINH 1', N'NGÔ THANH', N'009', N'CHA', N'NÔNG')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV05', N'MKTX05', N'PHẠM DUY', N'NHẤT', N'44234121', 0, CAST(N'1997-01-10' AS Date), N'4232323232', N'QUẢNG NGÃI', CAST(N'2017-06-12' AS Date), N'MPA4', N'HÌNH 2', N'PHẠM BIÊN', N'116', N'CHA', N'NÔNG')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV06', N'MKTX06', N'DƯƠNG', N'DƯƠNG', N'2344242', 1, CAST(N'1998-03-12' AS Date), N'3242342', N'HÀ NỘII', CAST(N'2017-06-12' AS Date), N'MPA4', N'HÌNH 22', N'PHẠM THỊ THƯ', N'117', N'MẸ', N'GIÁO VIÊN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV07', N'MKTX07', N'NGUYỄN VĂN', N'TÂM', N'24253535', 1, CAST(N'1996-03-05' AS Date), N'01784937222', N'HUẾ', CAST(N'2017-06-13' AS Date), N'MPB1', N'HÌNH 23 ', N'NGUYỄN BÌNH', N'118', N'MẸ', N'CÔNG AN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV08', N'MKTX08', N'NGUYỄN ', N'HOÀI', N'372958390', 1, CAST(N'1997-04-04' AS Date), N'018375273522', N'QUẢNG NGÃI', CAST(N'2017-06-13' AS Date), N'MPB1', N'HÌNH 26', N'TRẦN THỊ LY', N'119', N'MẸ', N'GIÁO VIÊN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV09', N'MKTX09', N'TRƯƠNG VĂN', N'DANH', N'232617286', 1, CAST(N'1997-03-09' AS Date), N'0167', N'QUẢNG BÌNH', CAST(N'2017-06-13' AS Date), N'MPA2', N'HÌNH 17', N'TRƯƠNG THƯ', N'120', N'MẸ', N'NÔNG')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV10', N'MKTX10', N'PHẠM GIA', N'HUY', N'121323', 1, CAST(N'1998-03-05' AS Date), N'182182', N'VŨNG TÀU', CAST(N'2017-06-13' AS Date), N'MPA3', N'HÌH 4', N'PHẠM TÙNG', N'121', N'CHA', N'GIÁO VIÊN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV11', N'MKTX11', N'NGUYỄN HOÀI', N'NAM', N'2342', 1, CAST(N'1997-04-06' AS Date), N'32424', N'KHÁNH HÒA', CAST(N'2017-06-13' AS Date), N'MPA3', N'HÌNH 5', N'NGUYỄN THỊ THU', N'122', N'MẸ', N'GIÁO VIÊN')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV13', N'MKTX13', N'BÁCH THỊ', N'HOA', N'76565', 1, CAST(N'1997-03-06' AS Date), N'65658', N'NINH THUẬN', CAST(N'2017-06-14' AS Date), N'MPB1', N'HÌNH 8', N'HẢI HẬU', N'123', N'CHA', N'BÁC SĨ')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV15', N'MKTX15', N'PHÙNG THANH', N'ĐỘ', N'4523', 1, CAST(N'1998-04-06' AS Date), N'45232', N'BÌNH THẠNH', CAST(N'2017-06-14' AS Date), N'MPB1', N'HÌNH 21', N'TRẦN TUẤN', N'124', N'CHUS', N'CHỦ TỊCH')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV16', N'MKTX16', N'LÊ VĂN', N'TÙNG', N'BKJBKB', 1, CAST(N'1999-05-05' AS Date), N'JBJKBKJB', N'QUẢNG BÌNH', CAST(N'2017-06-14' AS Date), N'MPB1', N'HÌNH 27', N'VĂN TÀI', N'125', N'CHA', N'CA SĨ')
INSERT SinhVien (maSV, maKTX, Ho, Ten, CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong, Hinh, hoTenGH, sdtGH, quanHe, Nghenghiep) VALUES (N'MSV17', N'MKTX17', N'NGUYỄN', N'KHANG', N'37291038', 1, CAST(N'1997-06-08' AS Date), N'01672965478', N'ĐIỆN BIÊN', CAST(N'2017-02-05' AS Date), N'MPA2', N'HÌNH 30', N'NGUYỄN CHÁNH', N'126', N'CHA', N'HỌA SĨ')
DELETE TaiKhoan
INSERT Taikhoan (userName, Pass, hoVaTen, gioiTinh, Quyen, SDT) VALUES (N'levantaitinhtho', N'123', N'Lê Văn Tài', 0, N'Admin', N'0386733025')


ALTER TABLE Diennuoc  WITH CHECK ADD  CONSTRAINT [FK_Diennuoc_Phong] FOREIGN KEY(maPhong)
REFERENCES Phong (maPhong)
GO
ALTER TABLE Diennuoc CHECK CONSTRAINT [FK_Diennuoc_Phong]
GO
ALTER TABLE Phong  WITH CHECK ADD  CONSTRAINT [FK_Phong_Khu] FOREIGN KEY(maKhu)
REFERENCES Khu (maKhu)
GO
ALTER TABLE Phong CHECK CONSTRAINT [FK_Phong_Khu]
GO
ALTER TABLE SinhVien  WITH CHECK ADD  CONSTRAINT [FK_SV_Phong] FOREIGN KEY(maPhong)
REFERENCES Phong (maPhong)
GO
ALTER TABLE SinhVien CHECK CONSTRAINT [FK_SV_Phong]
GO
SELECT * FROM SinhVien