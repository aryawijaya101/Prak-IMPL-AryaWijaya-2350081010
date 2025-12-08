-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Des 2025 pada 05.01
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_akademik`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `course`
--

CREATE TABLE `course` (
  `course_id` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `code` varchar(20) NOT NULL,
  `department_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `course`
--

INSERT INTO `course` (`course_id`, `name`, `code`, `department_id`) VALUES
('CRS001', 'Database Systems', 'CS301', 'DEPT001'),
('CRS002', 'Data Structures', 'CS201', 'DEPT001'),
('CRS003', 'Linear Algebra', 'MTH202', 'DEPT002'),
('CRS004', 'Calculus I', 'MTH101', 'DEPT002'),
('CRS005', 'Quantum Physics', 'PHY401', 'DEPT003'),
('CRS006', 'Classical Mechanics', 'PHY201', 'DEPT003'),
('CRS007', 'Organic Chemistry', 'CHM301', 'DEPT004'),
('CRS008', 'Web Programming', 'CS302', 'DEPT001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `department`
--

CREATE TABLE `department` (
  `department_id` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `student_id` varchar(20) DEFAULT NULL,
  `faculty_id` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `department`
--

INSERT INTO `department` (`department_id`, `name`, `student_id`, `faculty_id`) VALUES
('DEPT001', 'Computer Science', NULL, NULL),
('DEPT002', 'Mathematics', NULL, NULL),
('DEPT003', 'Physics', NULL, NULL),
('DEPT004', 'Chemistry', NULL, NULL),
('DEPT005', 'Biology', NULL, NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `enrollment`
--

CREATE TABLE `enrollment` (
  `enrollment_id` int(11) NOT NULL,
  `student_id` varchar(20) NOT NULL,
  `course_id` varchar(20) NOT NULL,
  `grade` varchar(2) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `year` year(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `enrollment`
--

INSERT INTO `enrollment` (`enrollment_id`, `student_id`, `course_id`, `grade`, `semester`, `year`) VALUES
(1, 'STU001', 'CRS001', 'A', 'Fall', '2024'),
(2, 'STU001', 'CRS002', 'B+', 'Fall', '2024'),
(3, 'STU002', 'CRS001', 'A-', 'Fall', '2024'),
(4, 'STU002', 'CRS008', 'A', 'Fall', '2024'),
(5, 'STU003', 'CRS003', 'B', 'Fall', '2024'),
(6, 'STU003', 'CRS004', 'A', 'Fall', '2024'),
(7, 'STU004', 'CRS005', 'B+', 'Fall', '2024'),
(8, 'STU005', 'CRS001', 'A', 'Fall', '2024'),
(9, 'STU005', 'CRS002', 'A-', 'Fall', '2024');

-- --------------------------------------------------------

--
-- Struktur dari tabel `faculty`
--

CREATE TABLE `faculty` (
  `faculty_id` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `gender` enum('Male','Female','Other') NOT NULL,
  `date_of_birth` date NOT NULL,
  `salary` decimal(15,2) DEFAULT NULL,
  `designation` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `faculty`
--

INSERT INTO `faculty` (`faculty_id`, `name`, `gender`, `date_of_birth`, `salary`, `designation`) VALUES
('FAC001', 'Dr. Robert Anderson', 'Male', '1975-03-12', 15000000.00, 'Professor'),
('FAC002', 'Dr. Emily Williams', 'Female', '1980-06-18', 12000000.00, 'Associate Professor'),
('FAC003', 'Dr. David Lee', 'Male', '1982-09-25', 11000000.00, 'Assistant Professor'),
('FAC004', 'Dr. Maria Garcia', 'Female', '1978-11-30', 13000000.00, 'Professor'),
('FAC005', 'Dr. James Wilson', 'Male', '1985-02-14', 10000000.00, 'Lecturer');

-- --------------------------------------------------------

--
-- Struktur dari tabel `project_participation`
--

CREATE TABLE `project_participation` (
  `participation_id` int(11) NOT NULL,
  `faculty_id` varchar(20) NOT NULL,
  `project_id` varchar(20) NOT NULL,
  `role` varchar(50) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `hours_per_week` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `project_participation`
--

INSERT INTO `project_participation` (`participation_id`, `faculty_id`, `project_id`, `role`, `start_date`, `hours_per_week`) VALUES
(1, 'FAC001', 'PRJ001', 'Principal Investigator', '2023-01-15', 20),
(2, 'FAC002', 'PRJ001', 'Co-Investigator', '2023-01-15', 15),
(3, 'FAC003', 'PRJ002', 'Principal Investigator', '2023-03-01', 25),
(4, 'FAC004', 'PRJ004', 'Principal Investigator', '2023-06-01', 20),
(5, 'FAC005', 'PRJ003', 'Research Assistant', '2023-02-15', 30),
(6, 'FAC001', 'PRJ005', 'Co-Investigator', '2023-09-01', 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `research_project`
--

CREATE TABLE `research_project` (
  `project_id` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `no_attribute` int(11) DEFAULT NULL,
  `area` varchar(100) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL COMMENT 'Duration in months'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `research_project`
--

INSERT INTO `research_project` (`project_id`, `name`, `no_attribute`, `area`, `duration`) VALUES
('PRJ001', 'AI in Healthcare', 5, 'Artificial Intelligence', 24),
('PRJ002', 'Quantum Computing Research', 8, 'Quantum Physics', 36),
('PRJ003', 'Big Data Analytics', 6, 'Data Science', 18),
('PRJ004', 'Renewable Energy Systems', 7, 'Energy', 30),
('PRJ005', 'Machine Learning for Climate', 9, 'Machine Learning', 24);

-- --------------------------------------------------------

--
-- Struktur dari tabel `student`
--

CREATE TABLE `student` (
  `student_id` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `gender` enum('Male','Female','Other') NOT NULL,
  `date_of_birth` date NOT NULL,
  `house_number` varchar(20) DEFAULT NULL,
  `street_number` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `town` varchar(50) DEFAULT NULL,
  `department_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `student`
--

INSERT INTO `student` (`student_id`, `name`, `phone_number`, `gender`, `date_of_birth`, `house_number`, `street_number`, `city`, `town`, `department_id`) VALUES
('STU001', 'John Doe', '081234567890', 'Male', '2002-05-15', '12A', 'Jl. Merdeka', 'Bandung', 'Coblong', 'DEPT001'),
('STU002', 'Jane Smith', '081234567891', 'Female', '2003-08-20', '45B', 'Jl. Asia Afrika', 'Bandung', 'Sumur Bandung', 'DEPT001'),
('STU003', 'Ahmad Ibrahim', '081234567892', 'Male', '2002-12-10', '78C', 'Jl. Dago', 'Bandung', 'Dago', 'DEPT002'),
('STU004', 'Sarah Johnson', '081234567893', 'Female', '2003-03-25', '23D', 'Jl. Braga', 'Bandung', 'Braga', 'DEPT003'),
('STU005', 'Michael Chen', '081234567894', 'Male', '2002-07-18', '56E', 'Jl. Cihampelas', 'Bandung', 'Cipaganti', 'DEPT001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `teaching`
--

CREATE TABLE `teaching` (
  `teaching_id` int(11) NOT NULL,
  `faculty_id` varchar(20) NOT NULL,
  `course_id` varchar(20) NOT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `year` year(4) DEFAULT NULL,
  `section` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data untuk tabel `teaching`
--

INSERT INTO `teaching` (`teaching_id`, `faculty_id`, `course_id`, `semester`, `year`, `section`) VALUES
(1, 'FAC001', 'CRS001', 'Fall', '2024', 'A'),
(2, 'FAC001', 'CRS002', 'Fall', '2024', 'B'),
(3, 'FAC002', 'CRS003', 'Fall', '2024', 'A'),
(4, 'FAC003', 'CRS005', 'Fall', '2024', 'A'),
(5, 'FAC004', 'CRS007', 'Fall', '2024', 'A'),
(6, 'FAC005', 'CRS008', 'Fall', '2024', 'A'),
(7, 'FAC002', 'CRS004', 'Fall', '2024', 'B');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`),
  ADD UNIQUE KEY `code` (`code`),
  ADD KEY `fk_course_department` (`department_id`);

--
-- Indeks untuk tabel `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_id`);

--
-- Indeks untuk tabel `enrollment`
--
ALTER TABLE `enrollment`
  ADD PRIMARY KEY (`enrollment_id`),
  ADD KEY `fk_enrollment_student` (`student_id`),
  ADD KEY `fk_enrollment_course` (`course_id`);

--
-- Indeks untuk tabel `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`faculty_id`);

--
-- Indeks untuk tabel `project_participation`
--
ALTER TABLE `project_participation`
  ADD PRIMARY KEY (`participation_id`),
  ADD KEY `fk_participation_faculty` (`faculty_id`),
  ADD KEY `fk_participation_project` (`project_id`);

--
-- Indeks untuk tabel `research_project`
--
ALTER TABLE `research_project`
  ADD PRIMARY KEY (`project_id`);

--
-- Indeks untuk tabel `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`student_id`),
  ADD KEY `fk_student_department` (`department_id`);

--
-- Indeks untuk tabel `teaching`
--
ALTER TABLE `teaching`
  ADD PRIMARY KEY (`teaching_id`),
  ADD KEY `fk_teaching_faculty` (`faculty_id`),
  ADD KEY `fk_teaching_course` (`course_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `enrollment`
--
ALTER TABLE `enrollment`
  MODIFY `enrollment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `project_participation`
--
ALTER TABLE `project_participation`
  MODIFY `participation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `teaching`
--
ALTER TABLE `teaching`
  MODIFY `teaching_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `fk_course_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `enrollment`
--
ALTER TABLE `enrollment`
  ADD CONSTRAINT `fk_enrollment_course` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_enrollment_student` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `project_participation`
--
ALTER TABLE `project_participation`
  ADD CONSTRAINT `fk_participation_faculty` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`faculty_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_participation_project` FOREIGN KEY (`project_id`) REFERENCES `research_project` (`project_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `fk_student_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `teaching`
--
ALTER TABLE `teaching`
  ADD CONSTRAINT `fk_teaching_course` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_teaching_faculty` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`faculty_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
