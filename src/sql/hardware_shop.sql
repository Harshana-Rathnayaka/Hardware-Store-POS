-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 08, 2019 at 07:20 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hardware_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `aid` int(50) NOT NULL,
  `username` varchar(80) NOT NULL,
  `password` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`aid`, `username`, `password`) VALUES
(1, 'test', 'test');

-- --------------------------------------------------------

--
-- Table structure for table `cashierlogin`
--

CREATE TABLE `cashierlogin` (
  `cid` int(50) NOT NULL,
  `username` varchar(80) NOT NULL,
  `password` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cashierlogin`
--

INSERT INTO `cashierlogin` (`cid`, `username`, `password`) VALUES
(1, 'test2', 'test2');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `Iid` int(20) NOT NULL,
  `itemname` varchar(80) NOT NULL,
  `itemtype` varchar(80) NOT NULL,
  `quantity` int(80) NOT NULL,
  `unitprice` varchar(80) NOT NULL,
  `dateentered` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`Iid`, `itemname`, `itemtype`, `quantity`, `unitprice`, `dateentered`) VALUES
(1, 'new', 'type', 60, '500', '06'),
(2, 'addingtest', 'testadd', 300, '2000', '26'),
(3, 'test', 'efewqfw', 52, 'wfwfw', 'wfwefwef'),
(4, 'item test', 'test', 12, '100', '');

-- --------------------------------------------------------

--
-- Table structure for table `reciepts`
--

CREATE TABLE `reciepts` (
  `Rid` int(20) NOT NULL,
  `casheirname` varchar(80) NOT NULL,
  `itemname` varchar(80) NOT NULL,
  `quantity` int(80) NOT NULL,
  `price` varchar(80) NOT NULL,
  `dateissued` varchar(80) NOT NULL,
  `total` varchar(80) NOT NULL,
  `balance` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reciepts`
--

INSERT INTO `reciepts` (`Rid`, `casheirname`, `itemname`, `quantity`, `price`, `dateissued`, `total`, `balance`) VALUES
(1, 'Username', 'namr', 60, '700', '2019:01:07', '42000.00 LKR', '8000.00 LKR'),
(2, 'test2', 'itemname', 50, '20', 'date', '1000.00 LKR', '1000.00 LKR'),
(3, 'test2', 'efefef', 343, '3434', 'date', '1177862.00 LKR', '-1132328.00 LKR'),
(4, '', '6 inch nails', 100, '10', '2019:01:08', '1000.00 LKR', '0.00 LKR'),
(5, 'test2', 'test new', 10, '150', '2019:10:08', '1500.00 LKR', '500.00 LKR'),
(6, 'test2', 'another test', 4, '100', '2019:10:08', '400.00 LKR', '100.00 LKR'),
(7, 'test2', 'addingtest', 2, '2000', '2019:10:08', '4000.00 LKR', '1000.00 LKR'),
(8, 'test2', 'test', 1, '800', '2019:10:08', '800.00 LKR', '200.00 LKR'),
(9, 'test2', 'yes', 2, '240', '2019:10:08', '480.00 LKR', '20.00 LKR'),
(10, 'test2', 'hv', 6, '30', '2019:10:08', '180.00 LKR', '20.00 LKR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`aid`);

--
-- Indexes for table `cashierlogin`
--
ALTER TABLE `cashierlogin`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`Iid`);

--
-- Indexes for table `reciepts`
--
ALTER TABLE `reciepts`
  ADD PRIMARY KEY (`Rid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adminlogin`
--
ALTER TABLE `adminlogin`
  MODIFY `aid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cashierlogin`
--
ALTER TABLE `cashierlogin`
  MODIFY `cid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `Iid` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `reciepts`
--
ALTER TABLE `reciepts`
  MODIFY `Rid` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
