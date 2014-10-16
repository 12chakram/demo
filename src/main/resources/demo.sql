
 CREATE TABLE items (
  `itemId` BIGINT NOT NULL AUTO_INCREMENT,
  `itemName` VARCHAR(45) NULL,
  `itemType` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `checkInDate` DATE NULL,
  `pmpDueDate` DATE NULL,
  PRIMARY KEY (`itemId`));
