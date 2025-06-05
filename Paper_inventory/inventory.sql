-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Jun 05, 2025 at 06:57 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `id` int(11) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  `billing_date` datetime NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `payment_status` varchar(50) DEFAULT NULL,
  `payment_method` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`id`, `order_id`, `billing_date`, `amount`, `payment_status`, `payment_method`) VALUES
(1, 1, '2025-06-03 00:19:23', 500.00, NULL, NULL),
(2, 2, '2025-06-03 00:28:33', 800.00, NULL, NULL),
(6, 6, '2025-06-03 07:48:36', 11.20, NULL, NULL),
(8, 8, '2025-06-03 08:12:50', 56.00, NULL, NULL),
(9, 9, '2025-06-03 11:59:52', 4.00, NULL, NULL),
(10, 10, '2025-06-03 12:11:29', 1.00, NULL, NULL),
(11, 11, '2025-06-03 12:34:49', 35.00, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `retailer_id` int(11) DEFAULT NULL,
  `order_date` datetime NOT NULL,
  `status` varchar(50) DEFAULT NULL,
  `total_amount` decimal(10,2) DEFAULT NULL,
  `billing_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `retailer_id`, `order_date`, `status`, `total_amount`, `billing_id`) VALUES
(1, 1, '2025-06-03 00:19:23', 'Pending', 500.00, 1),
(2, 3, '2025-06-03 00:28:33', 'Pending', 800.00, 2),
(6, 1, '2025-06-03 07:48:36', 'Pending', 11.20, 6),
(8, 3, '2025-06-03 08:12:50', 'Pending', 56.00, 8),
(9, 1, '2025-06-03 11:59:52', 'Pending', 4.00, 9),
(10, 1, '2025-06-03 12:11:29', 'Pending', 1.00, 10),
(11, 4, '2025-06-03 12:34:49', 'Pending', 35.00, 11);

-- --------------------------------------------------------

--
-- Table structure for table `order_items`
--

CREATE TABLE `order_items` (
  `id` int(11) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `unit_price` decimal(10,2) NOT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_items`
--

INSERT INTO `order_items` (`id`, `order_id`, `product_id`, `quantity`, `unit_price`, `subtotal`) VALUES
(1, 1, 1, 10, 10.00, 100.00),
(2, 1, 1, 20, 20.00, 400.00),
(3, 2, 5, 20, 20.00, 400.00),
(4, 2, 8, 20, 20.00, 400.00),
(8, 6, 1, 10, 1.12, 11.20),
(10, 8, 1, 5, 11.20, 56.00),
(11, 9, 3, 2, 2.00, 4.00),
(12, 10, 2, 1, 1.00, 1.00),
(13, 11, 2, 2, 1.00, 2.00),
(14, 11, 1, 3, 11.00, 33.00);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `unit_price` decimal(10,2) NOT NULL,
  `quantity_in_stock` int(11) NOT NULL,
  `created_at` datetime DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `product_name`, `unit_price`, `quantity_in_stock`, `created_at`, `updated_at`) VALUES
(1, 'Copier Paper / A4 Paper', 4600.00, 982, '2025-06-03 00:12:16', '2025-06-04 19:45:11'),
(2, 'Maplitho Paper', 220.00, 297, '2025-06-03 00:12:16', '2025-06-03 12:34:49'),
(3, 'Art Paper / Coated Paper', 280.00, 198, '2025-06-03 00:12:16', '2025-06-03 11:59:52'),
(4, 'Bond Paper', 300.00, 250, '2025-06-03 00:12:16', '2025-06-03 00:12:16'),
(5, 'Newsprint Paper', 180.00, 580, '2025-06-03 00:12:16', '2025-06-03 00:28:33'),
(6, 'Kraft Paper', 200.00, 350, '2025-06-03 00:12:16', '2025-06-03 00:12:16'),
(7, 'Duplex Board', 260.00, 260, '2025-06-03 00:12:16', '2025-06-04 19:43:12'),
(8, 'Thermal Paper', 120.00, 380, '2025-06-03 00:12:16', '2025-06-03 00:28:33'),
(9, 'Chromoboard / C2S Paper', 270.00, 210, '2025-06-03 00:12:16', '2025-06-04 19:35:48'),
(10, 'Ledger Paper', 240.00, 320, '2025-06-03 00:12:16', '2025-06-03 00:12:16'),
(11, 'Carbonless Paper (NCR Paper)', 290.00, 1250, '2025-06-03 00:12:16', '2025-06-04 19:45:11');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_orders`
--

CREATE TABLE `purchase_orders` (
  `id` int(11) NOT NULL,
  `order_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `purchase_orders`
--

INSERT INTO `purchase_orders` (`id`, `order_date`) VALUES
(1, '2025-06-04 00:00:00'),
(2, '2025-06-04 00:00:00'),
(3, '2025-06-04 00:00:00'),
(4, '2025-06-04 00:00:00'),
(5, '2025-06-04 00:00:00'),
(6, '2025-06-04 00:00:00'),
(7, '2025-06-04 00:00:00'),
(8, '2025-06-04 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order_items`
--

CREATE TABLE `purchase_order_items` (
  `id` int(11) NOT NULL,
  `purchase_order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `purchase_order_items`
--

INSERT INTO `purchase_order_items` (`id`, `purchase_order_id`, `product_id`, `quantity`) VALUES
(1, 1, 1, 20),
(2, 2, 1, 20),
(3, 7, 7, 10),
(4, 8, 1, 10),
(5, 8, 11, 10);

-- --------------------------------------------------------

--
-- Table structure for table `retailers`
--

CREATE TABLE `retailers` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `contact_name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `created_at` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `retailers`
--

INSERT INTO `retailers` (`id`, `name`, `contact_name`, `email`, `phone`, `address`, `created_at`) VALUES
(1, 'Distance3d_', 'Aditi', 'a240288@famt.ac.in', '9403509592', 'Ratnagiri', '2025-06-02 23:59:00'),
(2, 'QuickBuy', 'Priya Sharma', 'priya@quickbuy.com', '9123456789', '45 Link Road, Delhi', '2025-06-03 00:06:25'),
(3, 'ValueStore', 'Amit Patel', 'amit@valuestore.com', '9988776655', '78 MG Road, Pune', '2025-06-03 00:06:25'),
(4, 'RetailMart', 'John Smith', 'john@retailmart.com', '9876543210', '123 Market Street, Mumbai', '2025-06-03 00:06:25'),
(5, 'Stormy', 'aditi', 'aditibgmi13@gmail.com', '1234567890', 'Ratnagiri', '2025-06-03 12:33:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_id` (`order_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `retailer_id` (`retailer_id`),
  ADD KEY `fk_billing_id` (`billing_id`);

--
-- Indexes for table `order_items`
--
ALTER TABLE `order_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_id` (`order_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `purchase_orders`
--
ALTER TABLE `purchase_orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `purchase_order_items`
--
ALTER TABLE `purchase_order_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `purchase_order_id` (`purchase_order_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `retailers`
--
ALTER TABLE `retailers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `order_items`
--
ALTER TABLE `order_items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `purchase_orders`
--
ALTER TABLE `purchase_orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `purchase_order_items`
--
ALTER TABLE `purchase_order_items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `retailers`
--
ALTER TABLE `retailers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billing`
--
ALTER TABLE `billing`
  ADD CONSTRAINT `billing_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `fk_billing_id` FOREIGN KEY (`billing_id`) REFERENCES `billing` (`id`),
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`retailer_id`) REFERENCES `retailers` (`id`);

--
-- Constraints for table `order_items`
--
ALTER TABLE `order_items`
  ADD CONSTRAINT `order_items_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `order_items_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);

--
-- Constraints for table `purchase_order_items`
--
ALTER TABLE `purchase_order_items`
  ADD CONSTRAINT `purchase_order_items_ibfk_1` FOREIGN KEY (`purchase_order_id`) REFERENCES `purchase_orders` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `purchase_order_items_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
