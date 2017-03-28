/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package gov.sp.health.bean;

import gov.sp.health.facade.*;
import java.io.*;
import javax.ejb.EJB;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Buddhika
 */
@Named
@RequestScoped
public class MsExcelManager implements Serializable {

    /**
     *
     * EJBs
     *
     */
    /**
     *
     * Values of Excel Columns
     *
     */
    int itemCategoryCol;
    int whareHouseCol;
    int srNoCol;
    int levelCol;
    int vtmCol;
    int atmCol;
    int vmpCol;
    int ampCol;
    int amppCol;
    int vmppCol;
    int issueUnitCol;
    int strengthOfIssueUnitCol;
    int strengthUnitCol;
    int issueUnitsPerPackCol;
    int packUnitCol;
    int startRow;
    /**
     * DataModals
     *
     */

    /**
     *
     * Uploading File
     *
     */
    private UploadedFile file;

    /**
     * Creates a new instance of DemographyExcelManager
     */
    public MsExcelManager() {
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public int getWhareHouseCol() {
        return whareHouseCol;
    }

    public void setWhareHouseCol(int whareHouseCol) {
        this.whareHouseCol = whareHouseCol;
    }

    public int getSrNoCol() {
        return srNoCol;
    }

    public void setSrNoCol(int srNoCol) {
        this.srNoCol = srNoCol;
    }

    public int getLevelCol() {
        return levelCol;
    }

    public void setLevelCol(int levelCol) {
        this.levelCol = levelCol;
    }

   

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getAmpCol() {
        return ampCol;
    }

    public void setAmpCol(int ampCol) {
        this.ampCol = ampCol;
    }

  
    public int getAmppCol() {
        return amppCol;
    }

    public void setAmppCol(int amppCol) {
        this.amppCol = amppCol;
    }

    
    public int getAtmCol() {
        return atmCol;
    }

    public void setAtmCol(int atmCol) {
        this.atmCol = atmCol;
    }

    public int getIssueUnitCol() {
        return issueUnitCol;
    }

    public void setIssueUnitCol(int issueUnitCol) {
        this.issueUnitCol = issueUnitCol;
    }

    public int getIssueUnitsPerPackCol() {
        return issueUnitsPerPackCol;
    }

    public void setIssueUnitsPerPackCol(int issueUnitsPerPackCol) {
        this.issueUnitsPerPackCol = issueUnitsPerPackCol;
    }

    public int getItemCategoryCol() {
        return itemCategoryCol;
    }

    public void setItemCategoryCol(int itemCategoryCol) {
        this.itemCategoryCol = itemCategoryCol;
    }

    public int getPackUnitCol() {
        return packUnitCol;
    }

    public void setPackUnitCol(int packUnitCol) {
        this.packUnitCol = packUnitCol;
    }

   

    public int getVmpCol() {
        return vmpCol;
    }

    public void setVmpCol(int vmpCol) {
        this.vmpCol = vmpCol;
    }


    public int getVmppCol() {
        return vmppCol;
    }

    public void setVmppCol(int vmppCol) {
        this.vmppCol = vmppCol;
    }


    public int getVtmCol() {
        return vtmCol;
    }

    public void setVtmCol(int vtmCol) {
        this.vtmCol = vtmCol;
    }
    
    

}
