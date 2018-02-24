package com.example.buddy_000.magicpos.model;

/**
 * Created by buddy_000 on 25-02-2018.
 */

public interface Product {
    int getProductId();
    String getName();
    float getRate();
    int getUnit();
    long getBarcodeNo();
    String getCategory();
    float getDiscount();
    float getMaxRetailPrice();
    String getProductSellerCompany();
    int getTaxCategoryId();
    long getModificationTime();
    long getCreationTime();
}