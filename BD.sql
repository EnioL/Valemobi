CREATE SCHEMA IF NOT EXISTS `batch` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `batch` ;

CREATE TABLE IF NOT EXISTS `batch`.`tb_customer_account` (
  `id_customer` INT PRIMARY KEY,
  `cpf_cnpj` INT NULL,
  `nm_customer` TEXT(30) NULL,
  `is_active` BOOL NULL,  
  `vl_total` FLOAT NULL ) 
ENGINE = InnoDB;

