-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2024 at 04:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `id` int(5) NOT NULL,
  `name` varchar(15) NOT NULL,
  `fathername` varchar(15) NOT NULL,
  `mothername` varchar(15) NOT NULL,
  `address` varchar(20) NOT NULL,
  `contact` int(11) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `email` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL,
  `qualification` varchar(10) NOT NULL,
  `department` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `salary` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`id`, `name`, `fathername`, `mothername`, `address`, `contact`, `dob`, `email`, `password`, `qualification`, `department`, `role`, `salary`) VALUES
(14041, 'David', 'John', 'Alice', 'Green Cental', 986543432, '09-18-1991', 'david@uni.in', 'david123', 'masters', 'Computer Science', 'Head', 50000),
(14042, 'Monica', 'Dravid', 'Racheal', 'Green County', 987896543, '23-05-1998', 'monica@uni.in', 'monica123', 'phd', 'Electronics', 'Assistant Professor', 30000);

-- --------------------------------------------------------

--
-- Table structure for table `facultyleave`
--

CREATE TABLE `facultyleave` (
  `srno` int(5) NOT NULL,
  `name` varchar(15) NOT NULL,
  `id` int(6) NOT NULL,
  `department` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `date` varchar(25) NOT NULL,
  `days` int(5) NOT NULL,
  `reason` varchar(15) NOT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `facultyleave`
--

INSERT INTO `facultyleave` (`srno`, `name`, `id`, `department`, `role`, `date`, `days`, `reason`, `status`) VALUES
(1, 'David', 14041, 'Computer Science', 'Head', '19/08/2024-20/08/2024', 2, 'out of station', 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `srno` int(5) NOT NULL,
  `id` int(6) NOT NULL,
  `name` varchar(15) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `branch` varchar(20) NOT NULL,
  `course` varchar(20) NOT NULL,
  `semester` varchar(5) NOT NULL,
  `marksobt` float NOT NULL,
  `maxmarks` float NOT NULL,
  `percentage` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`srno`, `id`, `name`, `dob`, `branch`, `course`, `semester`, `marksobt`, `maxmarks`, `percentage`) VALUES
(1, 1011, 'Alice', '02-04-2000', 'Accounts', 'M.Com', '4th', 420, 500, 84);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `srno` int(5) NOT NULL,
  `id` int(6) NOT NULL,
  `name` varchar(15) NOT NULL,
  `totalSalary` float NOT NULL,
  `remarks` varchar(15) NOT NULL,
  `bonus` float(5,0) NOT NULL,
  `days` int(5) NOT NULL,
  `month` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`srno`, `id`, `name`, `totalSalary`, `remarks`, `bonus`, `days`, `month`) VALUES
(1, 14041, 'David', 1025000, 'good', 3, 20, 'March'),
(2, 14042, 'Monica', 21420, 'keep it up', 2, 21, 'February');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(6) NOT NULL,
  `name` varchar(15) NOT NULL,
  `fathername` varchar(15) NOT NULL,
  `mothername` varchar(15) NOT NULL,
  `address` varchar(20) NOT NULL,
  `email` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `contact` int(11) NOT NULL,
  `class10` decimal(5,0) NOT NULL,
  `class12` decimal(5,0) NOT NULL,
  `course` varchar(15) NOT NULL,
  `branch` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `fathername`, `mothername`, `address`, `email`, `password`, `dob`, `contact`, `class10`, `class12`, `course`, `branch`) VALUES
(1011, 'Alice', 'Jackson', 'Rosy', 'Model Town', 'alice@uni.in', 'alice123', '02-04-2000', 798543275, 89, 92, 'M.Com', 'Accounts'),
(1012, 'Smith', 'Jack', 'Emilie', 'Cenral Town', 'smith@uni.in', 'smith123', '08-09-2002', 987654567, 78, 82, 'B.Com', 'Business');

-- --------------------------------------------------------

--
-- Table structure for table `studentleave`
--

CREATE TABLE `studentleave` (
  `srno` int(5) NOT NULL,
  `name` varchar(15) NOT NULL,
  `id` int(6) NOT NULL,
  `course` varchar(15) NOT NULL,
  `department` varchar(15) NOT NULL,
  `days` int(5) NOT NULL,
  `date` varchar(25) NOT NULL,
  `reason` varchar(20) NOT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentleave`
--

INSERT INTO `studentleave` (`srno`, `name`, `id`, `course`, `department`, `days`, `date`, `reason`, `status`) VALUES
(1, 'Alice', 1011, 'M.Com', 'Accounts', 1, '22/08/2024', 'sick leave', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `facultyleave`
--
ALTER TABLE `facultyleave`
  ADD PRIMARY KEY (`srno`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`srno`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`srno`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentleave`
--
ALTER TABLE `studentleave`
  ADD PRIMARY KEY (`srno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14043;

--
-- AUTO_INCREMENT for table `facultyleave`
--
ALTER TABLE `facultyleave`
  MODIFY `srno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `srno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `salary`
--
ALTER TABLE `salary`
  MODIFY `srno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1013;

--
-- AUTO_INCREMENT for table `studentleave`
--
ALTER TABLE `studentleave`
  MODIFY `srno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
