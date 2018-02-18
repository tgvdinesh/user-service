-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema user_service
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `user_service`;

-- -----------------------------------------------------
-- Schema user_service
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `user_service`
  DEFAULT CHARACTER SET utf8;
USE `user_service`;

-- -----------------------------------------------------
-- Table `user_service`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_service`.`user`;

CREATE TABLE IF NOT EXISTS `user_service`.`user` (
  `user_id`       INT(11)     NOT NULL AUTO_INCREMENT,
  `first_name`    VARCHAR(45) NOT NULL,
  `last_name`     VARCHAR(45) NOT NULL,
  `email_address` VARCHAR(45) NOT NULL,
  `user_name`     VARCHAR(45) NOT NULL,
  `password`      VARCHAR(45) NOT NULL,
  `created_time`  TIMESTAMP   NULL     DEFAULT CURRENT_TIMESTAMP,
  `updated_time`  DATETIME    NULL     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`))
  ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `user_service`.`address`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_service`.`address`;

CREATE TABLE IF NOT EXISTS `user_service`.`address` (
  `address_id`      INT(11)     NOT NULL AUTO_INCREMENT,
  `city`            VARCHAR(45) NOT NULL,
  `country`         VARCHAR(45) NOT NULL,
  `zipcode`         INT(11)     NOT NULL,
  `primary_address` TINYINT(4)  NOT NULL DEFAULT '1',
  `address_desc`    VARCHAR(45) NOT NULL
  COMMENT 'Description about the address Eg: Home, Work, etc',
  `user_id`         INT(11)     NOT NULL,
  PRIMARY KEY (`address_id`, `user_id`),
  INDEX `fk_address_customer_idx` (`user_id` ASC),
  CONSTRAINT `fk_address_customer`
  FOREIGN KEY (`user_id`)
  REFERENCES `user_service`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `user_service`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_service`.`role`;

CREATE TABLE IF NOT EXISTS `user_service`.`role` (
  `role_id`   INT         NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`role_id`)
)
  ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `user_service`.`user_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user_service`.`user_role`;

CREATE TABLE IF NOT EXISTS `user_service`.`user_role` (
  `user_role_id` INT     NOT NULL AUTO_INCREMENT,
  `user_id`      INT(11) NOT NULL,
  `role_id`      INT     NOT NULL
  COMMENT 'Defines user and his roles',
  PRIMARY KEY (`user_role_id`),
  INDEX `fk_user_role_users1_idx` (`user_id` ASC),
  INDEX `fk_user_role_role1_idx` (`role_id` ASC),
  CONSTRAINT `fk_user_role_users1`
  FOREIGN KEY (`user_id`)
  REFERENCES `user_service`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_role_role1`
  FOREIGN KEY (`role_id`)
  REFERENCES `user_service`.`role` (`role_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
  ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `user_service`.`role`
-- -----------------------------------------------------
START TRANSACTION;
USE `user_service`;
INSERT INTO `user_service`.`role` (`role_id`, `role_name`) VALUES (1, 'USER');
INSERT INTO `user_service`.`role` (`role_id`, `role_name`) VALUES (2, 'ADMIN');

COMMIT;

