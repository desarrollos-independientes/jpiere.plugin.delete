/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package jpiere.plugin.delete.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for JP_CustomDeleteProfileLine
 *  @author iDempiere (generated) 
 *  @version Release 3.1
 */
@SuppressWarnings("all")
public interface I_JP_CustomDeleteProfileLine 
{

    /** TableName=JP_CustomDeleteProfileLine */
    public static final String Table_Name = "JP_CustomDeleteProfileLine";

    /** AD_Table_ID=1000062 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Column_ID */
    public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

	/** Set Column.
	  * Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID);

	/** Get Column.
	  * Column in the table
	  */
	public int getAD_Column_ID();

	public org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException;

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name JP_CustomDeleteProfileLine_ID */
    public static final String COLUMNNAME_JP_CustomDeleteProfileLine_ID = "JP_CustomDeleteProfileLine_ID";

	/** Set Custom Delete Profile Line	  */
	public void setJP_CustomDeleteProfileLine_ID (int JP_CustomDeleteProfileLine_ID);

	/** Get Custom Delete Profile Line	  */
	public int getJP_CustomDeleteProfileLine_ID();

    /** Column name JP_CustomDeleteProfileLine_UU */
    public static final String COLUMNNAME_JP_CustomDeleteProfileLine_UU = "JP_CustomDeleteProfileLine_UU";

	/** Set JP_CustomDeleteProfileLine_UU	  */
	public void setJP_CustomDeleteProfileLine_UU (String JP_CustomDeleteProfileLine_UU);

	/** Get JP_CustomDeleteProfileLine_UU	  */
	public String getJP_CustomDeleteProfileLine_UU();

    /** Column name JP_CustomDeleteProfile_ID */
    public static final String COLUMNNAME_JP_CustomDeleteProfile_ID = "JP_CustomDeleteProfile_ID";

	/** Set Custom Delete Profile	  */
	public void setJP_CustomDeleteProfile_ID (int JP_CustomDeleteProfile_ID);

	/** Get Custom Delete Profile	  */
	public int getJP_CustomDeleteProfile_ID();

	public I_JP_CustomDeleteProfile getJP_CustomDeleteProfile() throws RuntimeException;

    /** Column name JP_ForeignKey_Value */
    public static final String COLUMNNAME_JP_ForeignKey_Value = "JP_ForeignKey_Value";

	/** Set Foreign Key ID	  */
	public void setJP_ForeignKey_Value (int JP_ForeignKey_Value);

	/** Get Foreign Key ID	  */
	public int getJP_ForeignKey_Value();

    /** Column name JP_TreatForeignKey */
    public static final String COLUMNNAME_JP_TreatForeignKey = "JP_TreatForeignKey";

	/** Set Treat of Foreign Key	  */
	public void setJP_TreatForeignKey (String JP_TreatForeignKey);

	/** Get Treat of Foreign Key	  */
	public String getJP_TreatForeignKey();

    /** Column name SeqNo */
    public static final String COLUMNNAME_SeqNo = "SeqNo";

	/** Set Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public void setSeqNo (int SeqNo);

	/** Get Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public int getSeqNo();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
