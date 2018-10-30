package uniandes.mdd.aplicacion.blockchain.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlockchainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aplicacion'", "'{'", "','", "'TipoDato'", "'}'", "'SmartContract'", "'Entidad'", "'Operacion'", "'isUd='", "'('", "')'", "':'", "'return'", "'Estado'", "'true'", "'false'", "'ExpLog'", "'id'", "'var'", "'='", "'new'", "'Condicional'", "'tipoCondicional'", "'expresionlogica'", "'sentencias'", "'else'", "'ExpNum'", "'ExpRef'", "'ExpRel'", "'-'", "'.'", "'E'", "'e'", "'Map'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'+'", "'*'", "'/'", "'GET'", "'DELETE'", "'if'", "'STRING'", "'NUMERICO'", "'BOOLEAN'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBlockchainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlockchainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlockchainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlockchain.g"; }



     	private BlockchainGrammarAccess grammarAccess;

        public InternalBlockchainParser(TokenStream input, BlockchainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Aplicacion";
       	}

       	@Override
       	protected BlockchainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAplicacion"
    // InternalBlockchain.g:65:1: entryRuleAplicacion returns [EObject current=null] : iv_ruleAplicacion= ruleAplicacion EOF ;
    public final EObject entryRuleAplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAplicacion = null;


        try {
            // InternalBlockchain.g:65:51: (iv_ruleAplicacion= ruleAplicacion EOF )
            // InternalBlockchain.g:66:2: iv_ruleAplicacion= ruleAplicacion EOF
            {
             newCompositeNode(grammarAccess.getAplicacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAplicacion=ruleAplicacion();

            state._fsp--;

             current =iv_ruleAplicacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAplicacion"


    // $ANTLR start "ruleAplicacion"
    // InternalBlockchain.g:72:1: ruleAplicacion returns [EObject current=null] : ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' ) ;
    public final EObject ruleAplicacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_smartcontract_4_0 = null;

        EObject lv_smartcontract_6_0 = null;

        EObject lv_tipodato_8_0 = null;

        EObject lv_tipodato_10_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:78:2: ( ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' ) )
            // InternalBlockchain.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' )
            {
            // InternalBlockchain.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}' )
            // InternalBlockchain.g:80:3: () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )? (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )* otherlv_11= '}'
            {
            // InternalBlockchain.g:80:3: ()
            // InternalBlockchain.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAplicacionAccess().getAplicacionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAplicacionAccess().getAplicacionKeyword_1());
            		
            // InternalBlockchain.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:92:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAplicacionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBlockchain.g:114:3: ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) ) (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )*
                    {
                    // InternalBlockchain.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) )
                    // InternalBlockchain.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    {
                    // InternalBlockchain.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    // InternalBlockchain.g:117:6: lv_smartcontract_4_0= ruleSmartContract
                    {

                    						newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_smartcontract_4_0=ruleSmartContract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    						}
                    						add(
                    							current,
                    							"smartcontract",
                    							lv_smartcontract_4_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.SmartContract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:134:4: (otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBlockchain.g:135:5: otherlv_5= ',' ( (lv_smartcontract_6_0= ruleSmartContract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAplicacionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBlockchain.g:139:5: ( (lv_smartcontract_6_0= ruleSmartContract ) )
                    	    // InternalBlockchain.g:140:6: (lv_smartcontract_6_0= ruleSmartContract )
                    	    {
                    	    // InternalBlockchain.g:140:6: (lv_smartcontract_6_0= ruleSmartContract )
                    	    // InternalBlockchain.g:141:7: lv_smartcontract_6_0= ruleSmartContract
                    	    {

                    	    							newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_smartcontract_6_0=ruleSmartContract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"smartcontract",
                    	    								lv_smartcontract_6_0,
                    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.SmartContract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBlockchain.g:160:3: (otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBlockchain.g:161:4: otherlv_7= 'TipoDato' ( (lv_tipodato_8_0= ruleTipoDato ) ) (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getAplicacionAccess().getTipoDatoKeyword_5_0());
            	    			
            	    // InternalBlockchain.g:165:4: ( (lv_tipodato_8_0= ruleTipoDato ) )
            	    // InternalBlockchain.g:166:5: (lv_tipodato_8_0= ruleTipoDato )
            	    {
            	    // InternalBlockchain.g:166:5: (lv_tipodato_8_0= ruleTipoDato )
            	    // InternalBlockchain.g:167:6: lv_tipodato_8_0= ruleTipoDato
            	    {

            	    						newCompositeNode(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_tipodato_8_0=ruleTipoDato();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tipodato",
            	    							lv_tipodato_8_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.TipoDato");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBlockchain.g:184:4: (otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==13) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalBlockchain.g:185:5: otherlv_9= ',' ( (lv_tipodato_10_0= ruleTipoDato ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getAplicacionAccess().getCommaKeyword_5_2_0());
            	    	    				
            	    	    // InternalBlockchain.g:189:5: ( (lv_tipodato_10_0= ruleTipoDato ) )
            	    	    // InternalBlockchain.g:190:6: (lv_tipodato_10_0= ruleTipoDato )
            	    	    {
            	    	    // InternalBlockchain.g:190:6: (lv_tipodato_10_0= ruleTipoDato )
            	    	    // InternalBlockchain.g:191:7: lv_tipodato_10_0= ruleTipoDato
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_tipodato_10_0=ruleTipoDato();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getAplicacionRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"tipodato",
            	    	    								lv_tipodato_10_0,
            	    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.TipoDato");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAplicacion"


    // $ANTLR start "entryRuleTipoDato"
    // InternalBlockchain.g:218:1: entryRuleTipoDato returns [EObject current=null] : iv_ruleTipoDato= ruleTipoDato EOF ;
    public final EObject entryRuleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDato = null;


        try {
            // InternalBlockchain.g:218:49: (iv_ruleTipoDato= ruleTipoDato EOF )
            // InternalBlockchain.g:219:2: iv_ruleTipoDato= ruleTipoDato EOF
            {
             newCompositeNode(grammarAccess.getTipoDatoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoDato=ruleTipoDato();

            state._fsp--;

             current =iv_ruleTipoDato; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoDato"


    // $ANTLR start "ruleTipoDato"
    // InternalBlockchain.g:225:1: ruleTipoDato returns [EObject current=null] : (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) ;
    public final EObject ruleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject this_Entidad_0 = null;

        EObject this_Primitivo_1 = null;

        EObject this_Mapa_2 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:231:2: ( (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) )
            // InternalBlockchain.g:232:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            {
            // InternalBlockchain.g:232:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 59:
            case 60:
            case 61:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:233:3: this_Entidad_0= ruleEntidad
                    {

                    			newCompositeNode(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entidad_0=ruleEntidad();

                    state._fsp--;


                    			current = this_Entidad_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:242:3: this_Primitivo_1= rulePrimitivo
                    {

                    			newCompositeNode(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primitivo_1=rulePrimitivo();

                    state._fsp--;


                    			current = this_Primitivo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:251:3: this_Mapa_2= ruleMapa
                    {

                    			newCompositeNode(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapa_2=ruleMapa();

                    state._fsp--;


                    			current = this_Mapa_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "entryRuleSentencia"
    // InternalBlockchain.g:263:1: entryRuleSentencia returns [EObject current=null] : iv_ruleSentencia= ruleSentencia EOF ;
    public final EObject entryRuleSentencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencia = null;


        try {
            // InternalBlockchain.g:263:50: (iv_ruleSentencia= ruleSentencia EOF )
            // InternalBlockchain.g:264:2: iv_ruleSentencia= ruleSentencia EOF
            {
             newCompositeNode(grammarAccess.getSentenciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentencia=ruleSentencia();

            state._fsp--;

             current =iv_ruleSentencia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentencia"


    // $ANTLR start "ruleSentencia"
    // InternalBlockchain.g:270:1: ruleSentencia returns [EObject current=null] : (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | ruleEString | ruleEBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional ) ;
    public final EObject ruleSentencia() throws RecognitionException {
        EObject current = null;

        EObject this_Parametro_0 = null;

        EObject this_Estado_1 = null;

        EObject this_ExpresionLogica_2 = null;

        EObject this_ExpresionAritmetica_3 = null;

        EObject this_Variable_4 = null;

        EObject this_Condicional_5 = null;

        EObject this_ExpresionNumerica_6 = null;

        EObject this_ExpresionReferenciada_9 = null;

        EObject this_ExpresionRelacional_10 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:276:2: ( (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | ruleEString | ruleEBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional ) )
            // InternalBlockchain.g:277:2: (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | ruleEString | ruleEBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional )
            {
            // InternalBlockchain.g:277:2: (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | ruleEString | ruleEBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional )
            int alt6=11;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:278:3: this_Parametro_0= ruleParametro
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getParametroParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parametro_0=ruleParametro();

                    state._fsp--;


                    			current = this_Parametro_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:287:3: this_Estado_1= ruleEstado
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getEstadoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Estado_1=ruleEstado();

                    state._fsp--;


                    			current = this_Estado_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:296:3: this_ExpresionLogica_2= ruleExpresionLogica
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionLogicaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionLogica_2=ruleExpresionLogica();

                    state._fsp--;


                    			current = this_ExpresionLogica_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:305:3: this_ExpresionAritmetica_3= ruleExpresionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionAritmeticaParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionAritmetica_3=ruleExpresionAritmetica();

                    state._fsp--;


                    			current = this_ExpresionAritmetica_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:314:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:323:3: this_Condicional_5= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getCondicionalParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_5=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:332:3: this_ExpresionNumerica_6= ruleExpresionNumerica
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionNumericaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNumerica_6=ruleExpresionNumerica();

                    state._fsp--;


                    			current = this_ExpresionNumerica_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:341:3: ruleEString
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getEStringParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalBlockchain.g:349:3: ruleEBoolean
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getEBooleanParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEBoolean();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalBlockchain.g:357:3: this_ExpresionReferenciada_9= ruleExpresionReferenciada
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionReferenciadaParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionReferenciada_9=ruleExpresionReferenciada();

                    state._fsp--;


                    			current = this_ExpresionReferenciada_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalBlockchain.g:366:3: this_ExpresionRelacional_10= ruleExpresionRelacional
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getExpresionRelacionalParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionRelacional_10=ruleExpresionRelacional();

                    state._fsp--;


                    			current = this_ExpresionRelacional_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentencia"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:378:1: entryRuleSmartContract returns [EObject current=null] : iv_ruleSmartContract= ruleSmartContract EOF ;
    public final EObject entryRuleSmartContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartContract = null;


        try {
            // InternalBlockchain.g:378:54: (iv_ruleSmartContract= ruleSmartContract EOF )
            // InternalBlockchain.g:379:2: iv_ruleSmartContract= ruleSmartContract EOF
            {
             newCompositeNode(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartContract=ruleSmartContract();

            state._fsp--;

             current =iv_ruleSmartContract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalBlockchain.g:385:1: ruleSmartContract returns [EObject current=null] : (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )* ( ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )* )* otherlv_11= '}' ) ;
    public final EObject ruleSmartContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entidades_3_0 = null;

        EObject lv_entidades_4_0 = null;

        EObject lv_estado_5_0 = null;

        EObject lv_estado_7_0 = null;

        EObject lv_operaciones_8_0 = null;

        EObject lv_operaciones_10_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:391:2: ( (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )* ( ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )* )* otherlv_11= '}' ) )
            // InternalBlockchain.g:392:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )* ( ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )* )* otherlv_11= '}' )
            {
            // InternalBlockchain.g:392:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )* ( ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )* )* otherlv_11= '}' )
            // InternalBlockchain.g:393:3: otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )* ( ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )* )* ( ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )* )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSmartContractAccess().getSmartContractKeyword_0());
            		
            // InternalBlockchain.g:397:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:398:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:398:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:399:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartContractRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlockchain.g:420:3: ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBlockchain.g:421:4: ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )*
            	    {
            	    // InternalBlockchain.g:421:4: ( (lv_entidades_3_0= ruleEntidad ) )
            	    // InternalBlockchain.g:422:5: (lv_entidades_3_0= ruleEntidad )
            	    {
            	    // InternalBlockchain.g:422:5: (lv_entidades_3_0= ruleEntidad )
            	    // InternalBlockchain.g:423:6: lv_entidades_3_0= ruleEntidad
            	    {

            	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_entidades_3_0=ruleEntidad();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entidades",
            	    							lv_entidades_3_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Entidad");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBlockchain.g:440:4: ( (lv_entidades_4_0= ruleEntidad ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        alt7 = dfa7.predict(input);
            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalBlockchain.g:441:5: (lv_entidades_4_0= ruleEntidad )
            	    	    {
            	    	    // InternalBlockchain.g:441:5: (lv_entidades_4_0= ruleEntidad )
            	    	    // InternalBlockchain.g:442:6: lv_entidades_4_0= ruleEntidad
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_entidades_4_0=ruleEntidad();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"entidades",
            	    	    							lv_entidades_4_0,
            	    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Entidad");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalBlockchain.g:460:3: ( ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBlockchain.g:461:4: ( (lv_estado_5_0= ruleEstado ) ) (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )*
            	    {
            	    // InternalBlockchain.g:461:4: ( (lv_estado_5_0= ruleEstado ) )
            	    // InternalBlockchain.g:462:5: (lv_estado_5_0= ruleEstado )
            	    {
            	    // InternalBlockchain.g:462:5: (lv_estado_5_0= ruleEstado )
            	    // InternalBlockchain.g:463:6: lv_estado_5_0= ruleEstado
            	    {

            	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_estado_5_0=ruleEstado();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"estado",
            	    							lv_estado_5_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Estado");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBlockchain.g:480:4: (otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==13) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalBlockchain.g:481:5: otherlv_6= ',' ( (lv_estado_7_0= ruleEstado ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getSmartContractAccess().getCommaKeyword_4_1_0());
            	    	    				
            	    	    // InternalBlockchain.g:485:5: ( (lv_estado_7_0= ruleEstado ) )
            	    	    // InternalBlockchain.g:486:6: (lv_estado_7_0= ruleEstado )
            	    	    {
            	    	    // InternalBlockchain.g:486:6: (lv_estado_7_0= ruleEstado )
            	    	    // InternalBlockchain.g:487:7: lv_estado_7_0= ruleEstado
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_estado_7_0=ruleEstado();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"estado",
            	    	    								lv_estado_7_0,
            	    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.Estado");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalBlockchain.g:506:3: ( ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )* )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:507:4: ( (lv_operaciones_8_0= ruleOperacion ) ) (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )*
            	    {
            	    // InternalBlockchain.g:507:4: ( (lv_operaciones_8_0= ruleOperacion ) )
            	    // InternalBlockchain.g:508:5: (lv_operaciones_8_0= ruleOperacion )
            	    {
            	    // InternalBlockchain.g:508:5: (lv_operaciones_8_0= ruleOperacion )
            	    // InternalBlockchain.g:509:6: lv_operaciones_8_0= ruleOperacion
            	    {

            	    						newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_operaciones_8_0=ruleOperacion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operaciones",
            	    							lv_operaciones_8_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Operacion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBlockchain.g:526:4: (otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==13) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalBlockchain.g:527:5: otherlv_9= ',' ( (lv_operaciones_10_0= ruleOperacion ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,13,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getSmartContractAccess().getCommaKeyword_5_1_0());
            	    	    				
            	    	    // InternalBlockchain.g:531:5: ( (lv_operaciones_10_0= ruleOperacion ) )
            	    	    // InternalBlockchain.g:532:6: (lv_operaciones_10_0= ruleOperacion )
            	    	    {
            	    	    // InternalBlockchain.g:532:6: (lv_operaciones_10_0= ruleOperacion )
            	    	    // InternalBlockchain.g:533:7: lv_operaciones_10_0= ruleOperacion
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_operaciones_10_0=ruleOperacion();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"operaciones",
            	    	    								lv_operaciones_10_0,
            	    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.Operacion");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleEString"
    // InternalBlockchain.g:560:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBlockchain.g:560:47: (iv_ruleEString= ruleEString EOF )
            // InternalBlockchain.g:561:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBlockchain.g:567:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBlockchain.g:573:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBlockchain.g:574:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBlockchain.g:574:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:575:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:583:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalBlockchain.g:594:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalBlockchain.g:594:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalBlockchain.g:595:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalBlockchain.g:601:1: ruleEntidad returns [EObject current=null] : ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_atributos_4_0 = null;

        EObject lv_atributos_5_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:607:2: ( ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' ) )
            // InternalBlockchain.g:608:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' )
            {
            // InternalBlockchain.g:608:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}' )
            // InternalBlockchain.g:609:3: () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )* otherlv_6= '}'
            {
            // InternalBlockchain.g:609:3: ()
            // InternalBlockchain.g:610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadAccess().getEntidadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadAccess().getEntidadKeyword_1());
            		
            // InternalBlockchain.g:620:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:621:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:621:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:622:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBlockchain.g:643:3: ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBlockchain.g:644:4: ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )*
            	    {
            	    // InternalBlockchain.g:644:4: ( (lv_atributos_4_0= ruleAtributo ) )
            	    // InternalBlockchain.g:645:5: (lv_atributos_4_0= ruleAtributo )
            	    {
            	    // InternalBlockchain.g:645:5: (lv_atributos_4_0= ruleAtributo )
            	    // InternalBlockchain.g:646:6: lv_atributos_4_0= ruleAtributo
            	    {

            	    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_atributos_4_0=ruleAtributo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atributos",
            	    							lv_atributos_4_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Atributo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBlockchain.g:663:4: ( (lv_atributos_5_0= ruleAtributo ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_STRING) ) {
            	            int LA14_2 = input.LA(2);

            	            if ( (LA14_2==RULE_STRING) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_2==RULE_ID) ) {
            	                alt14=1;
            	            }


            	        }
            	        else if ( (LA14_0==RULE_ID) ) {
            	            int LA14_3 = input.LA(2);

            	            if ( (LA14_3==RULE_STRING) ) {
            	                alt14=1;
            	            }
            	            else if ( (LA14_3==RULE_ID) ) {
            	                alt14=1;
            	            }


            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalBlockchain.g:664:5: (lv_atributos_5_0= ruleAtributo )
            	    	    {
            	    	    // InternalBlockchain.g:664:5: (lv_atributos_5_0= ruleAtributo )
            	    	    // InternalBlockchain.g:665:6: lv_atributos_5_0= ruleAtributo
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_atributos_5_0=ruleAtributo();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"atributos",
            	    	    							lv_atributos_5_0,
            	    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Atributo");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleOperacion"
    // InternalBlockchain.g:691:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalBlockchain.g:691:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalBlockchain.g:692:2: iv_ruleOperacion= ruleOperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacion=ruleOperacion();

            state._fsp--;

             current =iv_ruleOperacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalBlockchain.g:698:1: ruleOperacion returns [EObject current=null] : ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_esUserDefined_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_parametros_6_0 = null;

        EObject lv_parametros_8_0 = null;

        EObject lv_sentencia_14_0 = null;

        EObject lv_sentencia_15_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:704:2: ( ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' ) )
            // InternalBlockchain.g:705:2: ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' )
            {
            // InternalBlockchain.g:705:2: ( () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}' )
            // InternalBlockchain.g:706:3: () otherlv_1= 'Operacion' (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+ ( (lv_name_4_0= ruleEString ) ) otherlv_5= '(' ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )? otherlv_9= ')' (otherlv_10= ':' ( ( ruleEString ) ) )? otherlv_12= '{' (otherlv_13= 'return' )? ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )? otherlv_16= '}'
            {
            // InternalBlockchain.g:706:3: ()
            // InternalBlockchain.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperacionAccess().getOperacionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOperacionAccess().getOperacionKeyword_1());
            		
            // InternalBlockchain.g:717:3: (otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:718:4: otherlv_2= 'isUd=' ( (lv_esUserDefined_3_0= ruleEBoolean ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOperacionAccess().getIsUdKeyword_2_0());
            	    			
            	    // InternalBlockchain.g:722:4: ( (lv_esUserDefined_3_0= ruleEBoolean ) )
            	    // InternalBlockchain.g:723:5: (lv_esUserDefined_3_0= ruleEBoolean )
            	    {
            	    // InternalBlockchain.g:723:5: (lv_esUserDefined_3_0= ruleEBoolean )
            	    // InternalBlockchain.g:724:6: lv_esUserDefined_3_0= ruleEBoolean
            	    {

            	    						newCompositeNode(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_esUserDefined_3_0=ruleEBoolean();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperacionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"esUserDefined",
            	    							true,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.EBoolean");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalBlockchain.g:742:3: ( (lv_name_4_0= ruleEString ) )
            // InternalBlockchain.g:743:4: (lv_name_4_0= ruleEString )
            {
            // InternalBlockchain.g:743:4: (lv_name_4_0= ruleEString )
            // InternalBlockchain.g:744:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBlockchain.g:765:3: ( ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBlockchain.g:766:4: ( (lv_parametros_6_0= ruleParametro ) ) (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )*
                    {
                    // InternalBlockchain.g:766:4: ( (lv_parametros_6_0= ruleParametro ) )
                    // InternalBlockchain.g:767:5: (lv_parametros_6_0= ruleParametro )
                    {
                    // InternalBlockchain.g:767:5: (lv_parametros_6_0= ruleParametro )
                    // InternalBlockchain.g:768:6: lv_parametros_6_0= ruleParametro
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_parametros_6_0=ruleParametro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_6_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Parametro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:785:4: (otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==13) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalBlockchain.g:786:5: otherlv_7= ',' ( (lv_parametros_8_0= ruleParametro ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOperacionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalBlockchain.g:790:5: ( (lv_parametros_8_0= ruleParametro ) )
                    	    // InternalBlockchain.g:791:6: (lv_parametros_8_0= ruleParametro )
                    	    {
                    	    // InternalBlockchain.g:791:6: (lv_parametros_8_0= ruleParametro )
                    	    // InternalBlockchain.g:792:7: lv_parametros_8_0= ruleParametro
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_parametros_8_0=ruleParametro();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperacionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_8_0,
                    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.Parametro");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getOperacionAccess().getRightParenthesisKeyword_6());
            		
            // InternalBlockchain.g:815:3: (otherlv_10= ':' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:816:4: otherlv_10= ':' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOperacionAccess().getColonKeyword_7_0());
                    			
                    // InternalBlockchain.g:820:4: ( ( ruleEString ) )
                    // InternalBlockchain.g:821:5: ( ruleEString )
                    {
                    // InternalBlockchain.g:821:5: ( ruleEString )
                    // InternalBlockchain.g:822:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBlockchain.g:841:3: (otherlv_13= 'return' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBlockchain.g:842:4: otherlv_13= 'return'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getOperacionAccess().getReturnKeyword_9());
                    			

                    }
                    break;

            }

            // InternalBlockchain.g:847:3: ( ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||(LA22_0>=24 && LA22_0<=28)||LA22_0==32||(LA22_0>=37 && LA22_0<=39)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:848:4: ( (lv_sentencia_14_0= ruleSentencia ) ) ( (lv_sentencia_15_0= ruleSentencia ) )*
                    {
                    // InternalBlockchain.g:848:4: ( (lv_sentencia_14_0= ruleSentencia ) )
                    // InternalBlockchain.g:849:5: (lv_sentencia_14_0= ruleSentencia )
                    {
                    // InternalBlockchain.g:849:5: (lv_sentencia_14_0= ruleSentencia )
                    // InternalBlockchain.g:850:6: lv_sentencia_14_0= ruleSentencia
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_sentencia_14_0=ruleSentencia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    						}
                    						add(
                    							current,
                    							"sentencia",
                    							lv_sentencia_14_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Sentencia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:867:4: ( (lv_sentencia_15_0= ruleSentencia ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||(LA21_0>=24 && LA21_0<=28)||LA21_0==32||(LA21_0>=37 && LA21_0<=39)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBlockchain.g:868:5: (lv_sentencia_15_0= ruleSentencia )
                    	    {
                    	    // InternalBlockchain.g:868:5: (lv_sentencia_15_0= ruleSentencia )
                    	    // InternalBlockchain.g:869:6: lv_sentencia_15_0= ruleSentencia
                    	    {

                    	    						newCompositeNode(grammarAccess.getOperacionAccess().getSentenciaSentenciaParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_sentencia_15_0=ruleSentencia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sentencia",
                    	    							lv_sentencia_15_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Sentencia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleEstado"
    // InternalBlockchain.g:895:1: entryRuleEstado returns [EObject current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final EObject entryRuleEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstado = null;


        try {
            // InternalBlockchain.g:895:47: (iv_ruleEstado= ruleEstado EOF )
            // InternalBlockchain.g:896:2: iv_ruleEstado= ruleEstado EOF
            {
             newCompositeNode(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstado=ruleEstado();

            state._fsp--;

             current =iv_ruleEstado; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalBlockchain.g:902:1: ruleEstado returns [EObject current=null] : (otherlv_0= 'Estado' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:908:2: ( (otherlv_0= 'Estado' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBlockchain.g:909:2: (otherlv_0= 'Estado' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:909:2: (otherlv_0= 'Estado' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalBlockchain.g:910:3: otherlv_0= 'Estado' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
            		
            // InternalBlockchain.g:914:3: ( (otherlv_1= RULE_ID ) )
            // InternalBlockchain.g:915:4: (otherlv_1= RULE_ID )
            {
            // InternalBlockchain.g:915:4: (otherlv_1= RULE_ID )
            // InternalBlockchain.g:916:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstadoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0());
            				

            }


            }

            // InternalBlockchain.g:927:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:928:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:928:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:929:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEstadoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleAtributo"
    // InternalBlockchain.g:950:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalBlockchain.g:950:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalBlockchain.g:951:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalBlockchain.g:957:1: ruleAtributo returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:963:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBlockchain.g:964:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:964:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalBlockchain.g:965:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBlockchain.g:965:3: ( ( ruleEString ) )
            // InternalBlockchain.g:966:4: ( ruleEString )
            {
            // InternalBlockchain.g:966:4: ( ruleEString )
            // InternalBlockchain.g:967:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:981:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:982:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:982:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:983:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleParametro"
    // InternalBlockchain.g:1004:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalBlockchain.g:1004:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalBlockchain.g:1005:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalBlockchain.g:1011:1: ruleParametro returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1017:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBlockchain.g:1018:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:1018:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalBlockchain.g:1019:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBlockchain.g:1019:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1020:4: ( ruleEString )
            {
            // InternalBlockchain.g:1020:4: ( ruleEString )
            // InternalBlockchain.g:1021:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParametroRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1035:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:1036:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:1036:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:1037:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBlockchain.g:1058:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalBlockchain.g:1058:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalBlockchain.g:1059:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBlockchain.g:1065:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1071:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBlockchain.g:1072:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBlockchain.g:1072:2: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==26) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:1073:3: kw= 'true'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1079:3: kw= 'false'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalBlockchain.g:1088:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalBlockchain.g:1088:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalBlockchain.g:1089:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
            {
             newCompositeNode(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionLogica=ruleExpresionLogica();

            state._fsp--;

             current =iv_ruleExpresionLogica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalBlockchain.g:1095:1: ruleExpresionLogica returns [EObject current=null] : (otherlv_0= 'ExpLog' (otherlv_1= '(' )? (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_5_0= ruleOperadorLogico ) )+ ( ( ruleEString ) ) (otherlv_7= ')' )? ) ;
    public final EObject ruleExpresionLogica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        Enumerator lv_operador_5_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1101:2: ( (otherlv_0= 'ExpLog' (otherlv_1= '(' )? (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_5_0= ruleOperadorLogico ) )+ ( ( ruleEString ) ) (otherlv_7= ')' )? ) )
            // InternalBlockchain.g:1102:2: (otherlv_0= 'ExpLog' (otherlv_1= '(' )? (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_5_0= ruleOperadorLogico ) )+ ( ( ruleEString ) ) (otherlv_7= ')' )? )
            {
            // InternalBlockchain.g:1102:2: (otherlv_0= 'ExpLog' (otherlv_1= '(' )? (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_5_0= ruleOperadorLogico ) )+ ( ( ruleEString ) ) (otherlv_7= ')' )? )
            // InternalBlockchain.g:1103:3: otherlv_0= 'ExpLog' (otherlv_1= '(' )? (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_5_0= ruleOperadorLogico ) )+ ( ( ruleEString ) ) (otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0());
            		
            // InternalBlockchain.g:1107:3: (otherlv_1= '(' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlockchain.g:1108:4: otherlv_1= '('
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalBlockchain.g:1113:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBlockchain.g:1114:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionLogicaAccess().getIdKeyword_2_0());
                    			
                    // InternalBlockchain.g:1118:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalBlockchain.g:1119:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalBlockchain.g:1119:5: (lv_id_3_0= ruleEInt )
                    // InternalBlockchain.g:1120:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionLogicaAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1138:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1139:4: ( ruleEString )
            {
            // InternalBlockchain.g:1139:4: ( ruleEString )
            // InternalBlockchain.g:1140:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionLogicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getLadoIzqSentenciaCrossReference_3_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1154:3: ( (lv_operador_5_0= ruleOperadorLogico ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=45 && LA26_0<=52)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:1155:4: (lv_operador_5_0= ruleOperadorLogico )
            	    {
            	    // InternalBlockchain.g:1155:4: (lv_operador_5_0= ruleOperadorLogico )
            	    // InternalBlockchain.g:1156:5: lv_operador_5_0= ruleOperadorLogico
            	    {

            	    					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_operador_5_0=ruleOperadorLogico();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            	    					}
            	    					set(
            	    						current,
            	    						"operador",
            	    						lv_operador_5_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.OperadorLogico");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalBlockchain.g:1173:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1174:4: ( ruleEString )
            {
            // InternalBlockchain.g:1174:4: ( ruleEString )
            // InternalBlockchain.g:1175:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionLogicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getLadoDerSentenciaCrossReference_5_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1189:3: (otherlv_7= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBlockchain.g:1190:4: otherlv_7= ')'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleExpresionAritmetica"
    // InternalBlockchain.g:1199:1: entryRuleExpresionAritmetica returns [EObject current=null] : iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF ;
    public final EObject entryRuleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionAritmetica = null;


        try {
            // InternalBlockchain.g:1199:60: (iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:1200:2: iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpresionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionAritmetica=ruleExpresionAritmetica();

            state._fsp--;

             current =iv_ruleExpresionAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionAritmetica"


    // $ANTLR start "ruleExpresionAritmetica"
    // InternalBlockchain.g:1206:1: ruleExpresionAritmetica returns [EObject current=null] : ( () (otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_4_0= ruleOperador ) )+ ( ( ruleEString ) ) ) ;
    public final EObject ruleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        Enumerator lv_operador_4_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1212:2: ( ( () (otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_4_0= ruleOperador ) )+ ( ( ruleEString ) ) ) )
            // InternalBlockchain.g:1213:2: ( () (otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_4_0= ruleOperador ) )+ ( ( ruleEString ) ) )
            {
            // InternalBlockchain.g:1213:2: ( () (otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_4_0= ruleOperador ) )+ ( ( ruleEString ) ) )
            // InternalBlockchain.g:1214:3: () (otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operador_4_0= ruleOperador ) )+ ( ( ruleEString ) )
            {
            // InternalBlockchain.g:1214:3: ()
            // InternalBlockchain.g:1215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0(),
            					current);
            			

            }

            // InternalBlockchain.g:1221:3: (otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBlockchain.g:1222:4: otherlv_1= 'id' ( (lv_id_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpresionAritmeticaAccess().getIdKeyword_1_0());
                    			
                    // InternalBlockchain.g:1226:4: ( (lv_id_2_0= ruleEInt ) )
                    // InternalBlockchain.g:1227:5: (lv_id_2_0= ruleEInt )
                    {
                    // InternalBlockchain.g:1227:5: (lv_id_2_0= ruleEInt )
                    // InternalBlockchain.g:1228:6: lv_id_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getIdEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_id_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_2_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1246:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1247:4: ( ruleEString )
            {
            // InternalBlockchain.g:1247:4: ( ruleEString )
            // InternalBlockchain.g:1248:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionAritmeticaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getLadoIzqSentenciaCrossReference_2_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1262:3: ( (lv_operador_4_0= ruleOperador ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==30||LA29_0==40||(LA29_0>=53 && LA29_0<=57)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlockchain.g:1263:4: (lv_operador_4_0= ruleOperador )
            	    {
            	    // InternalBlockchain.g:1263:4: (lv_operador_4_0= ruleOperador )
            	    // InternalBlockchain.g:1264:5: lv_operador_4_0= ruleOperador
            	    {

            	    					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_operador_4_0=ruleOperador();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
            	    					}
            	    					set(
            	    						current,
            	    						"operador",
            	    						lv_operador_4_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Operador");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // InternalBlockchain.g:1281:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1282:4: ( ruleEString )
            {
            // InternalBlockchain.g:1282:4: ( ruleEString )
            // InternalBlockchain.g:1283:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionAritmeticaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getLadoDerSentenciaCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleVariable"
    // InternalBlockchain.g:1301:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBlockchain.g:1301:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBlockchain.g:1302:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBlockchain.g:1308:1: ruleVariable returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'var' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' otherlv_5= 'new' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1314:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'var' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' otherlv_5= 'new' )? ) )
            // InternalBlockchain.g:1315:2: ( () ( ( ruleEString ) ) otherlv_2= 'var' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' otherlv_5= 'new' )? )
            {
            // InternalBlockchain.g:1315:2: ( () ( ( ruleEString ) ) otherlv_2= 'var' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' otherlv_5= 'new' )? )
            // InternalBlockchain.g:1316:3: () ( ( ruleEString ) ) otherlv_2= 'var' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '=' otherlv_5= 'new' )?
            {
            // InternalBlockchain.g:1316:3: ()
            // InternalBlockchain.g:1317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalBlockchain.g:1323:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1324:4: ( ruleEString )
            {
            // InternalBlockchain.g:1324:4: ( ruleEString )
            // InternalBlockchain.g:1325:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getVarKeyword_2());
            		
            // InternalBlockchain.g:1343:3: ( (lv_name_3_0= ruleEString ) )
            // InternalBlockchain.g:1344:4: (lv_name_3_0= ruleEString )
            {
            // InternalBlockchain.g:1344:4: (lv_name_3_0= ruleEString )
            // InternalBlockchain.g:1345:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1362:3: (otherlv_4= '=' otherlv_5= 'new' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBlockchain.g:1363:4: otherlv_4= '=' otherlv_5= 'new'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getNewKeyword_4_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicional"
    // InternalBlockchain.g:1376:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalBlockchain.g:1376:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalBlockchain.g:1377:2: iv_ruleCondicional= ruleCondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicional=ruleCondicional();

            state._fsp--;

             current =iv_ruleCondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalBlockchain.g:1383:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_tipoCondicional_3_0 = null;

        EObject lv_expresionlogica_5_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_sentencias_10_0 = null;

        EObject lv_else_14_0 = null;

        EObject lv_else_16_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1389:2: ( (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalBlockchain.g:1390:2: (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalBlockchain.g:1390:2: (otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalBlockchain.g:1391:3: otherlv_0= 'Condicional' otherlv_1= '{' (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )? otherlv_4= 'expresionlogica' ( (lv_expresionlogica_5_0= ruleExpresionLogica ) ) otherlv_6= 'sentencias' otherlv_7= '{' ( (lv_sentencias_8_0= ruleSentencia ) ) (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )* otherlv_11= '}' (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getCondicionalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBlockchain.g:1399:3: (otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:1400:4: otherlv_2= 'tipoCondicional' ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_37); 

                    				newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getTipoCondicionalKeyword_2_0());
                    			
                    // InternalBlockchain.g:1404:4: ( (lv_tipoCondicional_3_0= ruleTipoCondicion ) )
                    // InternalBlockchain.g:1405:5: (lv_tipoCondicional_3_0= ruleTipoCondicion )
                    {
                    // InternalBlockchain.g:1405:5: (lv_tipoCondicional_3_0= ruleTipoCondicion )
                    // InternalBlockchain.g:1406:6: lv_tipoCondicional_3_0= ruleTipoCondicion
                    {

                    						newCompositeNode(grammarAccess.getCondicionalAccess().getTipoCondicionalTipoCondicionEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_tipoCondicional_3_0=ruleTipoCondicion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    						}
                    						set(
                    							current,
                    							"tipoCondicional",
                    							lv_tipoCondicional_3_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.TipoCondicion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_39); 

            			newLeafNode(otherlv_4, grammarAccess.getCondicionalAccess().getExpresionlogicaKeyword_3());
            		
            // InternalBlockchain.g:1428:3: ( (lv_expresionlogica_5_0= ruleExpresionLogica ) )
            // InternalBlockchain.g:1429:4: (lv_expresionlogica_5_0= ruleExpresionLogica )
            {
            // InternalBlockchain.g:1429:4: (lv_expresionlogica_5_0= ruleExpresionLogica )
            // InternalBlockchain.g:1430:5: lv_expresionlogica_5_0= ruleExpresionLogica
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
            lv_expresionlogica_5_0=ruleExpresionLogica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"expresionlogica",
            						lv_expresionlogica_5_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.ExpresionLogica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getSentenciasKeyword_5());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_7, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBlockchain.g:1455:3: ( (lv_sentencias_8_0= ruleSentencia ) )
            // InternalBlockchain.g:1456:4: (lv_sentencias_8_0= ruleSentencia )
            {
            // InternalBlockchain.g:1456:4: (lv_sentencias_8_0= ruleSentencia )
            // InternalBlockchain.g:1457:5: lv_sentencias_8_0= ruleSentencia
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_42);
            lv_sentencias_8_0=ruleSentencia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					add(
            						current,
            						"sentencias",
            						lv_sentencias_8_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Sentencia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1474:3: (otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==13) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:1475:4: otherlv_9= ',' ( (lv_sentencias_10_0= ruleSentencia ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_41); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCondicionalAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalBlockchain.g:1479:4: ( (lv_sentencias_10_0= ruleSentencia ) )
            	    // InternalBlockchain.g:1480:5: (lv_sentencias_10_0= ruleSentencia )
            	    {
            	    // InternalBlockchain.g:1480:5: (lv_sentencias_10_0= ruleSentencia )
            	    // InternalBlockchain.g:1481:6: lv_sentencias_10_0= ruleSentencia
            	    {

            	    						newCompositeNode(grammarAccess.getCondicionalAccess().getSentenciasSentenciaParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_sentencias_10_0=ruleSentencia();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sentencias",
            	    							lv_sentencias_10_0,
            	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Sentencia");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_43); 

            			newLeafNode(otherlv_11, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalBlockchain.g:1503:3: (otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBlockchain.g:1504:4: otherlv_12= 'else' otherlv_13= '{' ( (lv_else_14_0= ruleCondicional ) ) (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getCondicionalAccess().getElseKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_44); 

                    				newLeafNode(otherlv_13, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalBlockchain.g:1512:4: ( (lv_else_14_0= ruleCondicional ) )
                    // InternalBlockchain.g:1513:5: (lv_else_14_0= ruleCondicional )
                    {
                    // InternalBlockchain.g:1513:5: (lv_else_14_0= ruleCondicional )
                    // InternalBlockchain.g:1514:6: lv_else_14_0= ruleCondicional
                    {

                    						newCompositeNode(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_else_14_0=ruleCondicional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    						}
                    						add(
                    							current,
                    							"else",
                    							lv_else_14_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Condicional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:1531:4: (otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==13) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalBlockchain.g:1532:5: otherlv_15= ',' ( (lv_else_16_0= ruleCondicional ) )
                    	    {
                    	    otherlv_15=(Token)match(input,13,FOLLOW_44); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCondicionalAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalBlockchain.g:1536:5: ( (lv_else_16_0= ruleCondicional ) )
                    	    // InternalBlockchain.g:1537:6: (lv_else_16_0= ruleCondicional )
                    	    {
                    	    // InternalBlockchain.g:1537:6: (lv_else_16_0= ruleCondicional )
                    	    // InternalBlockchain.g:1538:7: lv_else_16_0= ruleCondicional
                    	    {

                    	    							newCompositeNode(grammarAccess.getCondicionalAccess().getElseCondicionalParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_else_16_0=ruleCondicional();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"else",
                    	    								lv_else_16_0,
                    	    								"uniandes.mdd.aplicacion.blockchain.Blockchain.Condicional");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_17, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:1569:1: entryRuleExpresionNumerica returns [EObject current=null] : iv_ruleExpresionNumerica= ruleExpresionNumerica EOF ;
    public final EObject entryRuleExpresionNumerica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionNumerica = null;


        try {
            // InternalBlockchain.g:1569:58: (iv_ruleExpresionNumerica= ruleExpresionNumerica EOF )
            // InternalBlockchain.g:1570:2: iv_ruleExpresionNumerica= ruleExpresionNumerica EOF
            {
             newCompositeNode(grammarAccess.getExpresionNumericaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionNumerica=ruleExpresionNumerica();

            state._fsp--;

             current =iv_ruleExpresionNumerica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionNumerica"


    // $ANTLR start "ruleExpresionNumerica"
    // InternalBlockchain.g:1576:1: ruleExpresionNumerica returns [EObject current=null] : ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? ) ;
    public final EObject ruleExpresionNumerica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1582:2: ( ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? ) )
            // InternalBlockchain.g:1583:2: ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? )
            {
            // InternalBlockchain.g:1583:2: ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )? )
            // InternalBlockchain.g:1584:3: () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEDouble ) )?
            {
            // InternalBlockchain.g:1584:3: ()
            // InternalBlockchain.g:1585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1());
            		
            // InternalBlockchain.g:1595:3: ( (lv_value_2_0= ruleEDouble ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||(LA35_0>=40 && LA35_0<=41)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBlockchain.g:1596:4: (lv_value_2_0= ruleEDouble )
                    {
                    // InternalBlockchain.g:1596:4: (lv_value_2_0= ruleEDouble )
                    // InternalBlockchain.g:1597:5: lv_value_2_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionNumericaRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionNumerica"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:1618:1: entryRuleExpresionReferenciada returns [EObject current=null] : iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF ;
    public final EObject entryRuleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionReferenciada = null;


        try {
            // InternalBlockchain.g:1618:62: (iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:1619:2: iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF
            {
             newCompositeNode(grammarAccess.getExpresionReferenciadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionReferenciada=ruleExpresionReferenciada();

            state._fsp--;

             current =iv_ruleExpresionReferenciada; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionReferenciada"


    // $ANTLR start "ruleExpresionReferenciada"
    // InternalBlockchain.g:1625:1: ruleExpresionReferenciada returns [EObject current=null] : ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? ) ;
    public final EObject ruleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1631:2: ( ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? ) )
            // InternalBlockchain.g:1632:2: ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? )
            {
            // InternalBlockchain.g:1632:2: ( () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )? )
            // InternalBlockchain.g:1633:3: () otherlv_1= 'ExpRef' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) )? ( ( ruleEString ) )?
            {
            // InternalBlockchain.g:1633:3: ()
            // InternalBlockchain.g:1634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionReferenciadaAccess().getExpresionReferenciadaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_1());
            		
            // InternalBlockchain.g:1644:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==40) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==RULE_INT) ) {
                        alt36=1;
                    }
                }
                else if ( (LA36_1==RULE_INT) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalBlockchain.g:1645:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0());
                    			
                    // InternalBlockchain.g:1649:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalBlockchain.g:1650:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalBlockchain.g:1650:5: (lv_id_3_0= ruleEInt )
                    // InternalBlockchain.g:1651:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionReferenciadaRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1669:3: ( ( ruleEString ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBlockchain.g:1670:4: ( ruleEString )
                    {
                    // InternalBlockchain.g:1670:4: ( ruleEString )
                    // InternalBlockchain.g:1671:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionReferenciadaRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getEntReferenciadaEntidadCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1685:3: ( ( ruleEString ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBlockchain.g:1686:4: ( ruleEString )
                    {
                    // InternalBlockchain.g:1686:4: ( ruleEString )
                    // InternalBlockchain.g:1687:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpresionReferenciadaRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getAtrReferenciadoAtributoCrossReference_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionReferenciada"


    // $ANTLR start "entryRuleExpresionRelacional"
    // InternalBlockchain.g:1705:1: entryRuleExpresionRelacional returns [EObject current=null] : iv_ruleExpresionRelacional= ruleExpresionRelacional EOF ;
    public final EObject entryRuleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionRelacional = null;


        try {
            // InternalBlockchain.g:1705:60: (iv_ruleExpresionRelacional= ruleExpresionRelacional EOF )
            // InternalBlockchain.g:1706:2: iv_ruleExpresionRelacional= ruleExpresionRelacional EOF
            {
             newCompositeNode(grammarAccess.getExpresionRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionRelacional=ruleExpresionRelacional();

            state._fsp--;

             current =iv_ruleExpresionRelacional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresionRelacional"


    // $ANTLR start "ruleExpresionRelacional"
    // InternalBlockchain.g:1712:1: ruleExpresionRelacional returns [EObject current=null] : (otherlv_0= 'ExpRel' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )? ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        Enumerator lv_operadorRelacional_5_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1718:2: ( (otherlv_0= 'ExpRel' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )? ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalBlockchain.g:1719:2: (otherlv_0= 'ExpRel' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )? ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalBlockchain.g:1719:2: (otherlv_0= 'ExpRel' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )? ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalBlockchain.g:1720:3: otherlv_0= 'ExpRel' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )? ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionRelacionalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBlockchain.g:1728:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:1729:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionRelacionalAccess().getIdKeyword_2_0());
                    			
                    // InternalBlockchain.g:1733:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalBlockchain.g:1734:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalBlockchain.g:1734:5: (lv_id_3_0= ruleEInt )
                    // InternalBlockchain.g:1735:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_id_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1753:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1754:4: ( ruleEString )
            {
            // InternalBlockchain.g:1754:4: ( ruleEString )
            // InternalBlockchain.g:1755:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionRelacionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getLadoIzqSentenciaCrossReference_3_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1769:3: ( (lv_operadorRelacional_5_0= ruleOperadorRelacion ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:1770:4: (lv_operadorRelacional_5_0= ruleOperadorRelacion )
                    {
                    // InternalBlockchain.g:1770:4: (lv_operadorRelacional_5_0= ruleOperadorRelacion )
                    // InternalBlockchain.g:1771:5: lv_operadorRelacional_5_0= ruleOperadorRelacion
                    {

                    					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_operadorRelacional_5_0=ruleOperadorRelacion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
                    					}
                    					set(
                    						current,
                    						"operadorRelacional",
                    						lv_operadorRelacional_5_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.OperadorRelacion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1788:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1789:4: ( ruleEString )
            {
            // InternalBlockchain.g:1789:4: ( ruleEString )
            // InternalBlockchain.g:1790:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionRelacionalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getLadoDerSentenciaCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExpresionRelacionalAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresionRelacional"


    // $ANTLR start "entryRuleEInt"
    // InternalBlockchain.g:1812:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBlockchain.g:1812:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBlockchain.g:1813:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBlockchain.g:1819:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1825:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBlockchain.g:1826:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBlockchain.g:1826:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBlockchain.g:1827:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBlockchain.g:1827:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBlockchain.g:1828:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:1845:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalBlockchain.g:1845:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalBlockchain.g:1846:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalBlockchain.g:1852:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1858:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBlockchain.g:1859:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBlockchain.g:1859:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBlockchain.g:1860:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBlockchain.g:1860:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBlockchain.g:1861:4: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_51); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBlockchain.g:1867:3: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBlockchain.g:1868:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_52); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_50); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_53); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalBlockchain.g:1888:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=42 && LA46_0<=43)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:1889:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBlockchain.g:1889:4: (kw= 'E' | kw= 'e' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==42) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==43) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalBlockchain.g:1890:5: kw= 'E'
                            {
                            kw=(Token)match(input,42,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBlockchain.g:1896:5: kw= 'e'
                            {
                            kw=(Token)match(input,43,FOLLOW_27); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBlockchain.g:1902:4: (kw= '-' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==40) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalBlockchain.g:1903:5: kw= '-'
                            {
                            kw=(Token)match(input,40,FOLLOW_50); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:1921:1: entryRulePrimitivo returns [EObject current=null] : iv_rulePrimitivo= rulePrimitivo EOF ;
    public final EObject entryRulePrimitivo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivo = null;


        try {
            // InternalBlockchain.g:1921:50: (iv_rulePrimitivo= rulePrimitivo EOF )
            // InternalBlockchain.g:1922:2: iv_rulePrimitivo= rulePrimitivo EOF
            {
             newCompositeNode(grammarAccess.getPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitivo=rulePrimitivo();

            state._fsp--;

             current =iv_rulePrimitivo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitivo"


    // $ANTLR start "rulePrimitivo"
    // InternalBlockchain.g:1928:1: rulePrimitivo returns [EObject current=null] : ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrimitivo() throws RecognitionException {
        EObject current = null;

        Enumerator lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1934:2: ( ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBlockchain.g:1935:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:1935:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) ) )
            // InternalBlockchain.g:1936:3: () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+ ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBlockchain.g:1936:3: ()
            // InternalBlockchain.g:1937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivoAccess().getPrimitivoAction_0(),
            					current);
            			

            }

            // InternalBlockchain.g:1943:3: ( (lv_tipo_1_0= ruleDatoPrimitivo ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=59 && LA47_0<=61)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBlockchain.g:1944:4: (lv_tipo_1_0= ruleDatoPrimitivo )
            	    {
            	    // InternalBlockchain.g:1944:4: (lv_tipo_1_0= ruleDatoPrimitivo )
            	    // InternalBlockchain.g:1945:5: lv_tipo_1_0= ruleDatoPrimitivo
            	    {

            	    					newCompositeNode(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_54);
            	    lv_tipo_1_0=ruleDatoPrimitivo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrimitivoRule());
            	    					}
            	    					set(
            	    						current,
            	    						"tipo",
            	    						lv_tipo_1_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.DatoPrimitivo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalBlockchain.g:1962:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:1963:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:1963:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:1964:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitivoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitivo"


    // $ANTLR start "entryRuleMapa"
    // InternalBlockchain.g:1985:1: entryRuleMapa returns [EObject current=null] : iv_ruleMapa= ruleMapa EOF ;
    public final EObject entryRuleMapa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapa = null;


        try {
            // InternalBlockchain.g:1985:45: (iv_ruleMapa= ruleMapa EOF )
            // InternalBlockchain.g:1986:2: iv_ruleMapa= ruleMapa EOF
            {
             newCompositeNode(grammarAccess.getMapaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapa=ruleMapa();

            state._fsp--;

             current =iv_ruleMapa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // InternalBlockchain.g:1992:1: ruleMapa returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' ) ;
    public final EObject ruleMapa() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1998:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' ) )
            // InternalBlockchain.g:1999:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' )
            {
            // InternalBlockchain.g:1999:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>' )
            // InternalBlockchain.g:2000:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'Map' otherlv_3= '<' ( ( ruleEString ) ) otherlv_5= ',' ( ( ruleEString ) ) otherlv_7= '>'
            {
            // InternalBlockchain.g:2000:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBlockchain.g:2001:4: (lv_name_0_0= ruleEString )
            {
            // InternalBlockchain.g:2001:4: (lv_name_0_0= ruleEString )
            // InternalBlockchain.g:2002:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_55);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getMapaAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getMapaAccess().getMapKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMapaAccess().getLessThanSignKeyword_3());
            		
            // InternalBlockchain.g:2031:3: ( ( ruleEString ) )
            // InternalBlockchain.g:2032:4: ( ruleEString )
            {
            // InternalBlockchain.g:2032:4: ( ruleEString )
            // InternalBlockchain.g:2033:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_4_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMapaAccess().getCommaKeyword_5());
            		
            // InternalBlockchain.g:2051:3: ( ( ruleEString ) )
            // InternalBlockchain.g:2052:4: ( ruleEString )
            {
            // InternalBlockchain.g:2052:4: ( ruleEString )
            // InternalBlockchain.g:2053:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_6_0());
            				
            pushFollow(FOLLOW_59);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMapaAccess().getGreaterThanSignKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapa"


    // $ANTLR start "ruleOperadorLogico"
    // InternalBlockchain.g:2075:1: ruleOperadorLogico returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) ;
    public final Enumerator ruleOperadorLogico() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2081:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) )
            // InternalBlockchain.g:2082:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            {
            // InternalBlockchain.g:2082:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            int alt48=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt48=1;
                }
                break;
            case 48:
                {
                alt48=2;
                }
                break;
            case 46:
                {
                alt48=3;
                }
                break;
            case 45:
                {
                alt48=4;
                }
                break;
            case 49:
                {
                alt48=5;
                }
                break;
            case 50:
                {
                alt48=6;
                }
                break;
            case 51:
                {
                alt48=7;
                }
                break;
            case 52:
                {
                alt48=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalBlockchain.g:2083:3: (enumLiteral_0= '==' )
                    {
                    // InternalBlockchain.g:2083:3: (enumLiteral_0= '==' )
                    // InternalBlockchain.g:2084:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2091:3: (enumLiteral_1= '!=' )
                    {
                    // InternalBlockchain.g:2091:3: (enumLiteral_1= '!=' )
                    // InternalBlockchain.g:2092:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2099:3: (enumLiteral_2= '>' )
                    {
                    // InternalBlockchain.g:2099:3: (enumLiteral_2= '>' )
                    // InternalBlockchain.g:2100:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2107:3: (enumLiteral_3= '<' )
                    {
                    // InternalBlockchain.g:2107:3: (enumLiteral_3= '<' )
                    // InternalBlockchain.g:2108:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:2115:3: (enumLiteral_4= '>=' )
                    {
                    // InternalBlockchain.g:2115:3: (enumLiteral_4= '>=' )
                    // InternalBlockchain.g:2116:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:2123:3: (enumLiteral_5= '<=' )
                    {
                    // InternalBlockchain.g:2123:3: (enumLiteral_5= '<=' )
                    // InternalBlockchain.g:2124:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:2131:3: (enumLiteral_6= '&&' )
                    {
                    // InternalBlockchain.g:2131:3: (enumLiteral_6= '&&' )
                    // InternalBlockchain.g:2132:4: enumLiteral_6= '&&'
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:2139:3: (enumLiteral_7= '||' )
                    {
                    // InternalBlockchain.g:2139:3: (enumLiteral_7= '||' )
                    // InternalBlockchain.g:2140:4: enumLiteral_7= '||'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperadorLogico"


    // $ANTLR start "ruleOperador"
    // InternalBlockchain.g:2150:1: ruleOperador returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) ) ;
    public final Enumerator ruleOperador() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2156:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) ) )
            // InternalBlockchain.g:2157:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) )
            {
            // InternalBlockchain.g:2157:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) )
            int alt49=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt49=1;
                }
                break;
            case 40:
                {
                alt49=2;
                }
                break;
            case 54:
                {
                alt49=3;
                }
                break;
            case 55:
                {
                alt49=4;
                }
                break;
            case 30:
                {
                alt49=5;
                }
                break;
            case 56:
                {
                alt49=6;
                }
                break;
            case 57:
                {
                alt49=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalBlockchain.g:2158:3: (enumLiteral_0= '+' )
                    {
                    // InternalBlockchain.g:2158:3: (enumLiteral_0= '+' )
                    // InternalBlockchain.g:2159:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2166:3: (enumLiteral_1= '-' )
                    {
                    // InternalBlockchain.g:2166:3: (enumLiteral_1= '-' )
                    // InternalBlockchain.g:2167:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2174:3: (enumLiteral_2= '*' )
                    {
                    // InternalBlockchain.g:2174:3: (enumLiteral_2= '*' )
                    // InternalBlockchain.g:2175:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2182:3: (enumLiteral_3= '/' )
                    {
                    // InternalBlockchain.g:2182:3: (enumLiteral_3= '/' )
                    // InternalBlockchain.g:2183:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:2190:3: (enumLiteral_4= '=' )
                    {
                    // InternalBlockchain.g:2190:3: (enumLiteral_4= '=' )
                    // InternalBlockchain.g:2191:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:2198:3: (enumLiteral_5= 'GET' )
                    {
                    // InternalBlockchain.g:2198:3: (enumLiteral_5= 'GET' )
                    // InternalBlockchain.g:2199:4: enumLiteral_5= 'GET'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:2206:3: (enumLiteral_6= 'DELETE' )
                    {
                    // InternalBlockchain.g:2206:3: (enumLiteral_6= 'DELETE' )
                    // InternalBlockchain.g:2207:4: enumLiteral_6= 'DELETE'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleTipoCondicion"
    // InternalBlockchain.g:2217:1: ruleTipoCondicion returns [Enumerator current=null] : ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) ) ;
    public final Enumerator ruleTipoCondicion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2223:2: ( ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) ) )
            // InternalBlockchain.g:2224:2: ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) )
            {
            // InternalBlockchain.g:2224:2: ( (enumLiteral_0= 'if' ) | (enumLiteral_1= 'else' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            else if ( (LA50_0==36) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:2225:3: (enumLiteral_0= 'if' )
                    {
                    // InternalBlockchain.g:2225:3: (enumLiteral_0= 'if' )
                    // InternalBlockchain.g:2226:4: enumLiteral_0= 'if'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTipoCondicionAccess().getIFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoCondicionAccess().getIFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2233:3: (enumLiteral_1= 'else' )
                    {
                    // InternalBlockchain.g:2233:3: (enumLiteral_1= 'else' )
                    // InternalBlockchain.g:2234:4: enumLiteral_1= 'else'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTipoCondicionAccess().getELSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoCondicionAccess().getELSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoCondicion"


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:2244:1: ruleOperadorRelacion returns [Enumerator current=null] : (enumLiteral_0= '.' ) ;
    public final Enumerator ruleOperadorRelacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2250:2: ( (enumLiteral_0= '.' ) )
            // InternalBlockchain.g:2251:2: (enumLiteral_0= '.' )
            {
            // InternalBlockchain.g:2251:2: (enumLiteral_0= '.' )
            // InternalBlockchain.g:2252:3: enumLiteral_0= '.'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

            			current = grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperadorRelacion"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalBlockchain.g:2261:1: ruleDatoPrimitivo returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) ) ;
    public final Enumerator ruleDatoPrimitivo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2267:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) ) )
            // InternalBlockchain.g:2268:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) )
            {
            // InternalBlockchain.g:2268:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'NUMERICO' ) | (enumLiteral_2= 'BOOLEAN' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt51=1;
                }
                break;
            case 60:
                {
                alt51=2;
                }
                break;
            case 61:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalBlockchain.g:2269:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalBlockchain.g:2269:3: (enumLiteral_0= 'STRING' )
                    // InternalBlockchain.g:2270:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2277:3: (enumLiteral_1= 'NUMERICO' )
                    {
                    // InternalBlockchain.g:2277:3: (enumLiteral_1= 'NUMERICO' )
                    // InternalBlockchain.g:2278:4: enumLiteral_1= 'NUMERICO'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2285:3: (enumLiteral_2= 'BOOLEAN' )
                    {
                    // InternalBlockchain.g:2285:3: (enumLiteral_2= 'BOOLEAN' )
                    // InternalBlockchain.g:2286:4: enumLiteral_2= 'BOOLEAN'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatoPrimitivo"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\uffff\2\16\14\uffff";
    static final String dfa_3s = "\3\4\14\uffff";
    static final String dfa_4s = "\1\47\2\71\14\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\3\1\4\1\6\1\7\1\11\1\12\1\13\2\1\1\5\1\10";
    static final String dfa_6s = "\17\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\22\uffff\1\3\2\10\1\4\1\5\3\uffff\1\6\4\uffff\1\7\1\11\1\12",
            "\1\13\1\14\7\uffff\1\16\1\uffff\1\16\10\uffff\5\16\1\15\1\5\1\uffff\1\16\4\uffff\3\16\1\5\14\uffff\5\5",
            "\1\13\1\14\7\uffff\1\16\1\uffff\1\16\10\uffff\5\16\1\15\1\5\1\uffff\1\16\4\uffff\3\16\1\5\14\uffff\5\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "277:2: (this_Parametro_0= ruleParametro | this_Estado_1= ruleEstado | this_ExpresionLogica_2= ruleExpresionLogica | this_ExpresionAritmetica_3= ruleExpresionAritmetica | this_Variable_4= ruleVariable | this_Condicional_5= ruleCondicional | this_ExpresionNumerica_6= ruleExpresionNumerica | ruleEString | ruleEBoolean | this_ExpresionReferenciada_9= ruleExpresionReferenciada | this_ExpresionRelacional_10= ruleExpresionRelacional )";
        }
    }
    static final String dfa_8s = "\1\17\1\uffff\1\4\2\14\3\4\1\uffff\6\4";
    static final String dfa_9s = "\1\30\1\uffff\1\5\2\14\1\17\2\5\1\uffff\2\17\2\5\2\17";
    static final String dfa_10s = "\1\uffff\1\2\6\uffff\1\1\6\uffff";
    static final String[] dfa_11s = {
            "\1\1\1\uffff\1\2\1\1\5\uffff\1\1",
            "",
            "\1\3\1\4",
            "\1\5",
            "\1\5",
            "\1\6\1\7\11\uffff\1\10",
            "\1\11\1\12",
            "\1\11\1\12",
            "",
            "\1\13\1\14\11\uffff\1\10",
            "\1\13\1\14\11\uffff\1\10",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\13\1\14\11\uffff\1\10",
            "\1\13\1\14\11\uffff\1\10"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_6;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "()* loopback of 440:4: ( (lv_entidades_4_0= ruleEntidad ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x3800000000020030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000104A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000E11F808030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000E11F008030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010100030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x001FE00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x001FE00000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x03E0010040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x03E0010040000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000E11F000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000030000000042L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3800000000000030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000000L});

}