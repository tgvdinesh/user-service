-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema user_management
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema user_management
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `user_management` DEFAULT CHARACTER SET utf8 ;
USE `user_management` ;

-- -----------------------------------------------------
-- Table `user_management`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_management`.`user` ;

CREATE TABLE IF NOT EXISTS `user_management`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email_address` VARCHAR(45) NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `created_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `user_management`.`address`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_management`.`address` ;

CREATE TABLE IF NOT EXISTS `user_management`.`address` (
  `address_id` INT NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `zipcode` INT NOT NULL,
  `primary_address` TINYINT NOT NULL DEFAULT 1,
  `address_desc` VARCHAR(45) NOT NULL COMMENT 'Description about the address Eg: Home, Work, etc',
  `user_id` INT NOT NULL,
  PRIMARY KEY (`address_id`, `user_id`),
  INDEX `fk_address_customer_idx` (`user_id` ASC),
  CONSTRAINT `fk_address_customer`
    FOREIGN KEY (`user_id`)
    REFERENCES `user_management`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;