package com.example.inventoryservice.model.bean;

import lombok.*;

import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InventoryList{
    List<InventoryItem> inventoryItemList;
}
