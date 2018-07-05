-- MySQL Script generated by MySQL Workbench
-- 11/17/16 13:17:44
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema eleicao
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema eleicao
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `eleicao` DEFAULT CHARACTER SET utf8 ;
USE `eleicao` ;

-- -----------------------------------------------------
-- Table `eleicao`.`Estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Estado` (
  `id_estado` INT NOT NULL AUTO_INCREMENT,
  `nome_estado` VARCHAR(45) NOT NULL,
  `regiao_estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_estado`),
  UNIQUE INDEX `Nome_estado_UNIQUE` (`id_estado` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eleicao`.`Cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Cidade` (
  `id_cidade` INT NOT NULL AUTO_INCREMENT,
  `nome_cidade` VARCHAR(45) NOT NULL,
  `qtde_habitantes_cidade` VARCHAR(45) NOT NULL,
  `Estado_id_estado` INT NOT NULL,
  PRIMARY KEY (`id_cidade`),
  UNIQUE INDEX `Nome_cidade_UNIQUE` (`id_cidade` ASC),
  INDEX `fk_Cidade_Estado_idx` (`Estado_id_estado` ASC),
  CONSTRAINT `fk_Cidade_Estado`
    FOREIGN KEY (`Estado_id_estado`)
    REFERENCES `eleicao`.`Estado` (`id_estado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eleicao`.`Pessoas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Pessoas` (
  `nome_pessoas` VARCHAR(45) NOT NULL,
  `cpf_pessoas` INT NOT NULL,
  `titulo_de_eleitor_pessoas` INT NOT NULL,
  `idade_pessoas` INT NULL,
  `Cidade_id_cidade` INT NOT NULL,
  PRIMARY KEY (`titulo_de_eleitor_pessoas`),
  INDEX `fk_Pessoas_Cidade1_idx` (`Cidade_id_cidade` ASC),
  UNIQUE INDEX `cpf_pessoas_UNIQUE` (`cpf_pessoas` ASC),
  CONSTRAINT `fk_Pessoas_Cidade1`
    FOREIGN KEY (`Cidade_id_cidade`)
    REFERENCES `eleicao`.`Cidade` (`id_cidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eleicao`.`Partido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Partido` (
  `id_partido` INT NOT NULL AUTO_INCREMENT,
  `nome_partido` VARCHAR(45) NOT NULL,
  `nome_fundador_partido` VARCHAR(45) NOT NULL,
  `data_criacao_partido` VARCHAR(45) NOT NULL,
  UNIQUE INDEX `id_partido_UNIQUE` (`id_partido` ASC),
  PRIMARY KEY (`id_partido`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eleicao`.`Cargo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Cargo` (
  `id_cargo` INT NOT NULL AUTO_INCREMENT,
  `nome_cargo` VARCHAR(45) NOT NULL,
  `salario_cargo` DECIMAL(10,0) NOT NULL,
  PRIMARY KEY (`id_cargo`),
  UNIQUE INDEX `id_cargo_UNIQUE` (`id_cargo` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eleicao`.`Candidato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Candidato` (
  `Pessoas_cpf_pessoas` INT NOT NULL,
  `Partido_id_partido` INT NOT NULL,
  `Cargo_id_cargo` INT NOT NULL,
  INDEX `fk_Candidato_Partido1_idx` (`Partido_id_partido` ASC),
  INDEX `fk_Candidato_Cargo1_idx` (`Cargo_id_cargo` ASC),
  INDEX `fk_Candidato_Pessoas1_idx` (`Pessoas_cpf_pessoas` ASC),
  PRIMARY KEY (`Pessoas_cpf_pessoas`),
  UNIQUE INDEX `Pessoas_cpf_pessoas_UNIQUE` (`Pessoas_cpf_pessoas` ASC),
  CONSTRAINT `fk_Candidato_Partido1`
    FOREIGN KEY (`Partido_id_partido`)
    REFERENCES `eleicao`.`Partido` (`id_partido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Candidato_Cargo1`
    FOREIGN KEY (`Cargo_id_cargo`)
    REFERENCES `eleicao`.`Cargo` (`id_cargo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Candidato_Pessoas1`
    FOREIGN KEY (`Pessoas_cpf_pessoas`)
    REFERENCES `eleicao`.`Pessoas` (`cpf_pessoas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `eleicao`.`Voto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `eleicao`.`Voto` (
  `Candidato_Pessoas_cpf_pessoas` INT NOT NULL,
  `Pessoas_titulo_de_eleitor_pessoas` INT NOT NULL,
  INDEX `fk_table1_Candidato1_idx` (`Candidato_Pessoas_cpf_pessoas` ASC),
  INDEX `fk_Voto_Pessoas1_idx` (`Pessoas_titulo_de_eleitor_pessoas` ASC),
  UNIQUE INDEX `Pessoas_titulo_de_eleitor_pessoas_UNIQUE` (`Pessoas_titulo_de_eleitor_pessoas` ASC),
  CONSTRAINT `fk_table1_Candidato1`
    FOREIGN KEY (`Candidato_Pessoas_cpf_pessoas`)
    REFERENCES `eleicao`.`Candidato` (`Pessoas_cpf_pessoas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Voto_Pessoas1`
    FOREIGN KEY (`Pessoas_titulo_de_eleitor_pessoas`)
    REFERENCES `eleicao`.`Pessoas` (`titulo_de_eleitor_pessoas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
