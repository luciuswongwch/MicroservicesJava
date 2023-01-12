INSERT INTO `customer` (`customer_id`, `name`, `email`, `mobile_number`, `create_dt`)
 VALUES (1, 'customer1', 'customer1@luciuswong.com', '2361231234', CURDATE());

INSERT INTO `account` (`customer_id`, `account_number`, `account_type`, `branch_address`, `create_dt`)
 VALUES (1, 111111111, 'Savings', '123 Main Street, City A', CURDATE());