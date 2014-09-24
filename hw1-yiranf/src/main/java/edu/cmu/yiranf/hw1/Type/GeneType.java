

/* First created by JCasGen Wed Sep 24 12:58:45 EDT 2014 */
package edu.cmu.yiranf.hw1.Type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 24 12:58:45 EDT 2014
 * XML source: /Users/fyr/Documents/workspace/hw1-yiranf/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GeneType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneType.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets 
   * @generated
   * @return value of the feature 
   */
  public String getToken() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "edu.cmu.yiranf.hw1.Type.GeneType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneType_Type)jcasType).casFeatCode_token);}
    
  /** setter for token - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToken(String v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_token == null)
      jcasType.jcas.throwFeatMissing("token", "edu.cmu.yiranf.hw1.Type.GeneType");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneType_Type)jcasType).casFeatCode_token, v);}    
   
    
  //*--------------*
  //* Feature: st

  /** getter for st - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSt() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_st == null)
      jcasType.jcas.throwFeatMissing("st", "edu.cmu.yiranf.hw1.Type.GeneType");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_st);}
    
  /** setter for st - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSt(int v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_st == null)
      jcasType.jcas.throwFeatMissing("st", "edu.cmu.yiranf.hw1.Type.GeneType");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_st, v);}    
   
    
  //*--------------*
  //* Feature: ed

  /** getter for ed - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEd() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_ed == null)
      jcasType.jcas.throwFeatMissing("ed", "edu.cmu.yiranf.hw1.Type.GeneType");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_ed);}
    
  /** setter for ed - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEd(int v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_ed == null)
      jcasType.jcas.throwFeatMissing("ed", "edu.cmu.yiranf.hw1.Type.GeneType");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_ed, v);}    
  }

    