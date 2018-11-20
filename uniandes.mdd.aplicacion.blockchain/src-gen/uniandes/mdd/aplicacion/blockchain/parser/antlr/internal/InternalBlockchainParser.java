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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aplicacion'", "'{'", "'tipodato'", "'}'", "'SmartContract'", "'Entidad'", "'Operacion'", "'isUd='", "'('", "','", "')'", "':'", "'Estado'", "'true'", "'false'", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'else'", "'ExpNum'", "'ExpNumDouble'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'id'", "'ExpRel'", "'return'", "'-'", "'.'", "'E'", "'e'", "'Map'", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'&&'", "'||'", "'+'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'PUT'", "'String'", "'Integer'", "'Boolean'", "'ADDRESS'", "'Double'"
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
    public static final int T__62=62;
    public static final int T__63=63;
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
    // InternalBlockchain.g:72:1: ruleAplicacion returns [EObject current=null] : ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleAplicacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_smartcontract_4_0 = null;

        EObject lv_smartcontract_5_0 = null;

        EObject lv_tipodato_7_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:78:2: ( ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' ) )
            // InternalBlockchain.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' )
            {
            // InternalBlockchain.g:79:2: ( () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}' )
            // InternalBlockchain.g:80:3: () otherlv_1= 'Aplicacion' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )? (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )* otherlv_8= '}'
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
            		
            // InternalBlockchain.g:114:3: ( ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) ) ( (lv_smartcontract_5_0= ruleSmartContract ) )*
                    {
                    // InternalBlockchain.g:115:4: ( (lv_smartcontract_4_0= ruleSmartContract ) )
                    // InternalBlockchain.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    {
                    // InternalBlockchain.g:116:5: (lv_smartcontract_4_0= ruleSmartContract )
                    // InternalBlockchain.g:117:6: lv_smartcontract_4_0= ruleSmartContract
                    {

                    						newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalBlockchain.g:134:4: ( (lv_smartcontract_5_0= ruleSmartContract ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBlockchain.g:135:5: (lv_smartcontract_5_0= ruleSmartContract )
                    	    {
                    	    // InternalBlockchain.g:135:5: (lv_smartcontract_5_0= ruleSmartContract )
                    	    // InternalBlockchain.g:136:6: lv_smartcontract_5_0= ruleSmartContract
                    	    {

                    	    						newCompositeNode(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_smartcontract_5_0=ruleSmartContract();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"smartcontract",
                    	    							lv_smartcontract_5_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.SmartContract");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalBlockchain.g:154:3: (otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBlockchain.g:155:4: otherlv_6= 'tipodato' ( (lv_tipodato_7_0= ruleTipoDato ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0());
            	    			
            	    // InternalBlockchain.g:159:4: ( (lv_tipodato_7_0= ruleTipoDato ) )
            	    // InternalBlockchain.g:160:5: (lv_tipodato_7_0= ruleTipoDato )
            	    {
            	    // InternalBlockchain.g:160:5: (lv_tipodato_7_0= ruleTipoDato )
            	    // InternalBlockchain.g:161:6: lv_tipodato_7_0= ruleTipoDato
            	    {

            	    						newCompositeNode(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tipodato_7_0=ruleTipoDato();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAplicacionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tipodato",
            	    							lv_tipodato_7_0,
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

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalBlockchain.g:187:1: entryRuleTipoDato returns [EObject current=null] : iv_ruleTipoDato= ruleTipoDato EOF ;
    public final EObject entryRuleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDato = null;


        try {
            // InternalBlockchain.g:187:49: (iv_ruleTipoDato= ruleTipoDato EOF )
            // InternalBlockchain.g:188:2: iv_ruleTipoDato= ruleTipoDato EOF
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
    // InternalBlockchain.g:194:1: ruleTipoDato returns [EObject current=null] : (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) ;
    public final EObject ruleTipoDato() throws RecognitionException {
        EObject current = null;

        EObject this_Entidad_0 = null;

        EObject this_Primitivo_1 = null;

        EObject this_Mapa_2 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:200:2: ( (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa ) )
            // InternalBlockchain.g:201:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            {
            // InternalBlockchain.g:201:2: (this_Entidad_0= ruleEntidad | this_Primitivo_1= rulePrimitivo | this_Mapa_2= ruleMapa )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt4=2;
                }
                break;
            case 43:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBlockchain.g:202:3: this_Entidad_0= ruleEntidad
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
                    // InternalBlockchain.g:211:3: this_Primitivo_1= rulePrimitivo
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
                    // InternalBlockchain.g:220:3: this_Mapa_2= ruleMapa
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


    // $ANTLR start "entryRuleLinea"
    // InternalBlockchain.g:232:1: entryRuleLinea returns [EObject current=null] : iv_ruleLinea= ruleLinea EOF ;
    public final EObject entryRuleLinea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinea = null;


        try {
            // InternalBlockchain.g:232:46: (iv_ruleLinea= ruleLinea EOF )
            // InternalBlockchain.g:233:2: iv_ruleLinea= ruleLinea EOF
            {
             newCompositeNode(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinea=ruleLinea();

            state._fsp--;

             current =iv_ruleLinea; 
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
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalBlockchain.g:239:1: ruleLinea returns [EObject current=null] : (this_Expresion_0= ruleExpresion | this_Variable_1= ruleVariable | this_Condicional_2= ruleCondicional | this_Retorno_3= ruleRetorno ) ;
    public final EObject ruleLinea() throws RecognitionException {
        EObject current = null;

        EObject this_Expresion_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Condicional_2 = null;

        EObject this_Retorno_3 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:245:2: ( (this_Expresion_0= ruleExpresion | this_Variable_1= ruleVariable | this_Condicional_2= ruleCondicional | this_Retorno_3= ruleRetorno ) )
            // InternalBlockchain.g:246:2: (this_Expresion_0= ruleExpresion | this_Variable_1= ruleVariable | this_Condicional_2= ruleCondicional | this_Retorno_3= ruleRetorno )
            {
            // InternalBlockchain.g:246:2: (this_Expresion_0= ruleExpresion | this_Variable_1= ruleVariable | this_Condicional_2= ruleCondicional | this_Retorno_3= ruleRetorno )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 38:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:247:3: this_Expresion_0= ruleExpresion
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expresion_0=ruleExpresion();

                    state._fsp--;


                    			current = this_Expresion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:256:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:265:3: this_Condicional_2= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_2=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:274:3: this_Retorno_3= ruleRetorno
                    {

                    			newCompositeNode(grammarAccess.getLineaAccess().getRetornoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Retorno_3=ruleRetorno();

                    state._fsp--;


                    			current = this_Retorno_3;
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
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleExpresion"
    // InternalBlockchain.g:286:1: entryRuleExpresion returns [EObject current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final EObject entryRuleExpresion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresion = null;


        try {
            // InternalBlockchain.g:286:50: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalBlockchain.g:287:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion; 
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
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalBlockchain.g:293:1: ruleExpresion returns [EObject current=null] : (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumericaInt_2= ruleExpresionNumericaInt | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional | this_ExpresionNumericaDouble_7= ruleExpresionNumericaDouble ) ;
    public final EObject ruleExpresion() throws RecognitionException {
        EObject current = null;

        EObject this_ExpresionLogica_0 = null;

        EObject this_ExpresionAritmetica_1 = null;

        EObject this_ExpresionNumericaInt_2 = null;

        EObject this_ExpresionTexto_3 = null;

        EObject this_ExpresionBoolean_4 = null;

        EObject this_ExpresionReferenciada_5 = null;

        EObject this_ExpresionRelacional_6 = null;

        EObject this_ExpresionNumericaDouble_7 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:299:2: ( (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumericaInt_2= ruleExpresionNumericaInt | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional | this_ExpresionNumericaDouble_7= ruleExpresionNumericaDouble ) )
            // InternalBlockchain.g:300:2: (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumericaInt_2= ruleExpresionNumericaInt | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional | this_ExpresionNumericaDouble_7= ruleExpresionNumericaDouble )
            {
            // InternalBlockchain.g:300:2: (this_ExpresionLogica_0= ruleExpresionLogica | this_ExpresionAritmetica_1= ruleExpresionAritmetica | this_ExpresionNumericaInt_2= ruleExpresionNumericaInt | this_ExpresionTexto_3= ruleExpresionTexto | this_ExpresionBoolean_4= ruleExpresionBoolean | this_ExpresionReferenciada_5= ruleExpresionReferenciada | this_ExpresionRelacional_6= ruleExpresionRelacional | this_ExpresionNumericaDouble_7= ruleExpresionNumericaDouble )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 34:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            case 37:
                {
                alt6=7;
                }
                break;
            case 32:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:301:3: this_ExpresionLogica_0= ruleExpresionLogica
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionLogica_0=ruleExpresionLogica();

                    state._fsp--;


                    			current = this_ExpresionLogica_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:310:3: this_ExpresionAritmetica_1= ruleExpresionAritmetica
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionAritmetica_1=ruleExpresionAritmetica();

                    state._fsp--;


                    			current = this_ExpresionAritmetica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:319:3: this_ExpresionNumericaInt_2= ruleExpresionNumericaInt
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionNumericaIntParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNumericaInt_2=ruleExpresionNumericaInt();

                    state._fsp--;


                    			current = this_ExpresionNumericaInt_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:328:3: this_ExpresionTexto_3= ruleExpresionTexto
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionTexto_3=ruleExpresionTexto();

                    state._fsp--;


                    			current = this_ExpresionTexto_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:337:3: this_ExpresionBoolean_4= ruleExpresionBoolean
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionBoolean_4=ruleExpresionBoolean();

                    state._fsp--;


                    			current = this_ExpresionBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:346:3: this_ExpresionReferenciada_5= ruleExpresionReferenciada
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionReferenciada_5=ruleExpresionReferenciada();

                    state._fsp--;


                    			current = this_ExpresionReferenciada_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:355:3: this_ExpresionRelacional_6= ruleExpresionRelacional
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionRelacional_6=ruleExpresionRelacional();

                    state._fsp--;


                    			current = this_ExpresionRelacional_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:364:3: this_ExpresionNumericaDouble_7= ruleExpresionNumericaDouble
                    {

                    			newCompositeNode(grammarAccess.getExpresionAccess().getExpresionNumericaDoubleParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpresionNumericaDouble_7=ruleExpresionNumericaDouble();

                    state._fsp--;


                    			current = this_ExpresionNumericaDouble_7;
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
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:376:1: entryRuleSmartContract returns [EObject current=null] : iv_ruleSmartContract= ruleSmartContract EOF ;
    public final EObject entryRuleSmartContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartContract = null;


        try {
            // InternalBlockchain.g:376:54: (iv_ruleSmartContract= ruleSmartContract EOF )
            // InternalBlockchain.g:377:2: iv_ruleSmartContract= ruleSmartContract EOF
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
    // InternalBlockchain.g:383:1: ruleSmartContract returns [EObject current=null] : (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleSmartContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_entidades_3_0 = null;

        EObject lv_entidades_4_0 = null;

        EObject lv_estado_5_0 = null;

        EObject lv_estado_6_0 = null;

        EObject lv_operaciones_7_0 = null;

        EObject lv_operaciones_8_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:389:2: ( (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' ) )
            // InternalBlockchain.g:390:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' )
            {
            // InternalBlockchain.g:390:2: (otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}' )
            // InternalBlockchain.g:391:3: otherlv_0= 'SmartContract' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )? ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )? ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSmartContractAccess().getSmartContractKeyword_0());
            		
            // InternalBlockchain.g:395:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:396:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:396:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:397:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlockchain.g:418:3: ( ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:419:4: ( (lv_entidades_3_0= ruleEntidad ) ) ( (lv_entidades_4_0= ruleEntidad ) )*
                    {
                    // InternalBlockchain.g:419:4: ( (lv_entidades_3_0= ruleEntidad ) )
                    // InternalBlockchain.g:420:5: (lv_entidades_3_0= ruleEntidad )
                    {
                    // InternalBlockchain.g:420:5: (lv_entidades_3_0= ruleEntidad )
                    // InternalBlockchain.g:421:6: lv_entidades_3_0= ruleEntidad
                    {

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalBlockchain.g:438:4: ( (lv_entidades_4_0= ruleEntidad ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBlockchain.g:439:5: (lv_entidades_4_0= ruleEntidad )
                    	    {
                    	    // InternalBlockchain.g:439:5: (lv_entidades_4_0= ruleEntidad )
                    	    // InternalBlockchain.g:440:6: lv_entidades_4_0= ruleEntidad
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
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

            }

            // InternalBlockchain.g:458:3: ( ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:459:4: ( (lv_estado_5_0= ruleEstado ) ) ( (lv_estado_6_0= ruleEstado ) )*
                    {
                    // InternalBlockchain.g:459:4: ( (lv_estado_5_0= ruleEstado ) )
                    // InternalBlockchain.g:460:5: (lv_estado_5_0= ruleEstado )
                    {
                    // InternalBlockchain.g:460:5: (lv_estado_5_0= ruleEstado )
                    // InternalBlockchain.g:461:6: lv_estado_5_0= ruleEstado
                    {

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBlockchain.g:478:4: ( (lv_estado_6_0= ruleEstado ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBlockchain.g:479:5: (lv_estado_6_0= ruleEstado )
                    	    {
                    	    // InternalBlockchain.g:479:5: (lv_estado_6_0= ruleEstado )
                    	    // InternalBlockchain.g:480:6: lv_estado_6_0= ruleEstado
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_estado_6_0=ruleEstado();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"estado",
                    	    							lv_estado_6_0,
                    	    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Estado");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBlockchain.g:498:3: ( ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBlockchain.g:499:4: ( (lv_operaciones_7_0= ruleOperacion ) ) ( (lv_operaciones_8_0= ruleOperacion ) )*
                    {
                    // InternalBlockchain.g:499:4: ( (lv_operaciones_7_0= ruleOperacion ) )
                    // InternalBlockchain.g:500:5: (lv_operaciones_7_0= ruleOperacion )
                    {
                    // InternalBlockchain.g:500:5: (lv_operaciones_7_0= ruleOperacion )
                    // InternalBlockchain.g:501:6: lv_operaciones_7_0= ruleOperacion
                    {

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_operaciones_7_0=ruleOperacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartContractRule());
                    						}
                    						add(
                    							current,
                    							"operaciones",
                    							lv_operaciones_7_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Operacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:518:4: ( (lv_operaciones_8_0= ruleOperacion ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBlockchain.g:519:5: (lv_operaciones_8_0= ruleOperacion )
                    	    {
                    	    // InternalBlockchain.g:519:5: (lv_operaciones_8_0= ruleOperacion )
                    	    // InternalBlockchain.g:520:6: lv_operaciones_8_0= ruleOperacion
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
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
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalBlockchain.g:546:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBlockchain.g:546:47: (iv_ruleEString= ruleEString EOF )
            // InternalBlockchain.g:547:2: iv_ruleEString= ruleEString EOF
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
    // InternalBlockchain.g:553:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBlockchain.g:559:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBlockchain.g:560:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBlockchain.g:560:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalBlockchain.g:561:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:569:3: this_ID_1= RULE_ID
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
    // InternalBlockchain.g:580:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalBlockchain.g:580:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalBlockchain.g:581:2: iv_ruleEntidad= ruleEntidad EOF
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
    // InternalBlockchain.g:587:1: ruleEntidad returns [EObject current=null] : ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' ) ;
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
            // InternalBlockchain.g:593:2: ( ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' ) )
            // InternalBlockchain.g:594:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' )
            {
            // InternalBlockchain.g:594:2: ( () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}' )
            // InternalBlockchain.g:595:3: () otherlv_1= 'Entidad' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )? otherlv_6= '}'
            {
            // InternalBlockchain.g:595:3: ()
            // InternalBlockchain.g:596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntidadAccess().getEntidadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadAccess().getEntidadKeyword_1());
            		
            // InternalBlockchain.g:606:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:607:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:607:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:608:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBlockchain.g:629:3: ( ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:630:4: ( (lv_atributos_4_0= ruleAtributo ) ) ( (lv_atributos_5_0= ruleAtributo ) )*
                    {
                    // InternalBlockchain.g:630:4: ( (lv_atributos_4_0= ruleAtributo ) )
                    // InternalBlockchain.g:631:5: (lv_atributos_4_0= ruleAtributo )
                    {
                    // InternalBlockchain.g:631:5: (lv_atributos_4_0= ruleAtributo )
                    // InternalBlockchain.g:632:6: lv_atributos_4_0= ruleAtributo
                    {

                    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalBlockchain.g:649:4: ( (lv_atributos_5_0= ruleAtributo ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBlockchain.g:650:5: (lv_atributos_5_0= ruleAtributo )
                    	    {
                    	    // InternalBlockchain.g:650:5: (lv_atributos_5_0= ruleAtributo )
                    	    // InternalBlockchain.g:651:6: lv_atributos_5_0= ruleAtributo
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
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

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBlockchain.g:677:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalBlockchain.g:677:50: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalBlockchain.g:678:2: iv_ruleOperacion= ruleOperacion EOF
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
    // InternalBlockchain.g:684:1: ruleOperacion returns [EObject current=null] : (otherlv_0= 'Operacion' (otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( ( ruleEString ) ) )? otherlv_11= '{' (otherlv_12= '(' )* ( (lv_lineas_13_0= ruleLinea ) )* (otherlv_14= ')' )* otherlv_15= '}' ) ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_esUserDefined_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parametros_5_0 = null;

        EObject lv_parametros_7_0 = null;

        EObject lv_lineas_13_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:690:2: ( (otherlv_0= 'Operacion' (otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( ( ruleEString ) ) )? otherlv_11= '{' (otherlv_12= '(' )* ( (lv_lineas_13_0= ruleLinea ) )* (otherlv_14= ')' )* otherlv_15= '}' ) )
            // InternalBlockchain.g:691:2: (otherlv_0= 'Operacion' (otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( ( ruleEString ) ) )? otherlv_11= '{' (otherlv_12= '(' )* ( (lv_lineas_13_0= ruleLinea ) )* (otherlv_14= ')' )* otherlv_15= '}' )
            {
            // InternalBlockchain.g:691:2: (otherlv_0= 'Operacion' (otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( ( ruleEString ) ) )? otherlv_11= '{' (otherlv_12= '(' )* ( (lv_lineas_13_0= ruleLinea ) )* (otherlv_14= ')' )* otherlv_15= '}' )
            // InternalBlockchain.g:692:3: otherlv_0= 'Operacion' (otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '(' ( ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( ( ruleEString ) ) )? otherlv_11= '{' (otherlv_12= '(' )* ( (lv_lineas_13_0= ruleLinea ) )* (otherlv_14= ')' )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getOperacionAccess().getOperacionKeyword_0());
            		
            // InternalBlockchain.g:696:3: (otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBlockchain.g:697:4: otherlv_1= 'isUd=' ( (lv_esUserDefined_2_0= ruleEBoolean ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperacionAccess().getIsUdKeyword_1_0());
                    			
                    // InternalBlockchain.g:701:4: ( (lv_esUserDefined_2_0= ruleEBoolean ) )
                    // InternalBlockchain.g:702:5: (lv_esUserDefined_2_0= ruleEBoolean )
                    {
                    // InternalBlockchain.g:702:5: (lv_esUserDefined_2_0= ruleEBoolean )
                    // InternalBlockchain.g:703:6: lv_esUserDefined_2_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_esUserDefined_2_0=ruleEBoolean();

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

            }

            // InternalBlockchain.g:721:3: ( (lv_name_3_0= ruleEString ) )
            // InternalBlockchain.g:722:4: (lv_name_3_0= ruleEString )
            {
            // InternalBlockchain.g:722:4: (lv_name_3_0= ruleEString )
            // InternalBlockchain.g:723:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBlockchain.g:744:3: ( ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBlockchain.g:745:4: ( (lv_parametros_5_0= ruleParametro ) ) (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )*
                    {
                    // InternalBlockchain.g:745:4: ( (lv_parametros_5_0= ruleParametro ) )
                    // InternalBlockchain.g:746:5: (lv_parametros_5_0= ruleParametro )
                    {
                    // InternalBlockchain.g:746:5: (lv_parametros_5_0= ruleParametro )
                    // InternalBlockchain.g:747:6: lv_parametros_5_0= ruleParametro
                    {

                    						newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_parametros_5_0=ruleParametro();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperacionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_5_0,
                    							"uniandes.mdd.aplicacion.blockchain.Blockchain.Parametro");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlockchain.g:764:4: (otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalBlockchain.g:765:5: otherlv_6= ',' ( (lv_parametros_7_0= ruleParametro ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalBlockchain.g:769:5: ( (lv_parametros_7_0= ruleParametro ) )
                    	    // InternalBlockchain.g:770:6: (lv_parametros_7_0= ruleParametro )
                    	    {
                    	    // InternalBlockchain.g:770:6: (lv_parametros_7_0= ruleParametro )
                    	    // InternalBlockchain.g:771:7: lv_parametros_7_0= ruleParametro
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_parametros_7_0=ruleParametro();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperacionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_7_0,
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

            otherlv_8=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5());
            		
            // InternalBlockchain.g:794:3: (otherlv_9= ':' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:795:4: otherlv_9= ':' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getOperacionAccess().getColonKeyword_6_0());
                    			
                    // InternalBlockchain.g:799:4: ( ( ruleEString ) )
                    // InternalBlockchain.g:800:5: ( ruleEString )
                    {
                    // InternalBlockchain.g:800:5: ( ruleEString )
                    // InternalBlockchain.g:801:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperacionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalBlockchain.g:820:3: (otherlv_12= '(' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:821:4: otherlv_12= '('
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_18); 

            	    				newLeafNode(otherlv_12, grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_8());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalBlockchain.g:826:3: ( (lv_lineas_13_0= ruleLinea ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=29)||(LA21_0>=31 && LA21_0<=35)||(LA21_0>=37 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBlockchain.g:827:4: (lv_lineas_13_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:827:4: (lv_lineas_13_0= ruleLinea )
            	    // InternalBlockchain.g:828:5: lv_lineas_13_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_lineas_13_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperacionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lineas",
            	    						lv_lineas_13_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalBlockchain.g:845:3: (otherlv_14= ')' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBlockchain.g:846:4: otherlv_14= ')'
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_20); 

            	    				newLeafNode(otherlv_14, grammarAccess.getOperacionAccess().getRightParenthesisKeyword_10());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalBlockchain.g:859:1: entryRuleEstado returns [EObject current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final EObject entryRuleEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstado = null;


        try {
            // InternalBlockchain.g:859:47: (iv_ruleEstado= ruleEstado EOF )
            // InternalBlockchain.g:860:2: iv_ruleEstado= ruleEstado EOF
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
    // InternalBlockchain.g:866:1: ruleEstado returns [EObject current=null] : (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:872:2: ( (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBlockchain.g:873:2: (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:873:2: (otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalBlockchain.g:874:3: otherlv_0= 'Estado' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
            		
            // InternalBlockchain.g:878:3: ( ( ruleEString ) )
            // InternalBlockchain.g:879:4: ( ruleEString )
            {
            // InternalBlockchain.g:879:4: ( ruleEString )
            // InternalBlockchain.g:880:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEstadoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:894:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:895:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:895:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:896:5: lv_name_2_0= ruleEString
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
    // InternalBlockchain.g:917:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalBlockchain.g:917:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalBlockchain.g:918:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalBlockchain.g:924:1: ruleAtributo returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:930:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBlockchain.g:931:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:931:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalBlockchain.g:932:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBlockchain.g:932:3: ( ( ruleEString ) )
            // InternalBlockchain.g:933:4: ( ruleEString )
            {
            // InternalBlockchain.g:933:4: ( ruleEString )
            // InternalBlockchain.g:934:5: ruleEString
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

            // InternalBlockchain.g:948:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:949:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:949:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:950:5: lv_name_1_0= ruleEString
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
    // InternalBlockchain.g:971:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalBlockchain.g:971:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalBlockchain.g:972:2: iv_ruleParametro= ruleParametro EOF
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
    // InternalBlockchain.g:978:1: ruleParametro returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:984:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalBlockchain.g:985:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:985:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalBlockchain.g:986:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalBlockchain.g:986:3: ( ( ruleEString ) )
            // InternalBlockchain.g:987:4: ( ruleEString )
            {
            // InternalBlockchain.g:987:4: ( ruleEString )
            // InternalBlockchain.g:988:5: ruleEString
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

            // InternalBlockchain.g:1002:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlockchain.g:1003:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlockchain.g:1003:4: (lv_name_1_0= ruleEString )
            // InternalBlockchain.g:1004:5: lv_name_1_0= ruleEString
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
    // InternalBlockchain.g:1025:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalBlockchain.g:1025:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalBlockchain.g:1026:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalBlockchain.g:1032:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1038:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBlockchain.g:1039:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBlockchain.g:1039:2: (kw= 'true' | kw= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            else if ( (LA23_0==25) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:1040:3: kw= 'true'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1046:3: kw= 'false'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalBlockchain.g:1055:1: entryRuleExpresionLogica returns [EObject current=null] : iv_ruleExpresionLogica= ruleExpresionLogica EOF ;
    public final EObject entryRuleExpresionLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionLogica = null;


        try {
            // InternalBlockchain.g:1055:56: (iv_ruleExpresionLogica= ruleExpresionLogica EOF )
            // InternalBlockchain.g:1056:2: iv_ruleExpresionLogica= ruleExpresionLogica EOF
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
    // InternalBlockchain.g:1062:1: ruleExpresionLogica returns [EObject current=null] : (otherlv_0= 'ExpLog' (otherlv_1= '(' )* ( (lv_izq_2_0= ruleExpresion ) ) (otherlv_3= ')' )* ( (lv_operador_4_0= ruleOperadorLogico ) )? (otherlv_5= '(' )* ( (lv_der_6_0= ruleExpresion ) ) (otherlv_7= ')' )* ) ;
    public final EObject ruleExpresionLogica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_izq_2_0 = null;

        Enumerator lv_operador_4_0 = null;

        EObject lv_der_6_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1068:2: ( (otherlv_0= 'ExpLog' (otherlv_1= '(' )* ( (lv_izq_2_0= ruleExpresion ) ) (otherlv_3= ')' )* ( (lv_operador_4_0= ruleOperadorLogico ) )? (otherlv_5= '(' )* ( (lv_der_6_0= ruleExpresion ) ) (otherlv_7= ')' )* ) )
            // InternalBlockchain.g:1069:2: (otherlv_0= 'ExpLog' (otherlv_1= '(' )* ( (lv_izq_2_0= ruleExpresion ) ) (otherlv_3= ')' )* ( (lv_operador_4_0= ruleOperadorLogico ) )? (otherlv_5= '(' )* ( (lv_der_6_0= ruleExpresion ) ) (otherlv_7= ')' )* )
            {
            // InternalBlockchain.g:1069:2: (otherlv_0= 'ExpLog' (otherlv_1= '(' )* ( (lv_izq_2_0= ruleExpresion ) ) (otherlv_3= ')' )* ( (lv_operador_4_0= ruleOperadorLogico ) )? (otherlv_5= '(' )* ( (lv_der_6_0= ruleExpresion ) ) (otherlv_7= ')' )* )
            // InternalBlockchain.g:1070:3: otherlv_0= 'ExpLog' (otherlv_1= '(' )* ( (lv_izq_2_0= ruleExpresion ) ) (otherlv_3= ')' )* ( (lv_operador_4_0= ruleOperadorLogico ) )? (otherlv_5= '(' )* ( (lv_der_6_0= ruleExpresion ) ) (otherlv_7= ')' )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0());
            		
            // InternalBlockchain.g:1074:3: (otherlv_1= '(' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBlockchain.g:1075:4: otherlv_1= '('
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalBlockchain.g:1080:3: ( (lv_izq_2_0= ruleExpresion ) )
            // InternalBlockchain.g:1081:4: (lv_izq_2_0= ruleExpresion )
            {
            // InternalBlockchain.g:1081:4: (lv_izq_2_0= ruleExpresion )
            // InternalBlockchain.g:1082:5: lv_izq_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_izq_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_2_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1099:3: (otherlv_3= ')' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlockchain.g:1100:4: otherlv_3= ')'
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_22); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalBlockchain.g:1105:3: ( (lv_operador_4_0= ruleOperadorLogico ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=44 && LA26_0<=51)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBlockchain.g:1106:4: (lv_operador_4_0= ruleOperadorLogico )
                    {
                    // InternalBlockchain.g:1106:4: (lv_operador_4_0= ruleOperadorLogico )
                    // InternalBlockchain.g:1107:5: lv_operador_4_0= ruleOperadorLogico
                    {

                    					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_operador_4_0=ruleOperadorLogico();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
                    					}
                    					set(
                    						current,
                    						"operador",
                    						lv_operador_4_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.OperadorLogico");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1124:3: (otherlv_5= '(' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlockchain.g:1125:4: otherlv_5= '('
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalBlockchain.g:1130:3: ( (lv_der_6_0= ruleExpresion ) )
            // InternalBlockchain.g:1131:4: (lv_der_6_0= ruleExpresion )
            {
            // InternalBlockchain.g:1131:4: (lv_der_6_0= ruleExpresion )
            // InternalBlockchain.g:1132:5: lv_der_6_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_der_6_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionLogicaRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_6_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1149:3: (otherlv_7= ')' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlockchain.g:1150:4: otherlv_7= ')'
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_23); 

            	    				newLeafNode(otherlv_7, grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
    // InternalBlockchain.g:1159:1: entryRuleExpresionAritmetica returns [EObject current=null] : iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF ;
    public final EObject entryRuleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionAritmetica = null;


        try {
            // InternalBlockchain.g:1159:60: (iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:1160:2: iv_ruleExpresionAritmetica= ruleExpresionAritmetica EOF
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
    // InternalBlockchain.g:1166:1: ruleExpresionAritmetica returns [EObject current=null] : ( () otherlv_1= 'ExpArit' (otherlv_2= '(' )* ( (lv_izq_3_0= ruleExpresion ) ) (otherlv_4= ')' )* ( (lv_operador_5_0= ruleOperador ) )? (otherlv_6= '(' )* ( (lv_der_7_0= ruleExpresion ) ) (otherlv_8= ')' )* ) ;
    public final EObject ruleExpresionAritmetica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_izq_3_0 = null;

        Enumerator lv_operador_5_0 = null;

        EObject lv_der_7_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1172:2: ( ( () otherlv_1= 'ExpArit' (otherlv_2= '(' )* ( (lv_izq_3_0= ruleExpresion ) ) (otherlv_4= ')' )* ( (lv_operador_5_0= ruleOperador ) )? (otherlv_6= '(' )* ( (lv_der_7_0= ruleExpresion ) ) (otherlv_8= ')' )* ) )
            // InternalBlockchain.g:1173:2: ( () otherlv_1= 'ExpArit' (otherlv_2= '(' )* ( (lv_izq_3_0= ruleExpresion ) ) (otherlv_4= ')' )* ( (lv_operador_5_0= ruleOperador ) )? (otherlv_6= '(' )* ( (lv_der_7_0= ruleExpresion ) ) (otherlv_8= ')' )* )
            {
            // InternalBlockchain.g:1173:2: ( () otherlv_1= 'ExpArit' (otherlv_2= '(' )* ( (lv_izq_3_0= ruleExpresion ) ) (otherlv_4= ')' )* ( (lv_operador_5_0= ruleOperador ) )? (otherlv_6= '(' )* ( (lv_der_7_0= ruleExpresion ) ) (otherlv_8= ')' )* )
            // InternalBlockchain.g:1174:3: () otherlv_1= 'ExpArit' (otherlv_2= '(' )* ( (lv_izq_3_0= ruleExpresion ) ) (otherlv_4= ')' )* ( (lv_operador_5_0= ruleOperador ) )? (otherlv_6= '(' )* ( (lv_der_7_0= ruleExpresion ) ) (otherlv_8= ')' )*
            {
            // InternalBlockchain.g:1174:3: ()
            // InternalBlockchain.g:1175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1());
            		
            // InternalBlockchain.g:1185:3: (otherlv_2= '(' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==19) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlockchain.g:1186:4: otherlv_2= '('
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalBlockchain.g:1191:3: ( (lv_izq_3_0= ruleExpresion ) )
            // InternalBlockchain.g:1192:4: (lv_izq_3_0= ruleExpresion )
            {
            // InternalBlockchain.g:1192:4: (lv_izq_3_0= ruleExpresion )
            // InternalBlockchain.g:1193:5: lv_izq_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_izq_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1210:3: (otherlv_4= ')' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBlockchain.g:1211:4: otherlv_4= ')'
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalBlockchain.g:1216:3: ( (lv_operador_5_0= ruleOperador ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39||(LA31_0>=52 && LA31_0<=58)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:1217:4: (lv_operador_5_0= ruleOperador )
                    {
                    // InternalBlockchain.g:1217:4: (lv_operador_5_0= ruleOperador )
                    // InternalBlockchain.g:1218:5: lv_operador_5_0= ruleOperador
                    {

                    					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_operador_5_0=ruleOperador();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
                    					}
                    					set(
                    						current,
                    						"operador",
                    						lv_operador_5_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Operador");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1235:3: (otherlv_6= '(' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:1236:4: otherlv_6= '('
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_6, grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalBlockchain.g:1241:3: ( (lv_der_7_0= ruleExpresion ) )
            // InternalBlockchain.g:1242:4: (lv_der_7_0= ruleExpresion )
            {
            // InternalBlockchain.g:1242:4: (lv_der_7_0= ruleExpresion )
            // InternalBlockchain.g:1243:5: lv_der_7_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_der_7_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionAritmeticaRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_7_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1260:3: (otherlv_8= ')' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBlockchain.g:1261:4: otherlv_8= ')'
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_23); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


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
    // InternalBlockchain.g:1270:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBlockchain.g:1270:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBlockchain.g:1271:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalBlockchain.g:1277:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1283:2: ( (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? ) )
            // InternalBlockchain.g:1284:2: (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? )
            {
            // InternalBlockchain.g:1284:2: (otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )? )
            // InternalBlockchain.g:1285:3: otherlv_0= 'var' ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalBlockchain.g:1289:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1290:4: ( ruleEString )
            {
            // InternalBlockchain.g:1290:4: ( ruleEString )
            // InternalBlockchain.g:1291:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1305:3: ( (lv_name_2_0= ruleEString ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBlockchain.g:1306:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalBlockchain.g:1306:4: (lv_name_2_0= ruleEString )
                    // InternalBlockchain.g:1307:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicional"
    // InternalBlockchain.g:1328:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalBlockchain.g:1328:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalBlockchain.g:1329:2: iv_ruleCondicional= ruleCondicional EOF
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
    // InternalBlockchain.g:1335:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expresionlogica_1_0= ruleExpresionLogica ) )? otherlv_2= '{' ( (lv_lineas_3_0= ruleLinea ) )* otherlv_4= '}' ( (lv_elseLines_5_0= ruleElse ) )? ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expresionlogica_1_0 = null;

        EObject lv_lineas_3_0 = null;

        EObject lv_elseLines_5_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1341:2: ( (otherlv_0= 'if' ( (lv_expresionlogica_1_0= ruleExpresionLogica ) )? otherlv_2= '{' ( (lv_lineas_3_0= ruleLinea ) )* otherlv_4= '}' ( (lv_elseLines_5_0= ruleElse ) )? ) )
            // InternalBlockchain.g:1342:2: (otherlv_0= 'if' ( (lv_expresionlogica_1_0= ruleExpresionLogica ) )? otherlv_2= '{' ( (lv_lineas_3_0= ruleLinea ) )* otherlv_4= '}' ( (lv_elseLines_5_0= ruleElse ) )? )
            {
            // InternalBlockchain.g:1342:2: (otherlv_0= 'if' ( (lv_expresionlogica_1_0= ruleExpresionLogica ) )? otherlv_2= '{' ( (lv_lineas_3_0= ruleLinea ) )* otherlv_4= '}' ( (lv_elseLines_5_0= ruleElse ) )? )
            // InternalBlockchain.g:1343:3: otherlv_0= 'if' ( (lv_expresionlogica_1_0= ruleExpresionLogica ) )? otherlv_2= '{' ( (lv_lineas_3_0= ruleLinea ) )* otherlv_4= '}' ( (lv_elseLines_5_0= ruleElse ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getIfKeyword_0());
            		
            // InternalBlockchain.g:1347:3: ( (lv_expresionlogica_1_0= ruleExpresionLogica ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBlockchain.g:1348:4: (lv_expresionlogica_1_0= ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:1348:4: (lv_expresionlogica_1_0= ruleExpresionLogica )
                    // InternalBlockchain.g:1349:5: lv_expresionlogica_1_0= ruleExpresionLogica
                    {

                    					newCompositeNode(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_expresionlogica_1_0=ruleExpresionLogica();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    					}
                    					set(
                    						current,
                    						"expresionlogica",
                    						lv_expresionlogica_1_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.ExpresionLogica");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlockchain.g:1370:3: ( (lv_lineas_3_0= ruleLinea ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=26 && LA36_0<=29)||(LA36_0>=31 && LA36_0<=35)||(LA36_0>=37 && LA36_0<=38)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalBlockchain.g:1371:4: (lv_lineas_3_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:1371:4: (lv_lineas_3_0= ruleLinea )
            	    // InternalBlockchain.g:1372:5: lv_lineas_3_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_lineas_3_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lineas",
            	    						lv_lineas_3_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalBlockchain.g:1393:3: ( (lv_elseLines_5_0= ruleElse ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBlockchain.g:1394:4: (lv_elseLines_5_0= ruleElse )
                    {
                    // InternalBlockchain.g:1394:4: (lv_elseLines_5_0= ruleElse )
                    // InternalBlockchain.g:1395:5: lv_elseLines_5_0= ruleElse
                    {

                    					newCompositeNode(grammarAccess.getCondicionalAccess().getElseLinesElseParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elseLines_5_0=ruleElse();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    					}
                    					set(
                    						current,
                    						"elseLines",
                    						lv_elseLines_5_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Else");
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
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleElse"
    // InternalBlockchain.g:1416:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalBlockchain.g:1416:45: (iv_ruleElse= ruleElse EOF )
            // InternalBlockchain.g:1417:2: iv_ruleElse= ruleElse EOF
            {
             newCompositeNode(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElse=ruleElse();

            state._fsp--;

             current =iv_ruleElse; 
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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalBlockchain.g:1423:1: ruleElse returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= '{' ( (lv_lineas_2_0= ruleLinea ) )* otherlv_3= '}' ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_lineas_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1429:2: ( (otherlv_0= 'else' otherlv_1= '{' ( (lv_lineas_2_0= ruleLinea ) )* otherlv_3= '}' ) )
            // InternalBlockchain.g:1430:2: (otherlv_0= 'else' otherlv_1= '{' ( (lv_lineas_2_0= ruleLinea ) )* otherlv_3= '}' )
            {
            // InternalBlockchain.g:1430:2: (otherlv_0= 'else' otherlv_1= '{' ( (lv_lineas_2_0= ruleLinea ) )* otherlv_3= '}' )
            // InternalBlockchain.g:1431:3: otherlv_0= 'else' otherlv_1= '{' ( (lv_lineas_2_0= ruleLinea ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getElseAccess().getElseKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBlockchain.g:1439:3: ( (lv_lineas_2_0= ruleLinea ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=26 && LA38_0<=29)||(LA38_0>=31 && LA38_0<=35)||(LA38_0>=37 && LA38_0<=38)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBlockchain.g:1440:4: (lv_lineas_2_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:1440:4: (lv_lineas_2_0= ruleLinea )
            	    // InternalBlockchain.g:1441:5: lv_lineas_2_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_lineas_2_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lineas",
            	    						lv_lineas_2_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleExpresionNumericaInt"
    // InternalBlockchain.g:1466:1: entryRuleExpresionNumericaInt returns [EObject current=null] : iv_ruleExpresionNumericaInt= ruleExpresionNumericaInt EOF ;
    public final EObject entryRuleExpresionNumericaInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionNumericaInt = null;


        try {
            // InternalBlockchain.g:1466:61: (iv_ruleExpresionNumericaInt= ruleExpresionNumericaInt EOF )
            // InternalBlockchain.g:1467:2: iv_ruleExpresionNumericaInt= ruleExpresionNumericaInt EOF
            {
             newCompositeNode(grammarAccess.getExpresionNumericaIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionNumericaInt=ruleExpresionNumericaInt();

            state._fsp--;

             current =iv_ruleExpresionNumericaInt; 
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
    // $ANTLR end "entryRuleExpresionNumericaInt"


    // $ANTLR start "ruleExpresionNumericaInt"
    // InternalBlockchain.g:1473:1: ruleExpresionNumericaInt returns [EObject current=null] : ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEInt ) )? ) ;
    public final EObject ruleExpresionNumericaInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1479:2: ( ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEInt ) )? ) )
            // InternalBlockchain.g:1480:2: ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEInt ) )? )
            {
            // InternalBlockchain.g:1480:2: ( () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEInt ) )? )
            // InternalBlockchain.g:1481:3: () otherlv_1= 'ExpNum' ( (lv_value_2_0= ruleEInt ) )?
            {
            // InternalBlockchain.g:1481:3: ()
            // InternalBlockchain.g:1482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionNumericaIntAccess().getExpresionNumericaIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionNumericaIntAccess().getExpNumKeyword_1());
            		
            // InternalBlockchain.g:1492:3: ( (lv_value_2_0= ruleEInt ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_INT) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:1493:4: (lv_value_2_0= ruleEInt )
                    {
                    // InternalBlockchain.g:1493:4: (lv_value_2_0= ruleEInt )
                    // InternalBlockchain.g:1494:5: lv_value_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getExpresionNumericaIntAccess().getValueEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionNumericaIntRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EInt");
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
    // $ANTLR end "ruleExpresionNumericaInt"


    // $ANTLR start "entryRuleExpresionNumericaDouble"
    // InternalBlockchain.g:1515:1: entryRuleExpresionNumericaDouble returns [EObject current=null] : iv_ruleExpresionNumericaDouble= ruleExpresionNumericaDouble EOF ;
    public final EObject entryRuleExpresionNumericaDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionNumericaDouble = null;


        try {
            // InternalBlockchain.g:1515:64: (iv_ruleExpresionNumericaDouble= ruleExpresionNumericaDouble EOF )
            // InternalBlockchain.g:1516:2: iv_ruleExpresionNumericaDouble= ruleExpresionNumericaDouble EOF
            {
             newCompositeNode(grammarAccess.getExpresionNumericaDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionNumericaDouble=ruleExpresionNumericaDouble();

            state._fsp--;

             current =iv_ruleExpresionNumericaDouble; 
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
    // $ANTLR end "entryRuleExpresionNumericaDouble"


    // $ANTLR start "ruleExpresionNumericaDouble"
    // InternalBlockchain.g:1522:1: ruleExpresionNumericaDouble returns [EObject current=null] : ( () otherlv_1= 'ExpNumDouble' ( (lv_value_2_0= ruleEDouble ) )? ) ;
    public final EObject ruleExpresionNumericaDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1528:2: ( ( () otherlv_1= 'ExpNumDouble' ( (lv_value_2_0= ruleEDouble ) )? ) )
            // InternalBlockchain.g:1529:2: ( () otherlv_1= 'ExpNumDouble' ( (lv_value_2_0= ruleEDouble ) )? )
            {
            // InternalBlockchain.g:1529:2: ( () otherlv_1= 'ExpNumDouble' ( (lv_value_2_0= ruleEDouble ) )? )
            // InternalBlockchain.g:1530:3: () otherlv_1= 'ExpNumDouble' ( (lv_value_2_0= ruleEDouble ) )?
            {
            // InternalBlockchain.g:1530:3: ()
            // InternalBlockchain.g:1531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionNumericaDoubleAccess().getExpresionNumericaDoubleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionNumericaDoubleAccess().getExpNumDoubleKeyword_1());
            		
            // InternalBlockchain.g:1541:3: ( (lv_value_2_0= ruleEDouble ) )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==RULE_INT||LA40_1==40) ) {
                        alt40=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt40=1;
                    }
                    break;
                case 40:
                    {
                    int LA40_3 = input.LA(2);

                    if ( (LA40_3==RULE_INT) ) {
                        alt40=1;
                    }
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:1542:4: (lv_value_2_0= ruleEDouble )
                    {
                    // InternalBlockchain.g:1542:4: (lv_value_2_0= ruleEDouble )
                    // InternalBlockchain.g:1543:5: lv_value_2_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getExpresionNumericaDoubleAccess().getValueEDoubleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionNumericaDoubleRule());
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
    // $ANTLR end "ruleExpresionNumericaDouble"


    // $ANTLR start "entryRuleExpresionTexto"
    // InternalBlockchain.g:1564:1: entryRuleExpresionTexto returns [EObject current=null] : iv_ruleExpresionTexto= ruleExpresionTexto EOF ;
    public final EObject entryRuleExpresionTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionTexto = null;


        try {
            // InternalBlockchain.g:1564:55: (iv_ruleExpresionTexto= ruleExpresionTexto EOF )
            // InternalBlockchain.g:1565:2: iv_ruleExpresionTexto= ruleExpresionTexto EOF
            {
             newCompositeNode(grammarAccess.getExpresionTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionTexto=ruleExpresionTexto();

            state._fsp--;

             current =iv_ruleExpresionTexto; 
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
    // $ANTLR end "entryRuleExpresionTexto"


    // $ANTLR start "ruleExpresionTexto"
    // InternalBlockchain.g:1571:1: ruleExpresionTexto returns [EObject current=null] : ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? ) ;
    public final EObject ruleExpresionTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1577:2: ( ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? ) )
            // InternalBlockchain.g:1578:2: ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? )
            {
            // InternalBlockchain.g:1578:2: ( () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )? )
            // InternalBlockchain.g:1579:3: () otherlv_1= 'ExpTex' ( (lv_value_2_0= ruleEString ) )?
            {
            // InternalBlockchain.g:1579:3: ()
            // InternalBlockchain.g:1580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1());
            		
            // InternalBlockchain.g:1590:3: ( (lv_value_2_0= ruleEString ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBlockchain.g:1591:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalBlockchain.g:1591:4: (lv_value_2_0= ruleEString )
                    // InternalBlockchain.g:1592:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionTextoRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EString");
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
    // $ANTLR end "ruleExpresionTexto"


    // $ANTLR start "entryRuleExpresionBoolean"
    // InternalBlockchain.g:1613:1: entryRuleExpresionBoolean returns [EObject current=null] : iv_ruleExpresionBoolean= ruleExpresionBoolean EOF ;
    public final EObject entryRuleExpresionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionBoolean = null;


        try {
            // InternalBlockchain.g:1613:57: (iv_ruleExpresionBoolean= ruleExpresionBoolean EOF )
            // InternalBlockchain.g:1614:2: iv_ruleExpresionBoolean= ruleExpresionBoolean EOF
            {
             newCompositeNode(grammarAccess.getExpresionBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresionBoolean=ruleExpresionBoolean();

            state._fsp--;

             current =iv_ruleExpresionBoolean; 
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
    // $ANTLR end "entryRuleExpresionBoolean"


    // $ANTLR start "ruleExpresionBoolean"
    // InternalBlockchain.g:1620:1: ruleExpresionBoolean returns [EObject current=null] : ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? ) ;
    public final EObject ruleExpresionBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1626:2: ( ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? ) )
            // InternalBlockchain.g:1627:2: ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? )
            {
            // InternalBlockchain.g:1627:2: ( () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )? )
            // InternalBlockchain.g:1628:3: () otherlv_1= 'ExpBool' ( (lv_value_2_0= ruleEBoolean ) )?
            {
            // InternalBlockchain.g:1628:3: ()
            // InternalBlockchain.g:1629:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1());
            		
            // InternalBlockchain.g:1639:3: ( (lv_value_2_0= ruleEBoolean ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=24 && LA42_0<=25)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBlockchain.g:1640:4: (lv_value_2_0= ruleEBoolean )
                    {
                    // InternalBlockchain.g:1640:4: (lv_value_2_0= ruleEBoolean )
                    // InternalBlockchain.g:1641:5: lv_value_2_0= ruleEBoolean
                    {

                    					newCompositeNode(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionBooleanRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						true,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.EBoolean");
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
    // $ANTLR end "ruleExpresionBoolean"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:1662:1: entryRuleExpresionReferenciada returns [EObject current=null] : iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF ;
    public final EObject entryRuleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionReferenciada = null;


        try {
            // InternalBlockchain.g:1662:62: (iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:1663:2: iv_ruleExpresionReferenciada= ruleExpresionReferenciada EOF
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
    // InternalBlockchain.g:1669:1: ruleExpresionReferenciada returns [EObject current=null] : (otherlv_0= 'ExpRef' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleExpresionReferenciada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1675:2: ( (otherlv_0= 'ExpRef' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalBlockchain.g:1676:2: (otherlv_0= 'ExpRef' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalBlockchain.g:1676:2: (otherlv_0= 'ExpRef' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalBlockchain.g:1677:3: otherlv_0= 'ExpRef' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )? ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBlockchain.g:1685:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBlockchain.g:1686:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0());
                    			
                    // InternalBlockchain.g:1690:4: ( (lv_id_3_0= ruleEInt ) )
                    // InternalBlockchain.g:1691:5: (lv_id_3_0= ruleEInt )
                    {
                    // InternalBlockchain.g:1691:5: (lv_id_3_0= ruleEInt )
                    // InternalBlockchain.g:1692:6: lv_id_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
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

            // InternalBlockchain.g:1710:3: ( ( ruleEString ) )
            // InternalBlockchain.g:1711:4: ( ruleEString )
            {
            // InternalBlockchain.g:1711:4: ( ruleEString )
            // InternalBlockchain.g:1712:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpresionReferenciadaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalBlockchain.g:1734:1: entryRuleExpresionRelacional returns [EObject current=null] : iv_ruleExpresionRelacional= ruleExpresionRelacional EOF ;
    public final EObject entryRuleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpresionRelacional = null;


        try {
            // InternalBlockchain.g:1734:60: (iv_ruleExpresionRelacional= ruleExpresionRelacional EOF )
            // InternalBlockchain.g:1735:2: iv_ruleExpresionRelacional= ruleExpresionRelacional EOF
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
    // InternalBlockchain.g:1741:1: ruleExpresionRelacional returns [EObject current=null] : (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleExpresionRelacional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_izq_1_0 = null;

        Enumerator lv_operadorRelacional_2_0 = null;

        EObject lv_der_3_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1747:2: ( (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) ) )
            // InternalBlockchain.g:1748:2: (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            {
            // InternalBlockchain.g:1748:2: (otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) ) )
            // InternalBlockchain.g:1749:3: otherlv_0= 'ExpRel' ( (lv_izq_1_0= ruleExpresion ) ) ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )? ( (lv_der_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0());
            		
            // InternalBlockchain.g:1753:3: ( (lv_izq_1_0= ruleExpresion ) )
            // InternalBlockchain.g:1754:4: (lv_izq_1_0= ruleExpresion )
            {
            // InternalBlockchain.g:1754:4: (lv_izq_1_0= ruleExpresion )
            // InternalBlockchain.g:1755:5: lv_izq_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
            lv_izq_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_1_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlockchain.g:1772:3: ( (lv_operadorRelacional_2_0= ruleOperadorRelacion ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBlockchain.g:1773:4: (lv_operadorRelacional_2_0= ruleOperadorRelacion )
                    {
                    // InternalBlockchain.g:1773:4: (lv_operadorRelacional_2_0= ruleOperadorRelacion )
                    // InternalBlockchain.g:1774:5: lv_operadorRelacional_2_0= ruleOperadorRelacion
                    {

                    					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_operadorRelacional_2_0=ruleOperadorRelacion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
                    					}
                    					set(
                    						current,
                    						"operadorRelacional",
                    						lv_operadorRelacional_2_0,
                    						"uniandes.mdd.aplicacion.blockchain.Blockchain.OperadorRelacion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBlockchain.g:1791:3: ( (lv_der_3_0= ruleExpresion ) )
            // InternalBlockchain.g:1792:4: (lv_der_3_0= ruleExpresion )
            {
            // InternalBlockchain.g:1792:4: (lv_der_3_0= ruleExpresion )
            // InternalBlockchain.g:1793:5: lv_der_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_der_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpresionRelacionalRule());
            					}
            					set(
            						current,
            						"der",
            						lv_der_3_0,
            						"uniandes.mdd.aplicacion.blockchain.Blockchain.Expresion");
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
    // $ANTLR end "ruleExpresionRelacional"


    // $ANTLR start "entryRuleRetorno"
    // InternalBlockchain.g:1814:1: entryRuleRetorno returns [EObject current=null] : iv_ruleRetorno= ruleRetorno EOF ;
    public final EObject entryRuleRetorno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetorno = null;


        try {
            // InternalBlockchain.g:1814:48: (iv_ruleRetorno= ruleRetorno EOF )
            // InternalBlockchain.g:1815:2: iv_ruleRetorno= ruleRetorno EOF
            {
             newCompositeNode(grammarAccess.getRetornoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetorno=ruleRetorno();

            state._fsp--;

             current =iv_ruleRetorno; 
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
    // $ANTLR end "entryRuleRetorno"


    // $ANTLR start "ruleRetorno"
    // InternalBlockchain.g:1821:1: ruleRetorno returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= '{' ( (lv_lineaRetorno_2_0= ruleLinea ) )* otherlv_3= '}' ) ;
    public final EObject ruleRetorno() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_lineaRetorno_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1827:2: ( (otherlv_0= 'return' otherlv_1= '{' ( (lv_lineaRetorno_2_0= ruleLinea ) )* otherlv_3= '}' ) )
            // InternalBlockchain.g:1828:2: (otherlv_0= 'return' otherlv_1= '{' ( (lv_lineaRetorno_2_0= ruleLinea ) )* otherlv_3= '}' )
            {
            // InternalBlockchain.g:1828:2: (otherlv_0= 'return' otherlv_1= '{' ( (lv_lineaRetorno_2_0= ruleLinea ) )* otherlv_3= '}' )
            // InternalBlockchain.g:1829:3: otherlv_0= 'return' otherlv_1= '{' ( (lv_lineaRetorno_2_0= ruleLinea ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRetornoAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getRetornoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBlockchain.g:1837:3: ( (lv_lineaRetorno_2_0= ruleLinea ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=26 && LA45_0<=29)||(LA45_0>=31 && LA45_0<=35)||(LA45_0>=37 && LA45_0<=38)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalBlockchain.g:1838:4: (lv_lineaRetorno_2_0= ruleLinea )
            	    {
            	    // InternalBlockchain.g:1838:4: (lv_lineaRetorno_2_0= ruleLinea )
            	    // InternalBlockchain.g:1839:5: lv_lineaRetorno_2_0= ruleLinea
            	    {

            	    					newCompositeNode(grammarAccess.getRetornoAccess().getLineaRetornoLineaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_lineaRetorno_2_0=ruleLinea();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRetornoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lineaRetorno",
            	    						lv_lineaRetorno_2_0,
            	    						"uniandes.mdd.aplicacion.blockchain.Blockchain.Linea");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRetornoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRetorno"


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:1864:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalBlockchain.g:1864:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalBlockchain.g:1865:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalBlockchain.g:1871:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1877:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBlockchain.g:1878:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBlockchain.g:1878:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBlockchain.g:1879:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBlockchain.g:1879:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:1880:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBlockchain.g:1886:3: (this_INT_1= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBlockchain.g:1887:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_38); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,40,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_40); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalBlockchain.g:1907:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=41 && LA50_0<=42)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:1908:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBlockchain.g:1908:4: (kw= 'E' | kw= 'e' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==41) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==42) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalBlockchain.g:1909:5: kw= 'E'
                            {
                            kw=(Token)match(input,41,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBlockchain.g:1915:5: kw= 'e'
                            {
                            kw=(Token)match(input,42,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBlockchain.g:1921:4: (kw= '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==39) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalBlockchain.g:1922:5: kw= '-'
                            {
                            kw=(Token)match(input,39,FOLLOW_39); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalBlockchain.g:1940:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBlockchain.g:1940:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBlockchain.g:1941:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBlockchain.g:1947:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBlockchain.g:1953:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBlockchain.g:1954:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBlockchain.g:1954:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBlockchain.g:1955:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBlockchain.g:1955:3: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBlockchain.g:1956:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39); 

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


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:1973:1: entryRulePrimitivo returns [EObject current=null] : iv_rulePrimitivo= rulePrimitivo EOF ;
    public final EObject entryRulePrimitivo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitivo = null;


        try {
            // InternalBlockchain.g:1973:50: (iv_rulePrimitivo= rulePrimitivo EOF )
            // InternalBlockchain.g:1974:2: iv_rulePrimitivo= rulePrimitivo EOF
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
    // InternalBlockchain.g:1980:1: rulePrimitivo returns [EObject current=null] : ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePrimitivo() throws RecognitionException {
        EObject current = null;

        Enumerator lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:1986:2: ( ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalBlockchain.g:1987:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:1987:2: ( () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) ) )
            // InternalBlockchain.g:1988:3: () ( (lv_tipo_1_0= ruleDatoPrimitivo ) )? ( (lv_name_2_0= ruleEString ) )
            {
            // InternalBlockchain.g:1988:3: ()
            // InternalBlockchain.g:1989:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitivoAccess().getPrimitivoAction_0(),
            					current);
            			

            }

            // InternalBlockchain.g:1995:3: ( (lv_tipo_1_0= ruleDatoPrimitivo ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=59 && LA52_0<=63)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBlockchain.g:1996:4: (lv_tipo_1_0= ruleDatoPrimitivo )
                    {
                    // InternalBlockchain.g:1996:4: (lv_tipo_1_0= ruleDatoPrimitivo )
                    // InternalBlockchain.g:1997:5: lv_tipo_1_0= ruleDatoPrimitivo
                    {

                    					newCompositeNode(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
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

            }

            // InternalBlockchain.g:2014:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBlockchain.g:2015:4: (lv_name_2_0= ruleEString )
            {
            // InternalBlockchain.g:2015:4: (lv_name_2_0= ruleEString )
            // InternalBlockchain.g:2016:5: lv_name_2_0= ruleEString
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
    // InternalBlockchain.g:2037:1: entryRuleMapa returns [EObject current=null] : iv_ruleMapa= ruleMapa EOF ;
    public final EObject entryRuleMapa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapa = null;


        try {
            // InternalBlockchain.g:2037:45: (iv_ruleMapa= ruleMapa EOF )
            // InternalBlockchain.g:2038:2: iv_ruleMapa= ruleMapa EOF
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
    // InternalBlockchain.g:2044:1: ruleMapa returns [EObject current=null] : (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) ) ;
    public final EObject ruleMapa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;



        	enterRule();

        try {
            // InternalBlockchain.g:2050:2: ( (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) ) )
            // InternalBlockchain.g:2051:2: (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) )
            {
            // InternalBlockchain.g:2051:2: (otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) ) )
            // InternalBlockchain.g:2052:3: otherlv_0= 'Map' otherlv_1= '<' ( ( ruleEString ) ) otherlv_3= ',' ( ( ruleEString ) ) otherlv_5= '>' otherlv_6= ':' ( (lv_name_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getMapaAccess().getMapKeyword_0());
            		
            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMapaAccess().getLessThanSignKeyword_1());
            		
            // InternalBlockchain.g:2060:3: ( ( ruleEString ) )
            // InternalBlockchain.g:2061:4: ( ruleEString )
            {
            // InternalBlockchain.g:2061:4: ( ruleEString )
            // InternalBlockchain.g:2062:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMapaAccess().getCommaKeyword_3());
            		
            // InternalBlockchain.g:2080:3: ( ( ruleEString ) )
            // InternalBlockchain.g:2081:4: ( ruleEString )
            {
            // InternalBlockchain.g:2081:4: ( ruleEString )
            // InternalBlockchain.g:2082:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,45,FOLLOW_44); 

            			newLeafNode(otherlv_5, grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMapaAccess().getColonKeyword_6());
            		
            // InternalBlockchain.g:2104:3: ( (lv_name_7_0= ruleEString ) )
            // InternalBlockchain.g:2105:4: (lv_name_7_0= ruleEString )
            {
            // InternalBlockchain.g:2105:4: (lv_name_7_0= ruleEString )
            // InternalBlockchain.g:2106:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
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
    // $ANTLR end "ruleMapa"


    // $ANTLR start "ruleOperadorLogico"
    // InternalBlockchain.g:2127:1: ruleOperadorLogico returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) ;
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
            // InternalBlockchain.g:2133:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) ) )
            // InternalBlockchain.g:2134:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            {
            // InternalBlockchain.g:2134:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '&&' ) | (enumLiteral_7= '||' ) )
            int alt53=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt53=1;
                }
                break;
            case 47:
                {
                alt53=2;
                }
                break;
            case 45:
                {
                alt53=3;
                }
                break;
            case 44:
                {
                alt53=4;
                }
                break;
            case 48:
                {
                alt53=5;
                }
                break;
            case 49:
                {
                alt53=6;
                }
                break;
            case 50:
                {
                alt53=7;
                }
                break;
            case 51:
                {
                alt53=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalBlockchain.g:2135:3: (enumLiteral_0= '==' )
                    {
                    // InternalBlockchain.g:2135:3: (enumLiteral_0= '==' )
                    // InternalBlockchain.g:2136:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2143:3: (enumLiteral_1= '!=' )
                    {
                    // InternalBlockchain.g:2143:3: (enumLiteral_1= '!=' )
                    // InternalBlockchain.g:2144:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2151:3: (enumLiteral_2= '>' )
                    {
                    // InternalBlockchain.g:2151:3: (enumLiteral_2= '>' )
                    // InternalBlockchain.g:2152:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2159:3: (enumLiteral_3= '<' )
                    {
                    // InternalBlockchain.g:2159:3: (enumLiteral_3= '<' )
                    // InternalBlockchain.g:2160:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:2167:3: (enumLiteral_4= '>=' )
                    {
                    // InternalBlockchain.g:2167:3: (enumLiteral_4= '>=' )
                    // InternalBlockchain.g:2168:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:2175:3: (enumLiteral_5= '<=' )
                    {
                    // InternalBlockchain.g:2175:3: (enumLiteral_5= '<=' )
                    // InternalBlockchain.g:2176:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:2183:3: (enumLiteral_6= '&&' )
                    {
                    // InternalBlockchain.g:2183:3: (enumLiteral_6= '&&' )
                    // InternalBlockchain.g:2184:4: enumLiteral_6= '&&'
                    {
                    enumLiteral_6=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:2191:3: (enumLiteral_7= '||' )
                    {
                    // InternalBlockchain.g:2191:3: (enumLiteral_7= '||' )
                    // InternalBlockchain.g:2192:4: enumLiteral_7= '||'
                    {
                    enumLiteral_7=(Token)match(input,51,FOLLOW_2); 

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
    // InternalBlockchain.g:2202:1: ruleOperador returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) | (enumLiteral_7= 'PUT' ) ) ;
    public final Enumerator ruleOperador() throws RecognitionException {
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
            // InternalBlockchain.g:2208:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) | (enumLiteral_7= 'PUT' ) ) )
            // InternalBlockchain.g:2209:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) | (enumLiteral_7= 'PUT' ) )
            {
            // InternalBlockchain.g:2209:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= 'GET' ) | (enumLiteral_6= 'DELETE' ) | (enumLiteral_7= 'PUT' ) )
            int alt54=8;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt54=1;
                }
                break;
            case 39:
                {
                alt54=2;
                }
                break;
            case 53:
                {
                alt54=3;
                }
                break;
            case 54:
                {
                alt54=4;
                }
                break;
            case 55:
                {
                alt54=5;
                }
                break;
            case 56:
                {
                alt54=6;
                }
                break;
            case 57:
                {
                alt54=7;
                }
                break;
            case 58:
                {
                alt54=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalBlockchain.g:2210:3: (enumLiteral_0= '+' )
                    {
                    // InternalBlockchain.g:2210:3: (enumLiteral_0= '+' )
                    // InternalBlockchain.g:2211:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2218:3: (enumLiteral_1= '-' )
                    {
                    // InternalBlockchain.g:2218:3: (enumLiteral_1= '-' )
                    // InternalBlockchain.g:2219:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2226:3: (enumLiteral_2= '*' )
                    {
                    // InternalBlockchain.g:2226:3: (enumLiteral_2= '*' )
                    // InternalBlockchain.g:2227:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2234:3: (enumLiteral_3= '/' )
                    {
                    // InternalBlockchain.g:2234:3: (enumLiteral_3= '/' )
                    // InternalBlockchain.g:2235:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:2242:3: (enumLiteral_4= '=' )
                    {
                    // InternalBlockchain.g:2242:3: (enumLiteral_4= '=' )
                    // InternalBlockchain.g:2243:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:2250:3: (enumLiteral_5= 'GET' )
                    {
                    // InternalBlockchain.g:2250:3: (enumLiteral_5= 'GET' )
                    // InternalBlockchain.g:2251:4: enumLiteral_5= 'GET'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:2258:3: (enumLiteral_6= 'DELETE' )
                    {
                    // InternalBlockchain.g:2258:3: (enumLiteral_6= 'DELETE' )
                    // InternalBlockchain.g:2259:4: enumLiteral_6= 'DELETE'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:2266:3: (enumLiteral_7= 'PUT' )
                    {
                    // InternalBlockchain.g:2266:3: (enumLiteral_7= 'PUT' )
                    // InternalBlockchain.g:2267:4: enumLiteral_7= 'PUT'
                    {
                    enumLiteral_7=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getOperadorAccess().getPUTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOperadorAccess().getPUTEnumLiteralDeclaration_7());
                    			

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


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:2277:1: ruleOperadorRelacion returns [Enumerator current=null] : (enumLiteral_0= '.' ) ;
    public final Enumerator ruleOperadorRelacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2283:2: ( (enumLiteral_0= '.' ) )
            // InternalBlockchain.g:2284:2: (enumLiteral_0= '.' )
            {
            // InternalBlockchain.g:2284:2: (enumLiteral_0= '.' )
            // InternalBlockchain.g:2285:3: enumLiteral_0= '.'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

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
    // InternalBlockchain.g:2294:1: ruleDatoPrimitivo returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'ADDRESS' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleDatoPrimitivo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBlockchain.g:2300:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'ADDRESS' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalBlockchain.g:2301:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'ADDRESS' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalBlockchain.g:2301:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'ADDRESS' ) | (enumLiteral_4= 'Double' ) )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt55=1;
                }
                break;
            case 60:
                {
                alt55=2;
                }
                break;
            case 61:
                {
                alt55=3;
                }
                break;
            case 62:
                {
                alt55=4;
                }
                break;
            case 63:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalBlockchain.g:2302:3: (enumLiteral_0= 'String' )
                    {
                    // InternalBlockchain.g:2302:3: (enumLiteral_0= 'String' )
                    // InternalBlockchain.g:2303:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:2310:3: (enumLiteral_1= 'Integer' )
                    {
                    // InternalBlockchain.g:2310:3: (enumLiteral_1= 'Integer' )
                    // InternalBlockchain.g:2311:4: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatoPrimitivoAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:2318:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalBlockchain.g:2318:3: (enumLiteral_2= 'Boolean' )
                    // InternalBlockchain.g:2319:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:2326:3: (enumLiteral_3= 'ADDRESS' )
                    {
                    // InternalBlockchain.g:2326:3: (enumLiteral_3= 'ADDRESS' )
                    // InternalBlockchain.g:2327:4: enumLiteral_3= 'ADDRESS'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:2334:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalBlockchain.g:2334:3: (enumLiteral_4= 'Double' )
                    // InternalBlockchain.g:2335:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getDatoPrimitivoAccess().getDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDatoPrimitivoAccess().getDOUBLEEnumLiteralDeclaration_4());
                    			

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xF800080000010030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000834000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000824000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006FBC284000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000006FBC204000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002F8C080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000FF02F8C280000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x07F000AF8C280000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006FBC004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000042L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000000042L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002F8C000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000012F8C000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000400000L});

}