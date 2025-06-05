CREATE TABLE IF NOT EXISTS `users` (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  full_name VARCHAR(255),
  email VARCHAR(255),
  phone_number VARCHAR(20),
  age VARCHAR(10),
  gender VARCHAR(10),
  address VARCHAR(255),
  user_name VARCHAR(100) NOT NULL UNIQUE,
  password VARCHAR(255),
  role VARCHAR(50),

  created_at DATETIME,
  updated_at DATETIME,
  created_by VARCHAR(100),
  updated_by VARCHAR(100)
);