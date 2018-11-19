package uniandes.mdd.aplicacion.blockchain.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uniandes.mdd.aplicacion.blockchain.services.BlockchainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlockchainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'true'", "'false'", "'E'", "'e'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'PUT'", "'String'", "'uint'", "'Boolean'", "'ADDRESS'", "'Aplicacion'", "'{'", "'}'", "'tipodato'", "'SmartContract'", "'Entidad'", "'Operacion'", "'('", "')'", "'isUd='", "','", "':'", "'Estado'", "'isId='", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'else'", "'ExpNum'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'id'", "'ExpRel'", "'return'", "'Map'"
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

    	public void setGrammarAccess(BlockchainGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAplicacion"
    // InternalBlockchain.g:53:1: entryRuleAplicacion : ruleAplicacion EOF ;
    public final void entryRuleAplicacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:54:1: ( ruleAplicacion EOF )
            // InternalBlockchain.g:55:1: ruleAplicacion EOF
            {
             before(grammarAccess.getAplicacionRule()); 
            pushFollow(FOLLOW_1);
            ruleAplicacion();

            state._fsp--;

             after(grammarAccess.getAplicacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAplicacion"


    // $ANTLR start "ruleAplicacion"
    // InternalBlockchain.g:62:1: ruleAplicacion : ( ( rule__Aplicacion__Group__0 ) ) ;
    public final void ruleAplicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:66:2: ( ( ( rule__Aplicacion__Group__0 ) ) )
            // InternalBlockchain.g:67:2: ( ( rule__Aplicacion__Group__0 ) )
            {
            // InternalBlockchain.g:67:2: ( ( rule__Aplicacion__Group__0 ) )
            // InternalBlockchain.g:68:3: ( rule__Aplicacion__Group__0 )
            {
             before(grammarAccess.getAplicacionAccess().getGroup()); 
            // InternalBlockchain.g:69:3: ( rule__Aplicacion__Group__0 )
            // InternalBlockchain.g:69:4: rule__Aplicacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAplicacion"


    // $ANTLR start "entryRuleTipoDato"
    // InternalBlockchain.g:78:1: entryRuleTipoDato : ruleTipoDato EOF ;
    public final void entryRuleTipoDato() throws RecognitionException {
        try {
            // InternalBlockchain.g:79:1: ( ruleTipoDato EOF )
            // InternalBlockchain.g:80:1: ruleTipoDato EOF
            {
             before(grammarAccess.getTipoDatoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getTipoDatoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoDato"


    // $ANTLR start "ruleTipoDato"
    // InternalBlockchain.g:87:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:91:2: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalBlockchain.g:92:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalBlockchain.g:92:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalBlockchain.g:93:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalBlockchain.g:94:3: ( rule__TipoDato__Alternatives )
            // InternalBlockchain.g:94:4: rule__TipoDato__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoDato__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoDatoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "entryRuleLinea"
    // InternalBlockchain.g:103:1: entryRuleLinea : ruleLinea EOF ;
    public final void entryRuleLinea() throws RecognitionException {
        try {
            // InternalBlockchain.g:104:1: ( ruleLinea EOF )
            // InternalBlockchain.g:105:1: ruleLinea EOF
            {
             before(grammarAccess.getLineaRule()); 
            pushFollow(FOLLOW_1);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getLineaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinea"


    // $ANTLR start "ruleLinea"
    // InternalBlockchain.g:112:1: ruleLinea : ( ( rule__Linea__Alternatives ) ) ;
    public final void ruleLinea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:116:2: ( ( ( rule__Linea__Alternatives ) ) )
            // InternalBlockchain.g:117:2: ( ( rule__Linea__Alternatives ) )
            {
            // InternalBlockchain.g:117:2: ( ( rule__Linea__Alternatives ) )
            // InternalBlockchain.g:118:3: ( rule__Linea__Alternatives )
            {
             before(grammarAccess.getLineaAccess().getAlternatives()); 
            // InternalBlockchain.g:119:3: ( rule__Linea__Alternatives )
            // InternalBlockchain.g:119:4: rule__Linea__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Linea__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinea"


    // $ANTLR start "entryRuleExpresion"
    // InternalBlockchain.g:128:1: entryRuleExpresion : ruleExpresion EOF ;
    public final void entryRuleExpresion() throws RecognitionException {
        try {
            // InternalBlockchain.g:129:1: ( ruleExpresion EOF )
            // InternalBlockchain.g:130:1: ruleExpresion EOF
            {
             before(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalBlockchain.g:137:1: ruleExpresion : ( ( rule__Expresion__Alternatives ) ) ;
    public final void ruleExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:141:2: ( ( ( rule__Expresion__Alternatives ) ) )
            // InternalBlockchain.g:142:2: ( ( rule__Expresion__Alternatives ) )
            {
            // InternalBlockchain.g:142:2: ( ( rule__Expresion__Alternatives ) )
            // InternalBlockchain.g:143:3: ( rule__Expresion__Alternatives )
            {
             before(grammarAccess.getExpresionAccess().getAlternatives()); 
            // InternalBlockchain.g:144:3: ( rule__Expresion__Alternatives )
            // InternalBlockchain.g:144:4: rule__Expresion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expresion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleSmartContract"
    // InternalBlockchain.g:153:1: entryRuleSmartContract : ruleSmartContract EOF ;
    public final void entryRuleSmartContract() throws RecognitionException {
        try {
            // InternalBlockchain.g:154:1: ( ruleSmartContract EOF )
            // InternalBlockchain.g:155:1: ruleSmartContract EOF
            {
             before(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getSmartContractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalBlockchain.g:162:1: ruleSmartContract : ( ( rule__SmartContract__Group__0 ) ) ;
    public final void ruleSmartContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:166:2: ( ( ( rule__SmartContract__Group__0 ) ) )
            // InternalBlockchain.g:167:2: ( ( rule__SmartContract__Group__0 ) )
            {
            // InternalBlockchain.g:167:2: ( ( rule__SmartContract__Group__0 ) )
            // InternalBlockchain.g:168:3: ( rule__SmartContract__Group__0 )
            {
             before(grammarAccess.getSmartContractAccess().getGroup()); 
            // InternalBlockchain.g:169:3: ( rule__SmartContract__Group__0 )
            // InternalBlockchain.g:169:4: rule__SmartContract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleEString"
    // InternalBlockchain.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBlockchain.g:179:1: ( ruleEString EOF )
            // InternalBlockchain.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBlockchain.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBlockchain.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBlockchain.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalBlockchain.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBlockchain.g:194:3: ( rule__EString__Alternatives )
            // InternalBlockchain.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalBlockchain.g:203:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalBlockchain.g:204:1: ( ruleEntidad EOF )
            // InternalBlockchain.g:205:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalBlockchain.g:212:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:216:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalBlockchain.g:217:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalBlockchain.g:217:2: ( ( rule__Entidad__Group__0 ) )
            // InternalBlockchain.g:218:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalBlockchain.g:219:3: ( rule__Entidad__Group__0 )
            // InternalBlockchain.g:219:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleOperacion"
    // InternalBlockchain.g:228:1: entryRuleOperacion : ruleOperacion EOF ;
    public final void entryRuleOperacion() throws RecognitionException {
        try {
            // InternalBlockchain.g:229:1: ( ruleOperacion EOF )
            // InternalBlockchain.g:230:1: ruleOperacion EOF
            {
             before(grammarAccess.getOperacionRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getOperacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalBlockchain.g:237:1: ruleOperacion : ( ( rule__Operacion__Group__0 ) ) ;
    public final void ruleOperacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:241:2: ( ( ( rule__Operacion__Group__0 ) ) )
            // InternalBlockchain.g:242:2: ( ( rule__Operacion__Group__0 ) )
            {
            // InternalBlockchain.g:242:2: ( ( rule__Operacion__Group__0 ) )
            // InternalBlockchain.g:243:3: ( rule__Operacion__Group__0 )
            {
             before(grammarAccess.getOperacionAccess().getGroup()); 
            // InternalBlockchain.g:244:3: ( rule__Operacion__Group__0 )
            // InternalBlockchain.g:244:4: rule__Operacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleEstado"
    // InternalBlockchain.g:253:1: entryRuleEstado : ruleEstado EOF ;
    public final void entryRuleEstado() throws RecognitionException {
        try {
            // InternalBlockchain.g:254:1: ( ruleEstado EOF )
            // InternalBlockchain.g:255:1: ruleEstado EOF
            {
             before(grammarAccess.getEstadoRule()); 
            pushFollow(FOLLOW_1);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getEstadoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // InternalBlockchain.g:262:1: ruleEstado : ( ( rule__Estado__Group__0 ) ) ;
    public final void ruleEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:266:2: ( ( ( rule__Estado__Group__0 ) ) )
            // InternalBlockchain.g:267:2: ( ( rule__Estado__Group__0 ) )
            {
            // InternalBlockchain.g:267:2: ( ( rule__Estado__Group__0 ) )
            // InternalBlockchain.g:268:3: ( rule__Estado__Group__0 )
            {
             before(grammarAccess.getEstadoAccess().getGroup()); 
            // InternalBlockchain.g:269:3: ( rule__Estado__Group__0 )
            // InternalBlockchain.g:269:4: rule__Estado__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleAtributo"
    // InternalBlockchain.g:278:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalBlockchain.g:279:1: ( ruleAtributo EOF )
            // InternalBlockchain.g:280:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalBlockchain.g:287:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:291:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalBlockchain.g:292:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalBlockchain.g:292:2: ( ( rule__Atributo__Group__0 ) )
            // InternalBlockchain.g:293:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalBlockchain.g:294:3: ( rule__Atributo__Group__0 )
            // InternalBlockchain.g:294:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleParametro"
    // InternalBlockchain.g:303:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalBlockchain.g:304:1: ( ruleParametro EOF )
            // InternalBlockchain.g:305:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalBlockchain.g:312:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:316:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalBlockchain.g:317:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalBlockchain.g:317:2: ( ( rule__Parametro__Group__0 ) )
            // InternalBlockchain.g:318:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalBlockchain.g:319:3: ( rule__Parametro__Group__0 )
            // InternalBlockchain.g:319:4: rule__Parametro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleEBoolean"
    // InternalBlockchain.g:328:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:329:1: ( ruleEBoolean EOF )
            // InternalBlockchain.g:330:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBlockchain.g:337:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:341:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalBlockchain.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalBlockchain.g:342:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalBlockchain.g:343:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalBlockchain.g:344:3: ( rule__EBoolean__Alternatives )
            // InternalBlockchain.g:344:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleExpresionLogica"
    // InternalBlockchain.g:353:1: entryRuleExpresionLogica : ruleExpresionLogica EOF ;
    public final void entryRuleExpresionLogica() throws RecognitionException {
        try {
            // InternalBlockchain.g:354:1: ( ruleExpresionLogica EOF )
            // InternalBlockchain.g:355:1: ruleExpresionLogica EOF
            {
             before(grammarAccess.getExpresionLogicaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionLogica"


    // $ANTLR start "ruleExpresionLogica"
    // InternalBlockchain.g:362:1: ruleExpresionLogica : ( ( rule__ExpresionLogica__Group__0 ) ) ;
    public final void ruleExpresionLogica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:366:2: ( ( ( rule__ExpresionLogica__Group__0 ) ) )
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            {
            // InternalBlockchain.g:367:2: ( ( rule__ExpresionLogica__Group__0 ) )
            // InternalBlockchain.g:368:3: ( rule__ExpresionLogica__Group__0 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getGroup()); 
            // InternalBlockchain.g:369:3: ( rule__ExpresionLogica__Group__0 )
            // InternalBlockchain.g:369:4: rule__ExpresionLogica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionLogica"


    // $ANTLR start "entryRuleExpresionAritmetica"
    // InternalBlockchain.g:378:1: entryRuleExpresionAritmetica : ruleExpresionAritmetica EOF ;
    public final void entryRuleExpresionAritmetica() throws RecognitionException {
        try {
            // InternalBlockchain.g:379:1: ( ruleExpresionAritmetica EOF )
            // InternalBlockchain.g:380:1: ruleExpresionAritmetica EOF
            {
             before(grammarAccess.getExpresionAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionAritmetica();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionAritmetica"


    // $ANTLR start "ruleExpresionAritmetica"
    // InternalBlockchain.g:387:1: ruleExpresionAritmetica : ( ( rule__ExpresionAritmetica__Group__0 ) ) ;
    public final void ruleExpresionAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:391:2: ( ( ( rule__ExpresionAritmetica__Group__0 ) ) )
            // InternalBlockchain.g:392:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            {
            // InternalBlockchain.g:392:2: ( ( rule__ExpresionAritmetica__Group__0 ) )
            // InternalBlockchain.g:393:3: ( rule__ExpresionAritmetica__Group__0 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 
            // InternalBlockchain.g:394:3: ( rule__ExpresionAritmetica__Group__0 )
            // InternalBlockchain.g:394:4: rule__ExpresionAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionAritmetica"


    // $ANTLR start "entryRuleVariable"
    // InternalBlockchain.g:403:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBlockchain.g:404:1: ( ruleVariable EOF )
            // InternalBlockchain.g:405:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBlockchain.g:412:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:416:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalBlockchain.g:417:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalBlockchain.g:417:2: ( ( rule__Variable__Group__0 ) )
            // InternalBlockchain.g:418:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalBlockchain.g:419:3: ( rule__Variable__Group__0 )
            // InternalBlockchain.g:419:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondicional"
    // InternalBlockchain.g:428:1: entryRuleCondicional : ruleCondicional EOF ;
    public final void entryRuleCondicional() throws RecognitionException {
        try {
            // InternalBlockchain.g:429:1: ( ruleCondicional EOF )
            // InternalBlockchain.g:430:1: ruleCondicional EOF
            {
             before(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            ruleCondicional();

            state._fsp--;

             after(grammarAccess.getCondicionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalBlockchain.g:437:1: ruleCondicional : ( ( rule__Condicional__Group__0 ) ) ;
    public final void ruleCondicional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:441:2: ( ( ( rule__Condicional__Group__0 ) ) )
            // InternalBlockchain.g:442:2: ( ( rule__Condicional__Group__0 ) )
            {
            // InternalBlockchain.g:442:2: ( ( rule__Condicional__Group__0 ) )
            // InternalBlockchain.g:443:3: ( rule__Condicional__Group__0 )
            {
             before(grammarAccess.getCondicionalAccess().getGroup()); 
            // InternalBlockchain.g:444:3: ( rule__Condicional__Group__0 )
            // InternalBlockchain.g:444:4: rule__Condicional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondicionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleElse"
    // InternalBlockchain.g:453:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // InternalBlockchain.g:454:1: ( ruleElse EOF )
            // InternalBlockchain.g:455:1: ruleElse EOF
            {
             before(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getElseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalBlockchain.g:462:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:466:2: ( ( ( rule__Else__Group__0 ) ) )
            // InternalBlockchain.g:467:2: ( ( rule__Else__Group__0 ) )
            {
            // InternalBlockchain.g:467:2: ( ( rule__Else__Group__0 ) )
            // InternalBlockchain.g:468:3: ( rule__Else__Group__0 )
            {
             before(grammarAccess.getElseAccess().getGroup()); 
            // InternalBlockchain.g:469:3: ( rule__Else__Group__0 )
            // InternalBlockchain.g:469:4: rule__Else__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:478:1: entryRuleExpresionNumerica : ruleExpresionNumerica EOF ;
    public final void entryRuleExpresionNumerica() throws RecognitionException {
        try {
            // InternalBlockchain.g:479:1: ( ruleExpresionNumerica EOF )
            // InternalBlockchain.g:480:1: ruleExpresionNumerica EOF
            {
             before(grammarAccess.getExpresionNumericaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionNumerica();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionNumerica"


    // $ANTLR start "ruleExpresionNumerica"
    // InternalBlockchain.g:487:1: ruleExpresionNumerica : ( ( rule__ExpresionNumerica__Group__0 ) ) ;
    public final void ruleExpresionNumerica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:491:2: ( ( ( rule__ExpresionNumerica__Group__0 ) ) )
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            {
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            // InternalBlockchain.g:493:3: ( rule__ExpresionNumerica__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaAccess().getGroup()); 
            // InternalBlockchain.g:494:3: ( rule__ExpresionNumerica__Group__0 )
            // InternalBlockchain.g:494:4: rule__ExpresionNumerica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionNumericaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionNumerica"


    // $ANTLR start "entryRuleExpresionTexto"
    // InternalBlockchain.g:503:1: entryRuleExpresionTexto : ruleExpresionTexto EOF ;
    public final void entryRuleExpresionTexto() throws RecognitionException {
        try {
            // InternalBlockchain.g:504:1: ( ruleExpresionTexto EOF )
            // InternalBlockchain.g:505:1: ruleExpresionTexto EOF
            {
             before(grammarAccess.getExpresionTextoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionTexto();

            state._fsp--;

             after(grammarAccess.getExpresionTextoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionTexto"


    // $ANTLR start "ruleExpresionTexto"
    // InternalBlockchain.g:512:1: ruleExpresionTexto : ( ( rule__ExpresionTexto__Group__0 ) ) ;
    public final void ruleExpresionTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:516:2: ( ( ( rule__ExpresionTexto__Group__0 ) ) )
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionTexto__Group__0 ) )
            {
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionTexto__Group__0 ) )
            // InternalBlockchain.g:518:3: ( rule__ExpresionTexto__Group__0 )
            {
             before(grammarAccess.getExpresionTextoAccess().getGroup()); 
            // InternalBlockchain.g:519:3: ( rule__ExpresionTexto__Group__0 )
            // InternalBlockchain.g:519:4: rule__ExpresionTexto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionTextoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionTexto"


    // $ANTLR start "entryRuleExpresionBoolean"
    // InternalBlockchain.g:528:1: entryRuleExpresionBoolean : ruleExpresionBoolean EOF ;
    public final void entryRuleExpresionBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:529:1: ( ruleExpresionBoolean EOF )
            // InternalBlockchain.g:530:1: ruleExpresionBoolean EOF
            {
             before(grammarAccess.getExpresionBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionBoolean();

            state._fsp--;

             after(grammarAccess.getExpresionBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionBoolean"


    // $ANTLR start "ruleExpresionBoolean"
    // InternalBlockchain.g:537:1: ruleExpresionBoolean : ( ( rule__ExpresionBoolean__Group__0 ) ) ;
    public final void ruleExpresionBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:541:2: ( ( ( rule__ExpresionBoolean__Group__0 ) ) )
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            {
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            // InternalBlockchain.g:543:3: ( rule__ExpresionBoolean__Group__0 )
            {
             before(grammarAccess.getExpresionBooleanAccess().getGroup()); 
            // InternalBlockchain.g:544:3: ( rule__ExpresionBoolean__Group__0 )
            // InternalBlockchain.g:544:4: rule__ExpresionBoolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionBoolean"


    // $ANTLR start "entryRuleExpresionReferenciada"
    // InternalBlockchain.g:553:1: entryRuleExpresionReferenciada : ruleExpresionReferenciada EOF ;
    public final void entryRuleExpresionReferenciada() throws RecognitionException {
        try {
            // InternalBlockchain.g:554:1: ( ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:555:1: ruleExpresionReferenciada EOF
            {
             before(grammarAccess.getExpresionReferenciadaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionReferenciada();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionReferenciada"


    // $ANTLR start "ruleExpresionReferenciada"
    // InternalBlockchain.g:562:1: ruleExpresionReferenciada : ( ( rule__ExpresionReferenciada__Group__0 ) ) ;
    public final void ruleExpresionReferenciada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:566:2: ( ( ( rule__ExpresionReferenciada__Group__0 ) ) )
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            {
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            // InternalBlockchain.g:568:3: ( rule__ExpresionReferenciada__Group__0 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 
            // InternalBlockchain.g:569:3: ( rule__ExpresionReferenciada__Group__0 )
            // InternalBlockchain.g:569:4: rule__ExpresionReferenciada__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionReferenciada"


    // $ANTLR start "entryRuleExpresionRelacional"
    // InternalBlockchain.g:578:1: entryRuleExpresionRelacional : ruleExpresionRelacional EOF ;
    public final void entryRuleExpresionRelacional() throws RecognitionException {
        try {
            // InternalBlockchain.g:579:1: ( ruleExpresionRelacional EOF )
            // InternalBlockchain.g:580:1: ruleExpresionRelacional EOF
            {
             before(grammarAccess.getExpresionRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpresionRelacional();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpresionRelacional"


    // $ANTLR start "ruleExpresionRelacional"
    // InternalBlockchain.g:587:1: ruleExpresionRelacional : ( ( rule__ExpresionRelacional__Group__0 ) ) ;
    public final void ruleExpresionRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:591:2: ( ( ( rule__ExpresionRelacional__Group__0 ) ) )
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            {
            // InternalBlockchain.g:592:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            // InternalBlockchain.g:593:3: ( rule__ExpresionRelacional__Group__0 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup()); 
            // InternalBlockchain.g:594:3: ( rule__ExpresionRelacional__Group__0 )
            // InternalBlockchain.g:594:4: rule__ExpresionRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpresionRelacional"


    // $ANTLR start "entryRuleRetorno"
    // InternalBlockchain.g:603:1: entryRuleRetorno : ruleRetorno EOF ;
    public final void entryRuleRetorno() throws RecognitionException {
        try {
            // InternalBlockchain.g:604:1: ( ruleRetorno EOF )
            // InternalBlockchain.g:605:1: ruleRetorno EOF
            {
             before(grammarAccess.getRetornoRule()); 
            pushFollow(FOLLOW_1);
            ruleRetorno();

            state._fsp--;

             after(grammarAccess.getRetornoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRetorno"


    // $ANTLR start "ruleRetorno"
    // InternalBlockchain.g:612:1: ruleRetorno : ( ( rule__Retorno__Group__0 ) ) ;
    public final void ruleRetorno() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:616:2: ( ( ( rule__Retorno__Group__0 ) ) )
            // InternalBlockchain.g:617:2: ( ( rule__Retorno__Group__0 ) )
            {
            // InternalBlockchain.g:617:2: ( ( rule__Retorno__Group__0 ) )
            // InternalBlockchain.g:618:3: ( rule__Retorno__Group__0 )
            {
             before(grammarAccess.getRetornoAccess().getGroup()); 
            // InternalBlockchain.g:619:3: ( rule__Retorno__Group__0 )
            // InternalBlockchain.g:619:4: rule__Retorno__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Retorno__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRetornoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRetorno"


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:628:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:629:1: ( ruleEDouble EOF )
            // InternalBlockchain.g:630:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalBlockchain.g:637:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:641:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBlockchain.g:642:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBlockchain.g:642:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBlockchain.g:643:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBlockchain.g:644:3: ( rule__EDouble__Group__0 )
            // InternalBlockchain.g:644:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalBlockchain.g:653:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBlockchain.g:654:1: ( ruleEInt EOF )
            // InternalBlockchain.g:655:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBlockchain.g:662:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:666:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBlockchain.g:667:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBlockchain.g:667:2: ( ( rule__EInt__Group__0 ) )
            // InternalBlockchain.g:668:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBlockchain.g:669:3: ( rule__EInt__Group__0 )
            // InternalBlockchain.g:669:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePrimitivo"
    // InternalBlockchain.g:678:1: entryRulePrimitivo : rulePrimitivo EOF ;
    public final void entryRulePrimitivo() throws RecognitionException {
        try {
            // InternalBlockchain.g:679:1: ( rulePrimitivo EOF )
            // InternalBlockchain.g:680:1: rulePrimitivo EOF
            {
             before(grammarAccess.getPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitivo();

            state._fsp--;

             after(grammarAccess.getPrimitivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitivo"


    // $ANTLR start "rulePrimitivo"
    // InternalBlockchain.g:687:1: rulePrimitivo : ( ( rule__Primitivo__Group__0 ) ) ;
    public final void rulePrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:691:2: ( ( ( rule__Primitivo__Group__0 ) ) )
            // InternalBlockchain.g:692:2: ( ( rule__Primitivo__Group__0 ) )
            {
            // InternalBlockchain.g:692:2: ( ( rule__Primitivo__Group__0 ) )
            // InternalBlockchain.g:693:3: ( rule__Primitivo__Group__0 )
            {
             before(grammarAccess.getPrimitivoAccess().getGroup()); 
            // InternalBlockchain.g:694:3: ( rule__Primitivo__Group__0 )
            // InternalBlockchain.g:694:4: rule__Primitivo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitivo"


    // $ANTLR start "entryRuleMapa"
    // InternalBlockchain.g:703:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // InternalBlockchain.g:704:1: ( ruleMapa EOF )
            // InternalBlockchain.g:705:1: ruleMapa EOF
            {
             before(grammarAccess.getMapaRule()); 
            pushFollow(FOLLOW_1);
            ruleMapa();

            state._fsp--;

             after(grammarAccess.getMapaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapa"


    // $ANTLR start "ruleMapa"
    // InternalBlockchain.g:712:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:716:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // InternalBlockchain.g:717:2: ( ( rule__Mapa__Group__0 ) )
            {
            // InternalBlockchain.g:717:2: ( ( rule__Mapa__Group__0 ) )
            // InternalBlockchain.g:718:3: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // InternalBlockchain.g:719:3: ( rule__Mapa__Group__0 )
            // InternalBlockchain.g:719:4: rule__Mapa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapa"


    // $ANTLR start "ruleOperadorLogico"
    // InternalBlockchain.g:728:1: ruleOperadorLogico : ( ( rule__OperadorLogico__Alternatives ) ) ;
    public final void ruleOperadorLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:732:1: ( ( ( rule__OperadorLogico__Alternatives ) ) )
            // InternalBlockchain.g:733:2: ( ( rule__OperadorLogico__Alternatives ) )
            {
            // InternalBlockchain.g:733:2: ( ( rule__OperadorLogico__Alternatives ) )
            // InternalBlockchain.g:734:3: ( rule__OperadorLogico__Alternatives )
            {
             before(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 
            // InternalBlockchain.g:735:3: ( rule__OperadorLogico__Alternatives )
            // InternalBlockchain.g:735:4: rule__OperadorLogico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperadorLogico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperadorLogico"


    // $ANTLR start "ruleOperador"
    // InternalBlockchain.g:744:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:748:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalBlockchain.g:749:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalBlockchain.g:749:2: ( ( rule__Operador__Alternatives ) )
            // InternalBlockchain.g:750:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalBlockchain.g:751:3: ( rule__Operador__Alternatives )
            // InternalBlockchain.g:751:4: rule__Operador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleOperadorRelacion"
    // InternalBlockchain.g:760:1: ruleOperadorRelacion : ( ( '.' ) ) ;
    public final void ruleOperadorRelacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:764:1: ( ( ( '.' ) ) )
            // InternalBlockchain.g:765:2: ( ( '.' ) )
            {
            // InternalBlockchain.g:765:2: ( ( '.' ) )
            // InternalBlockchain.g:766:3: ( '.' )
            {
             before(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 
            // InternalBlockchain.g:767:3: ( '.' )
            // InternalBlockchain.g:767:4: '.'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperadorRelacion"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalBlockchain.g:776:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:780:1: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalBlockchain.g:781:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalBlockchain.g:781:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalBlockchain.g:782:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalBlockchain.g:783:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalBlockchain.g:783:4: rule__DatoPrimitivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatoPrimitivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalBlockchain.g:791:1: rule__TipoDato__Alternatives : ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:795:1: ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt1=2;
                }
                break;
            case 62:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBlockchain.g:796:2: ( ruleEntidad )
                    {
                    // InternalBlockchain.g:796:2: ( ruleEntidad )
                    // InternalBlockchain.g:797:3: ruleEntidad
                    {
                     before(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntidad();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getEntidadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:802:2: ( rulePrimitivo )
                    {
                    // InternalBlockchain.g:802:2: ( rulePrimitivo )
                    // InternalBlockchain.g:803:3: rulePrimitivo
                    {
                     before(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitivo();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getPrimitivoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:808:2: ( ruleMapa )
                    {
                    // InternalBlockchain.g:808:2: ( ruleMapa )
                    // InternalBlockchain.g:809:3: ruleMapa
                    {
                     before(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMapa();

                    state._fsp--;

                     after(grammarAccess.getTipoDatoAccess().getMapaParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoDato__Alternatives"


    // $ANTLR start "rule__Linea__Alternatives"
    // InternalBlockchain.g:818:1: rule__Linea__Alternatives : ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleRetorno ) );
    public final void rule__Linea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:822:1: ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) | ( ruleRetorno ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
                {
                alt2=1;
                }
                break;
            case 52:
                {
                alt2=2;
                }
                break;
            case 53:
                {
                alt2=3;
                }
                break;
            case 61:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:823:2: ( ruleExpresion )
                    {
                    // InternalBlockchain.g:823:2: ( ruleExpresion )
                    // InternalBlockchain.g:824:3: ruleExpresion
                    {
                     before(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresion();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getExpresionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:829:2: ( ruleVariable )
                    {
                    // InternalBlockchain.g:829:2: ( ruleVariable )
                    // InternalBlockchain.g:830:3: ruleVariable
                    {
                     before(grammarAccess.getLineaAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:835:2: ( ruleCondicional )
                    {
                    // InternalBlockchain.g:835:2: ( ruleCondicional )
                    // InternalBlockchain.g:836:3: ruleCondicional
                    {
                     before(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCondicional();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:841:2: ( ruleRetorno )
                    {
                    // InternalBlockchain.g:841:2: ( ruleRetorno )
                    // InternalBlockchain.g:842:3: ruleRetorno
                    {
                     before(grammarAccess.getLineaAccess().getRetornoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRetorno();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getRetornoParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linea__Alternatives"


    // $ANTLR start "rule__Expresion__Alternatives"
    // InternalBlockchain.g:851:1: rule__Expresion__Alternatives : ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:855:1: ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            case 55:
                {
                alt3=3;
                }
                break;
            case 56:
                {
                alt3=4;
                }
                break;
            case 57:
                {
                alt3=5;
                }
                break;
            case 58:
                {
                alt3=6;
                }
                break;
            case 60:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBlockchain.g:856:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:856:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:857:3: ruleExpresionLogica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionLogica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionLogicaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:862:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:862:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:863:3: ruleExpresionAritmetica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionAritmetica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionAritmeticaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:868:2: ( ruleExpresionNumerica )
                    {
                    // InternalBlockchain.g:868:2: ( ruleExpresionNumerica )
                    // InternalBlockchain.g:869:3: ruleExpresionNumerica
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionNumerica();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionNumericaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:874:2: ( ruleExpresionTexto )
                    {
                    // InternalBlockchain.g:874:2: ( ruleExpresionTexto )
                    // InternalBlockchain.g:875:3: ruleExpresionTexto
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionTexto();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionTextoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:880:2: ( ruleExpresionBoolean )
                    {
                    // InternalBlockchain.g:880:2: ( ruleExpresionBoolean )
                    // InternalBlockchain.g:881:3: ruleExpresionBoolean
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionBoolean();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:886:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:886:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:887:3: ruleExpresionReferenciada
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionReferenciada();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionReferenciadaParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:892:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:892:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:893:3: ruleExpresionRelacional
                    {
                     before(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpresionRelacional();

                    state._fsp--;

                     after(grammarAccess.getExpresionAccess().getExpresionRelacionalParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expresion__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBlockchain.g:902:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:906:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlockchain.g:907:2: ( RULE_STRING )
                    {
                    // InternalBlockchain.g:907:2: ( RULE_STRING )
                    // InternalBlockchain.g:908:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:913:2: ( RULE_ID )
                    {
                    // InternalBlockchain.g:913:2: ( RULE_ID )
                    // InternalBlockchain.g:914:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalBlockchain.g:923:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:927:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlockchain.g:928:2: ( 'true' )
                    {
                    // InternalBlockchain.g:928:2: ( 'true' )
                    // InternalBlockchain.g:929:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:934:2: ( 'false' )
                    {
                    // InternalBlockchain.g:934:2: ( 'false' )
                    // InternalBlockchain.g:935:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalBlockchain.g:944:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:948:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlockchain.g:949:2: ( 'E' )
                    {
                    // InternalBlockchain.g:949:2: ( 'E' )
                    // InternalBlockchain.g:950:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:955:2: ( 'e' )
                    {
                    // InternalBlockchain.g:955:2: ( 'e' )
                    // InternalBlockchain.g:956:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__OperadorLogico__Alternatives"
    // InternalBlockchain.g:965:1: rule__OperadorLogico__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__OperadorLogico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:969:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBlockchain.g:970:2: ( ( '==' ) )
                    {
                    // InternalBlockchain.g:970:2: ( ( '==' ) )
                    // InternalBlockchain.g:971:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:972:3: ( '==' )
                    // InternalBlockchain.g:972:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:976:2: ( ( '!=' ) )
                    {
                    // InternalBlockchain.g:976:2: ( ( '!=' ) )
                    // InternalBlockchain.g:977:3: ( '!=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:978:3: ( '!=' )
                    // InternalBlockchain.g:978:4: '!='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:982:2: ( ( '>' ) )
                    {
                    // InternalBlockchain.g:982:2: ( ( '>' ) )
                    // InternalBlockchain.g:983:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:984:3: ( '>' )
                    // InternalBlockchain.g:984:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:988:2: ( ( '<' ) )
                    {
                    // InternalBlockchain.g:988:2: ( ( '<' ) )
                    // InternalBlockchain.g:989:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:990:3: ( '<' )
                    // InternalBlockchain.g:990:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:994:2: ( ( '>=' ) )
                    {
                    // InternalBlockchain.g:994:2: ( ( '>=' ) )
                    // InternalBlockchain.g:995:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:996:3: ( '>=' )
                    // InternalBlockchain.g:996:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1000:2: ( ( '<=' ) )
                    {
                    // InternalBlockchain.g:1000:2: ( ( '<=' ) )
                    // InternalBlockchain.g:1001:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1002:3: ( '<=' )
                    // InternalBlockchain.g:1002:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1006:2: ( ( '&&' ) )
                    {
                    // InternalBlockchain.g:1006:2: ( ( '&&' ) )
                    // InternalBlockchain.g:1007:3: ( '&&' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1008:3: ( '&&' )
                    // InternalBlockchain.g:1008:4: '&&'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:1012:2: ( ( '||' ) )
                    {
                    // InternalBlockchain.g:1012:2: ( ( '||' ) )
                    // InternalBlockchain.g:1013:3: ( '||' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:1014:3: ( '||' )
                    // InternalBlockchain.g:1014:4: '||'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperadorLogico__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // InternalBlockchain.g:1022:1: rule__Operador__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) | ( ( 'PUT' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1026:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) | ( ( 'PUT' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 30:
                {
                alt8=7;
                }
                break;
            case 31:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:1027:2: ( ( '+' ) )
                    {
                    // InternalBlockchain.g:1027:2: ( ( '+' ) )
                    // InternalBlockchain.g:1028:3: ( '+' )
                    {
                     before(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1029:3: ( '+' )
                    // InternalBlockchain.g:1029:4: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1033:2: ( ( '-' ) )
                    {
                    // InternalBlockchain.g:1033:2: ( ( '-' ) )
                    // InternalBlockchain.g:1034:3: ( '-' )
                    {
                     before(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1035:3: ( '-' )
                    // InternalBlockchain.g:1035:4: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1039:2: ( ( '*' ) )
                    {
                    // InternalBlockchain.g:1039:2: ( ( '*' ) )
                    // InternalBlockchain.g:1040:3: ( '*' )
                    {
                     before(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1041:3: ( '*' )
                    // InternalBlockchain.g:1041:4: '*'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1045:2: ( ( '/' ) )
                    {
                    // InternalBlockchain.g:1045:2: ( ( '/' ) )
                    // InternalBlockchain.g:1046:3: ( '/' )
                    {
                     before(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1047:3: ( '/' )
                    // InternalBlockchain.g:1047:4: '/'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:1051:2: ( ( '=' ) )
                    {
                    // InternalBlockchain.g:1051:2: ( ( '=' ) )
                    // InternalBlockchain.g:1052:3: ( '=' )
                    {
                     before(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:1053:3: ( '=' )
                    // InternalBlockchain.g:1053:4: '='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1057:2: ( ( 'GET' ) )
                    {
                    // InternalBlockchain.g:1057:2: ( ( 'GET' ) )
                    // InternalBlockchain.g:1058:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1059:3: ( 'GET' )
                    // InternalBlockchain.g:1059:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1063:2: ( ( 'DELETE' ) )
                    {
                    // InternalBlockchain.g:1063:2: ( ( 'DELETE' ) )
                    // InternalBlockchain.g:1064:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1065:3: ( 'DELETE' )
                    // InternalBlockchain.g:1065:4: 'DELETE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:1069:2: ( ( 'PUT' ) )
                    {
                    // InternalBlockchain.g:1069:2: ( ( 'PUT' ) )
                    // InternalBlockchain.g:1070:3: ( 'PUT' )
                    {
                     before(grammarAccess.getOperadorAccess().getPUTEnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:1071:3: ( 'PUT' )
                    // InternalBlockchain.g:1071:4: 'PUT'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPUTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalBlockchain.g:1079:1: rule__DatoPrimitivo__Alternatives : ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'ADDRESS' ) ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1083:1: ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'ADDRESS' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBlockchain.g:1084:2: ( ( 'String' ) )
                    {
                    // InternalBlockchain.g:1084:2: ( ( 'String' ) )
                    // InternalBlockchain.g:1085:3: ( 'String' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1086:3: ( 'String' )
                    // InternalBlockchain.g:1086:4: 'String'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1090:2: ( ( 'uint' ) )
                    {
                    // InternalBlockchain.g:1090:2: ( ( 'uint' ) )
                    // InternalBlockchain.g:1091:3: ( 'uint' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1092:3: ( 'uint' )
                    // InternalBlockchain.g:1092:4: 'uint'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1096:2: ( ( 'Boolean' ) )
                    {
                    // InternalBlockchain.g:1096:2: ( ( 'Boolean' ) )
                    // InternalBlockchain.g:1097:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1098:3: ( 'Boolean' )
                    // InternalBlockchain.g:1098:4: 'Boolean'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1102:2: ( ( 'ADDRESS' ) )
                    {
                    // InternalBlockchain.g:1102:2: ( ( 'ADDRESS' ) )
                    // InternalBlockchain.g:1103:3: ( 'ADDRESS' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1104:3: ( 'ADDRESS' )
                    // InternalBlockchain.g:1104:4: 'ADDRESS'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatoPrimitivo__Alternatives"


    // $ANTLR start "rule__Aplicacion__Group__0"
    // InternalBlockchain.g:1112:1: rule__Aplicacion__Group__0 : rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 ;
    public final void rule__Aplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1116:1: ( rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 )
            // InternalBlockchain.g:1117:2: rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Aplicacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__0"


    // $ANTLR start "rule__Aplicacion__Group__0__Impl"
    // InternalBlockchain.g:1124:1: rule__Aplicacion__Group__0__Impl : ( () ) ;
    public final void rule__Aplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1128:1: ( ( () ) )
            // InternalBlockchain.g:1129:1: ( () )
            {
            // InternalBlockchain.g:1129:1: ( () )
            // InternalBlockchain.g:1130:2: ()
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 
            // InternalBlockchain.g:1131:2: ()
            // InternalBlockchain.g:1131:3: 
            {
            }

             after(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group__1"
    // InternalBlockchain.g:1139:1: rule__Aplicacion__Group__1 : rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 ;
    public final void rule__Aplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1143:1: ( rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 )
            // InternalBlockchain.g:1144:2: rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Aplicacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__1"


    // $ANTLR start "rule__Aplicacion__Group__1__Impl"
    // InternalBlockchain.g:1151:1: rule__Aplicacion__Group__1__Impl : ( 'Aplicacion' ) ;
    public final void rule__Aplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1155:1: ( ( 'Aplicacion' ) )
            // InternalBlockchain.g:1156:1: ( 'Aplicacion' )
            {
            // InternalBlockchain.g:1156:1: ( 'Aplicacion' )
            // InternalBlockchain.g:1157:2: 'Aplicacion'
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group__2"
    // InternalBlockchain.g:1166:1: rule__Aplicacion__Group__2 : rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 ;
    public final void rule__Aplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1170:1: ( rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 )
            // InternalBlockchain.g:1171:2: rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Aplicacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__2"


    // $ANTLR start "rule__Aplicacion__Group__2__Impl"
    // InternalBlockchain.g:1178:1: rule__Aplicacion__Group__2__Impl : ( ( rule__Aplicacion__NameAssignment_2 ) ) ;
    public final void rule__Aplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1182:1: ( ( ( rule__Aplicacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1183:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1183:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1184:2: ( rule__Aplicacion__NameAssignment_2 )
            {
             before(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1185:2: ( rule__Aplicacion__NameAssignment_2 )
            // InternalBlockchain.g:1185:3: rule__Aplicacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__2__Impl"


    // $ANTLR start "rule__Aplicacion__Group__3"
    // InternalBlockchain.g:1193:1: rule__Aplicacion__Group__3 : rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 ;
    public final void rule__Aplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1197:1: ( rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 )
            // InternalBlockchain.g:1198:2: rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__3"


    // $ANTLR start "rule__Aplicacion__Group__3__Impl"
    // InternalBlockchain.g:1205:1: rule__Aplicacion__Group__3__Impl : ( '{' ) ;
    public final void rule__Aplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1209:1: ( ( '{' ) )
            // InternalBlockchain.g:1210:1: ( '{' )
            {
            // InternalBlockchain.g:1210:1: ( '{' )
            // InternalBlockchain.g:1211:2: '{'
            {
             before(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__3__Impl"


    // $ANTLR start "rule__Aplicacion__Group__4"
    // InternalBlockchain.g:1220:1: rule__Aplicacion__Group__4 : rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 ;
    public final void rule__Aplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1224:1: ( rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 )
            // InternalBlockchain.g:1225:2: rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__4"


    // $ANTLR start "rule__Aplicacion__Group__4__Impl"
    // InternalBlockchain.g:1232:1: rule__Aplicacion__Group__4__Impl : ( ( rule__Aplicacion__Group_4__0 )? ) ;
    public final void rule__Aplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1236:1: ( ( ( rule__Aplicacion__Group_4__0 )? ) )
            // InternalBlockchain.g:1237:1: ( ( rule__Aplicacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:1237:1: ( ( rule__Aplicacion__Group_4__0 )? )
            // InternalBlockchain.g:1238:2: ( rule__Aplicacion__Group_4__0 )?
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4()); 
            // InternalBlockchain.g:1239:2: ( rule__Aplicacion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:1239:3: rule__Aplicacion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAplicacionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__4__Impl"


    // $ANTLR start "rule__Aplicacion__Group__5"
    // InternalBlockchain.g:1247:1: rule__Aplicacion__Group__5 : rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 ;
    public final void rule__Aplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1251:1: ( rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 )
            // InternalBlockchain.g:1252:2: rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Aplicacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__5"


    // $ANTLR start "rule__Aplicacion__Group__5__Impl"
    // InternalBlockchain.g:1259:1: rule__Aplicacion__Group__5__Impl : ( ( rule__Aplicacion__Group_5__0 )* ) ;
    public final void rule__Aplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1263:1: ( ( ( rule__Aplicacion__Group_5__0 )* ) )
            // InternalBlockchain.g:1264:1: ( ( rule__Aplicacion__Group_5__0 )* )
            {
            // InternalBlockchain.g:1264:1: ( ( rule__Aplicacion__Group_5__0 )* )
            // InternalBlockchain.g:1265:2: ( rule__Aplicacion__Group_5__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5()); 
            // InternalBlockchain.g:1266:2: ( rule__Aplicacion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlockchain.g:1266:3: rule__Aplicacion__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Aplicacion__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__5__Impl"


    // $ANTLR start "rule__Aplicacion__Group__6"
    // InternalBlockchain.g:1274:1: rule__Aplicacion__Group__6 : rule__Aplicacion__Group__6__Impl ;
    public final void rule__Aplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1278:1: ( rule__Aplicacion__Group__6__Impl )
            // InternalBlockchain.g:1279:2: rule__Aplicacion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__6"


    // $ANTLR start "rule__Aplicacion__Group__6__Impl"
    // InternalBlockchain.g:1285:1: rule__Aplicacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Aplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1289:1: ( ( '}' ) )
            // InternalBlockchain.g:1290:1: ( '}' )
            {
            // InternalBlockchain.g:1290:1: ( '}' )
            // InternalBlockchain.g:1291:2: '}'
            {
             before(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group__6__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4__0"
    // InternalBlockchain.g:1301:1: rule__Aplicacion__Group_4__0 : rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 ;
    public final void rule__Aplicacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1305:1: ( rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 )
            // InternalBlockchain.g:1306:2: rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Aplicacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__0"


    // $ANTLR start "rule__Aplicacion__Group_4__0__Impl"
    // InternalBlockchain.g:1313:1: rule__Aplicacion__Group_4__0__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) ;
    public final void rule__Aplicacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1317:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) )
            // InternalBlockchain.g:1318:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1318:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            // InternalBlockchain.g:1319:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 
            // InternalBlockchain.g:1320:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            // InternalBlockchain.g:1320:3: rule__Aplicacion__SmartcontractAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__SmartcontractAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_4__1"
    // InternalBlockchain.g:1328:1: rule__Aplicacion__Group_4__1 : rule__Aplicacion__Group_4__1__Impl ;
    public final void rule__Aplicacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1332:1: ( rule__Aplicacion__Group_4__1__Impl )
            // InternalBlockchain.g:1333:2: rule__Aplicacion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__1"


    // $ANTLR start "rule__Aplicacion__Group_4__1__Impl"
    // InternalBlockchain.g:1339:1: rule__Aplicacion__Group_4__1__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) ;
    public final void rule__Aplicacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1343:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) )
            // InternalBlockchain.g:1344:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1344:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            // InternalBlockchain.g:1345:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 
            // InternalBlockchain.g:1346:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:1346:3: rule__Aplicacion__SmartcontractAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Aplicacion__SmartcontractAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_4__1__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__0"
    // InternalBlockchain.g:1355:1: rule__Aplicacion__Group_5__0 : rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 ;
    public final void rule__Aplicacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1359:1: ( rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 )
            // InternalBlockchain.g:1360:2: rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Aplicacion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__0"


    // $ANTLR start "rule__Aplicacion__Group_5__0__Impl"
    // InternalBlockchain.g:1367:1: rule__Aplicacion__Group_5__0__Impl : ( 'tipodato' ) ;
    public final void rule__Aplicacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1371:1: ( ( 'tipodato' ) )
            // InternalBlockchain.g:1372:1: ( 'tipodato' )
            {
            // InternalBlockchain.g:1372:1: ( 'tipodato' )
            // InternalBlockchain.g:1373:2: 'tipodato'
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__0__Impl"


    // $ANTLR start "rule__Aplicacion__Group_5__1"
    // InternalBlockchain.g:1382:1: rule__Aplicacion__Group_5__1 : rule__Aplicacion__Group_5__1__Impl ;
    public final void rule__Aplicacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1386:1: ( rule__Aplicacion__Group_5__1__Impl )
            // InternalBlockchain.g:1387:2: rule__Aplicacion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__1"


    // $ANTLR start "rule__Aplicacion__Group_5__1__Impl"
    // InternalBlockchain.g:1393:1: rule__Aplicacion__Group_5__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) ;
    public final void rule__Aplicacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1397:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) )
            // InternalBlockchain.g:1398:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            {
            // InternalBlockchain.g:1398:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            // InternalBlockchain.g:1399:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 
            // InternalBlockchain.g:1400:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            // InternalBlockchain.g:1400:3: rule__Aplicacion__TipodatoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicacion__TipodatoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__Group_5__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__0"
    // InternalBlockchain.g:1409:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1413:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalBlockchain.g:1414:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SmartContract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0"


    // $ANTLR start "rule__SmartContract__Group__0__Impl"
    // InternalBlockchain.g:1421:1: rule__SmartContract__Group__0__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1425:1: ( ( 'SmartContract' ) )
            // InternalBlockchain.g:1426:1: ( 'SmartContract' )
            {
            // InternalBlockchain.g:1426:1: ( 'SmartContract' )
            // InternalBlockchain.g:1427:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0__Impl"


    // $ANTLR start "rule__SmartContract__Group__1"
    // InternalBlockchain.g:1436:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1440:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalBlockchain.g:1441:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1"


    // $ANTLR start "rule__SmartContract__Group__1__Impl"
    // InternalBlockchain.g:1448:1: rule__SmartContract__Group__1__Impl : ( ( rule__SmartContract__NameAssignment_1 ) ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1452:1: ( ( ( rule__SmartContract__NameAssignment_1 ) ) )
            // InternalBlockchain.g:1453:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:1453:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            // InternalBlockchain.g:1454:2: ( rule__SmartContract__NameAssignment_1 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:1455:2: ( rule__SmartContract__NameAssignment_1 )
            // InternalBlockchain.g:1455:3: rule__SmartContract__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__2"
    // InternalBlockchain.g:1463:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1467:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalBlockchain.g:1468:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2"


    // $ANTLR start "rule__SmartContract__Group__2__Impl"
    // InternalBlockchain.g:1475:1: rule__SmartContract__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1479:1: ( ( '{' ) )
            // InternalBlockchain.g:1480:1: ( '{' )
            {
            // InternalBlockchain.g:1480:1: ( '{' )
            // InternalBlockchain.g:1481:2: '{'
            {
             before(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2__Impl"


    // $ANTLR start "rule__SmartContract__Group__3"
    // InternalBlockchain.g:1490:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1494:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalBlockchain.g:1495:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3"


    // $ANTLR start "rule__SmartContract__Group__3__Impl"
    // InternalBlockchain.g:1502:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )? ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1506:1: ( ( ( rule__SmartContract__Group_3__0 )? ) )
            // InternalBlockchain.g:1507:1: ( ( rule__SmartContract__Group_3__0 )? )
            {
            // InternalBlockchain.g:1507:1: ( ( rule__SmartContract__Group_3__0 )? )
            // InternalBlockchain.g:1508:2: ( rule__SmartContract__Group_3__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalBlockchain.g:1509:2: ( rule__SmartContract__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:1509:3: rule__SmartContract__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3__Impl"


    // $ANTLR start "rule__SmartContract__Group__4"
    // InternalBlockchain.g:1517:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1521:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalBlockchain.g:1522:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4"


    // $ANTLR start "rule__SmartContract__Group__4__Impl"
    // InternalBlockchain.g:1529:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__Group_4__0 )? ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1533:1: ( ( ( rule__SmartContract__Group_4__0 )? ) )
            // InternalBlockchain.g:1534:1: ( ( rule__SmartContract__Group_4__0 )? )
            {
            // InternalBlockchain.g:1534:1: ( ( rule__SmartContract__Group_4__0 )? )
            // InternalBlockchain.g:1535:2: ( rule__SmartContract__Group_4__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4()); 
            // InternalBlockchain.g:1536:2: ( rule__SmartContract__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlockchain.g:1536:3: rule__SmartContract__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4__Impl"


    // $ANTLR start "rule__SmartContract__Group__5"
    // InternalBlockchain.g:1544:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1548:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalBlockchain.g:1549:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SmartContract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5"


    // $ANTLR start "rule__SmartContract__Group__5__Impl"
    // InternalBlockchain.g:1556:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__Group_5__0 )? ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1560:1: ( ( ( rule__SmartContract__Group_5__0 )? ) )
            // InternalBlockchain.g:1561:1: ( ( rule__SmartContract__Group_5__0 )? )
            {
            // InternalBlockchain.g:1561:1: ( ( rule__SmartContract__Group_5__0 )? )
            // InternalBlockchain.g:1562:2: ( rule__SmartContract__Group_5__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5()); 
            // InternalBlockchain.g:1563:2: ( rule__SmartContract__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:1563:3: rule__SmartContract__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5__Impl"


    // $ANTLR start "rule__SmartContract__Group__6"
    // InternalBlockchain.g:1571:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1575:1: ( rule__SmartContract__Group__6__Impl )
            // InternalBlockchain.g:1576:2: rule__SmartContract__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6"


    // $ANTLR start "rule__SmartContract__Group__6__Impl"
    // InternalBlockchain.g:1582:1: rule__SmartContract__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1586:1: ( ( '}' ) )
            // InternalBlockchain.g:1587:1: ( '}' )
            {
            // InternalBlockchain.g:1587:1: ( '}' )
            // InternalBlockchain.g:1588:2: '}'
            {
             before(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__0"
    // InternalBlockchain.g:1598:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1602:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalBlockchain.g:1603:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__SmartContract__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0"


    // $ANTLR start "rule__SmartContract__Group_3__0__Impl"
    // InternalBlockchain.g:1610:1: rule__SmartContract__Group_3__0__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1614:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) )
            // InternalBlockchain.g:1615:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            {
            // InternalBlockchain.g:1615:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            // InternalBlockchain.g:1616:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 
            // InternalBlockchain.g:1617:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            // InternalBlockchain.g:1617:3: rule__SmartContract__EntidadesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EntidadesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__1"
    // InternalBlockchain.g:1625:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1629:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalBlockchain.g:1630:2: rule__SmartContract__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1"


    // $ANTLR start "rule__SmartContract__Group_3__1__Impl"
    // InternalBlockchain.g:1636:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1640:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) )
            // InternalBlockchain.g:1641:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            {
            // InternalBlockchain.g:1641:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            // InternalBlockchain.g:1642:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 
            // InternalBlockchain.g:1643:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:1643:3: rule__SmartContract__EntidadesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SmartContract__EntidadesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_4__0"
    // InternalBlockchain.g:1652:1: rule__SmartContract__Group_4__0 : rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 ;
    public final void rule__SmartContract__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1656:1: ( rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 )
            // InternalBlockchain.g:1657:2: rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__SmartContract__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__0"


    // $ANTLR start "rule__SmartContract__Group_4__0__Impl"
    // InternalBlockchain.g:1664:1: rule__SmartContract__Group_4__0__Impl : ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) ;
    public final void rule__SmartContract__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1668:1: ( ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) )
            // InternalBlockchain.g:1669:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1669:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            // InternalBlockchain.g:1670:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 
            // InternalBlockchain.g:1671:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            // InternalBlockchain.g:1671:3: rule__SmartContract__EstadoAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__EstadoAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_4__1"
    // InternalBlockchain.g:1679:1: rule__SmartContract__Group_4__1 : rule__SmartContract__Group_4__1__Impl ;
    public final void rule__SmartContract__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1683:1: ( rule__SmartContract__Group_4__1__Impl )
            // InternalBlockchain.g:1684:2: rule__SmartContract__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__1"


    // $ANTLR start "rule__SmartContract__Group_4__1__Impl"
    // InternalBlockchain.g:1690:1: rule__SmartContract__Group_4__1__Impl : ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) ;
    public final void rule__SmartContract__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1694:1: ( ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) )
            // InternalBlockchain.g:1695:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1695:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            // InternalBlockchain.g:1696:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 
            // InternalBlockchain.g:1697:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBlockchain.g:1697:3: rule__SmartContract__EstadoAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SmartContract__EstadoAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_4__1__Impl"


    // $ANTLR start "rule__SmartContract__Group_5__0"
    // InternalBlockchain.g:1706:1: rule__SmartContract__Group_5__0 : rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 ;
    public final void rule__SmartContract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1710:1: ( rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 )
            // InternalBlockchain.g:1711:2: rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SmartContract__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__0"


    // $ANTLR start "rule__SmartContract__Group_5__0__Impl"
    // InternalBlockchain.g:1718:1: rule__SmartContract__Group_5__0__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) ;
    public final void rule__SmartContract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1722:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) )
            // InternalBlockchain.g:1723:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            {
            // InternalBlockchain.g:1723:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            // InternalBlockchain.g:1724:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 
            // InternalBlockchain.g:1725:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            // InternalBlockchain.g:1725:3: rule__SmartContract__OperacionesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__OperacionesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_5__1"
    // InternalBlockchain.g:1733:1: rule__SmartContract__Group_5__1 : rule__SmartContract__Group_5__1__Impl ;
    public final void rule__SmartContract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1737:1: ( rule__SmartContract__Group_5__1__Impl )
            // InternalBlockchain.g:1738:2: rule__SmartContract__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__1"


    // $ANTLR start "rule__SmartContract__Group_5__1__Impl"
    // InternalBlockchain.g:1744:1: rule__SmartContract__Group_5__1__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) ;
    public final void rule__SmartContract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1748:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) )
            // InternalBlockchain.g:1749:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            {
            // InternalBlockchain.g:1749:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            // InternalBlockchain.g:1750:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 
            // InternalBlockchain.g:1751:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlockchain.g:1751:3: rule__SmartContract__OperacionesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SmartContract__OperacionesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_5__1__Impl"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalBlockchain.g:1760:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1764:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalBlockchain.g:1765:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalBlockchain.g:1772:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1776:1: ( ( () ) )
            // InternalBlockchain.g:1777:1: ( () )
            {
            // InternalBlockchain.g:1777:1: ( () )
            // InternalBlockchain.g:1778:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalBlockchain.g:1779:2: ()
            // InternalBlockchain.g:1779:3: 
            {
            }

             after(grammarAccess.getEntidadAccess().getEntidadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalBlockchain.g:1787:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1791:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalBlockchain.g:1792:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalBlockchain.g:1799:1: rule__Entidad__Group__1__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1803:1: ( ( 'Entidad' ) )
            // InternalBlockchain.g:1804:1: ( 'Entidad' )
            {
            // InternalBlockchain.g:1804:1: ( 'Entidad' )
            // InternalBlockchain.g:1805:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalBlockchain.g:1814:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1818:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalBlockchain.g:1819:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalBlockchain.g:1826:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1830:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1831:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1831:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalBlockchain.g:1832:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1833:2: ( rule__Entidad__NameAssignment_2 )
            // InternalBlockchain.g:1833:3: rule__Entidad__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalBlockchain.g:1841:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1845:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalBlockchain.g:1846:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalBlockchain.g:1853:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1857:1: ( ( '{' ) )
            // InternalBlockchain.g:1858:1: ( '{' )
            {
            // InternalBlockchain.g:1858:1: ( '{' )
            // InternalBlockchain.g:1859:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalBlockchain.g:1868:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1872:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalBlockchain.g:1873:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalBlockchain.g:1880:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )? ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1884:1: ( ( ( rule__Entidad__Group_4__0 )? ) )
            // InternalBlockchain.g:1885:1: ( ( rule__Entidad__Group_4__0 )? )
            {
            // InternalBlockchain.g:1885:1: ( ( rule__Entidad__Group_4__0 )? )
            // InternalBlockchain.g:1886:2: ( rule__Entidad__Group_4__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalBlockchain.g:1887:2: ( rule__Entidad__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:1887:3: rule__Entidad__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entidad__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntidadAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalBlockchain.g:1895:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1899:1: ( rule__Entidad__Group__5__Impl )
            // InternalBlockchain.g:1900:2: rule__Entidad__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalBlockchain.g:1906:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1910:1: ( ( '}' ) )
            // InternalBlockchain.g:1911:1: ( '}' )
            {
            // InternalBlockchain.g:1911:1: ( '}' )
            // InternalBlockchain.g:1912:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group_4__0"
    // InternalBlockchain.g:1922:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1926:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalBlockchain.g:1927:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0"


    // $ANTLR start "rule__Entidad__Group_4__0__Impl"
    // InternalBlockchain.g:1934:1: rule__Entidad__Group_4__0__Impl : ( ( rule__Entidad__AtributosAssignment_4_0 ) ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1938:1: ( ( ( rule__Entidad__AtributosAssignment_4_0 ) ) )
            // InternalBlockchain.g:1939:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1939:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            // InternalBlockchain.g:1940:2: ( rule__Entidad__AtributosAssignment_4_0 )
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 
            // InternalBlockchain.g:1941:2: ( rule__Entidad__AtributosAssignment_4_0 )
            // InternalBlockchain.g:1941:3: rule__Entidad__AtributosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__AtributosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0__Impl"


    // $ANTLR start "rule__Entidad__Group_4__1"
    // InternalBlockchain.g:1949:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1953:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalBlockchain.g:1954:2: rule__Entidad__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1"


    // $ANTLR start "rule__Entidad__Group_4__1__Impl"
    // InternalBlockchain.g:1960:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__AtributosAssignment_4_1 )* ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1964:1: ( ( ( rule__Entidad__AtributosAssignment_4_1 )* ) )
            // InternalBlockchain.g:1965:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1965:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            // InternalBlockchain.g:1966:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 
            // InternalBlockchain.g:1967:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:1967:3: rule__Entidad__AtributosAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entidad__AtributosAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1__Impl"


    // $ANTLR start "rule__Operacion__Group__0"
    // InternalBlockchain.g:1976:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1980:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // InternalBlockchain.g:1981:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Operacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0"


    // $ANTLR start "rule__Operacion__Group__0__Impl"
    // InternalBlockchain.g:1988:1: rule__Operacion__Group__0__Impl : ( 'Operacion' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1992:1: ( ( 'Operacion' ) )
            // InternalBlockchain.g:1993:1: ( 'Operacion' )
            {
            // InternalBlockchain.g:1993:1: ( 'Operacion' )
            // InternalBlockchain.g:1994:2: 'Operacion'
            {
             before(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__0__Impl"


    // $ANTLR start "rule__Operacion__Group__1"
    // InternalBlockchain.g:2003:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2007:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // InternalBlockchain.g:2008:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Operacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1"


    // $ANTLR start "rule__Operacion__Group__1__Impl"
    // InternalBlockchain.g:2015:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Group_1__0 )? ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2019:1: ( ( ( rule__Operacion__Group_1__0 )? ) )
            // InternalBlockchain.g:2020:1: ( ( rule__Operacion__Group_1__0 )? )
            {
            // InternalBlockchain.g:2020:1: ( ( rule__Operacion__Group_1__0 )? )
            // InternalBlockchain.g:2021:2: ( rule__Operacion__Group_1__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_1()); 
            // InternalBlockchain.g:2022:2: ( rule__Operacion__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBlockchain.g:2022:3: rule__Operacion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__1__Impl"


    // $ANTLR start "rule__Operacion__Group__2"
    // InternalBlockchain.g:2030:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2034:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // InternalBlockchain.g:2035:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Operacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2"


    // $ANTLR start "rule__Operacion__Group__2__Impl"
    // InternalBlockchain.g:2042:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__NameAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2046:1: ( ( ( rule__Operacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2047:1: ( ( rule__Operacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2047:1: ( ( rule__Operacion__NameAssignment_2 ) )
            // InternalBlockchain.g:2048:2: ( rule__Operacion__NameAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2049:2: ( rule__Operacion__NameAssignment_2 )
            // InternalBlockchain.g:2049:3: rule__Operacion__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__2__Impl"


    // $ANTLR start "rule__Operacion__Group__3"
    // InternalBlockchain.g:2057:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2061:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // InternalBlockchain.g:2062:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Operacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3"


    // $ANTLR start "rule__Operacion__Group__3__Impl"
    // InternalBlockchain.g:2069:1: rule__Operacion__Group__3__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2073:1: ( ( '(' ) )
            // InternalBlockchain.g:2074:1: ( '(' )
            {
            // InternalBlockchain.g:2074:1: ( '(' )
            // InternalBlockchain.g:2075:2: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__3__Impl"


    // $ANTLR start "rule__Operacion__Group__4"
    // InternalBlockchain.g:2084:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl rule__Operacion__Group__5 ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2088:1: ( rule__Operacion__Group__4__Impl rule__Operacion__Group__5 )
            // InternalBlockchain.g:2089:2: rule__Operacion__Group__4__Impl rule__Operacion__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Operacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4"


    // $ANTLR start "rule__Operacion__Group__4__Impl"
    // InternalBlockchain.g:2096:1: rule__Operacion__Group__4__Impl : ( ( rule__Operacion__Group_4__0 )? ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2100:1: ( ( ( rule__Operacion__Group_4__0 )? ) )
            // InternalBlockchain.g:2101:1: ( ( rule__Operacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:2101:1: ( ( rule__Operacion__Group_4__0 )? )
            // InternalBlockchain.g:2102:2: ( rule__Operacion__Group_4__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_4()); 
            // InternalBlockchain.g:2103:2: ( rule__Operacion__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:2103:3: rule__Operacion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__4__Impl"


    // $ANTLR start "rule__Operacion__Group__5"
    // InternalBlockchain.g:2111:1: rule__Operacion__Group__5 : rule__Operacion__Group__5__Impl rule__Operacion__Group__6 ;
    public final void rule__Operacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2115:1: ( rule__Operacion__Group__5__Impl rule__Operacion__Group__6 )
            // InternalBlockchain.g:2116:2: rule__Operacion__Group__5__Impl rule__Operacion__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Operacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__5"


    // $ANTLR start "rule__Operacion__Group__5__Impl"
    // InternalBlockchain.g:2123:1: rule__Operacion__Group__5__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2127:1: ( ( ')' ) )
            // InternalBlockchain.g:2128:1: ( ')' )
            {
            // InternalBlockchain.g:2128:1: ( ')' )
            // InternalBlockchain.g:2129:2: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__5__Impl"


    // $ANTLR start "rule__Operacion__Group__6"
    // InternalBlockchain.g:2138:1: rule__Operacion__Group__6 : rule__Operacion__Group__6__Impl rule__Operacion__Group__7 ;
    public final void rule__Operacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2142:1: ( rule__Operacion__Group__6__Impl rule__Operacion__Group__7 )
            // InternalBlockchain.g:2143:2: rule__Operacion__Group__6__Impl rule__Operacion__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Operacion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__6"


    // $ANTLR start "rule__Operacion__Group__6__Impl"
    // InternalBlockchain.g:2150:1: rule__Operacion__Group__6__Impl : ( ( rule__Operacion__Group_6__0 )? ) ;
    public final void rule__Operacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2154:1: ( ( ( rule__Operacion__Group_6__0 )? ) )
            // InternalBlockchain.g:2155:1: ( ( rule__Operacion__Group_6__0 )? )
            {
            // InternalBlockchain.g:2155:1: ( ( rule__Operacion__Group_6__0 )? )
            // InternalBlockchain.g:2156:2: ( rule__Operacion__Group_6__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_6()); 
            // InternalBlockchain.g:2157:2: ( rule__Operacion__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:2157:3: rule__Operacion__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operacion__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__6__Impl"


    // $ANTLR start "rule__Operacion__Group__7"
    // InternalBlockchain.g:2165:1: rule__Operacion__Group__7 : rule__Operacion__Group__7__Impl rule__Operacion__Group__8 ;
    public final void rule__Operacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2169:1: ( rule__Operacion__Group__7__Impl rule__Operacion__Group__8 )
            // InternalBlockchain.g:2170:2: rule__Operacion__Group__7__Impl rule__Operacion__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__7"


    // $ANTLR start "rule__Operacion__Group__7__Impl"
    // InternalBlockchain.g:2177:1: rule__Operacion__Group__7__Impl : ( '{' ) ;
    public final void rule__Operacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2181:1: ( ( '{' ) )
            // InternalBlockchain.g:2182:1: ( '{' )
            {
            // InternalBlockchain.g:2182:1: ( '{' )
            // InternalBlockchain.g:2183:2: '{'
            {
             before(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__7__Impl"


    // $ANTLR start "rule__Operacion__Group__8"
    // InternalBlockchain.g:2192:1: rule__Operacion__Group__8 : rule__Operacion__Group__8__Impl rule__Operacion__Group__9 ;
    public final void rule__Operacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2196:1: ( rule__Operacion__Group__8__Impl rule__Operacion__Group__9 )
            // InternalBlockchain.g:2197:2: rule__Operacion__Group__8__Impl rule__Operacion__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__8"


    // $ANTLR start "rule__Operacion__Group__8__Impl"
    // InternalBlockchain.g:2204:1: rule__Operacion__Group__8__Impl : ( ( '(' )* ) ;
    public final void rule__Operacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2208:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2209:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2209:1: ( ( '(' )* )
            // InternalBlockchain.g:2210:2: ( '(' )*
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_8()); 
            // InternalBlockchain.g:2211:2: ( '(' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBlockchain.g:2211:3: '('
            	    {
            	    match(input,43,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__8__Impl"


    // $ANTLR start "rule__Operacion__Group__9"
    // InternalBlockchain.g:2219:1: rule__Operacion__Group__9 : rule__Operacion__Group__9__Impl rule__Operacion__Group__10 ;
    public final void rule__Operacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2223:1: ( rule__Operacion__Group__9__Impl rule__Operacion__Group__10 )
            // InternalBlockchain.g:2224:2: rule__Operacion__Group__9__Impl rule__Operacion__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__9"


    // $ANTLR start "rule__Operacion__Group__9__Impl"
    // InternalBlockchain.g:2231:1: rule__Operacion__Group__9__Impl : ( ( rule__Operacion__LineasAssignment_9 )* ) ;
    public final void rule__Operacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2235:1: ( ( ( rule__Operacion__LineasAssignment_9 )* ) )
            // InternalBlockchain.g:2236:1: ( ( rule__Operacion__LineasAssignment_9 )* )
            {
            // InternalBlockchain.g:2236:1: ( ( rule__Operacion__LineasAssignment_9 )* )
            // InternalBlockchain.g:2237:2: ( rule__Operacion__LineasAssignment_9 )*
            {
             before(grammarAccess.getOperacionAccess().getLineasAssignment_9()); 
            // InternalBlockchain.g:2238:2: ( rule__Operacion__LineasAssignment_9 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=50 && LA25_0<=53)||(LA25_0>=55 && LA25_0<=58)||(LA25_0>=60 && LA25_0<=61)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlockchain.g:2238:3: rule__Operacion__LineasAssignment_9
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Operacion__LineasAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLineasAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__9__Impl"


    // $ANTLR start "rule__Operacion__Group__10"
    // InternalBlockchain.g:2246:1: rule__Operacion__Group__10 : rule__Operacion__Group__10__Impl rule__Operacion__Group__11 ;
    public final void rule__Operacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2250:1: ( rule__Operacion__Group__10__Impl rule__Operacion__Group__11 )
            // InternalBlockchain.g:2251:2: rule__Operacion__Group__10__Impl rule__Operacion__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__10"


    // $ANTLR start "rule__Operacion__Group__10__Impl"
    // InternalBlockchain.g:2258:1: rule__Operacion__Group__10__Impl : ( ( ')' )* ) ;
    public final void rule__Operacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2262:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2263:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2263:1: ( ( ')' )* )
            // InternalBlockchain.g:2264:2: ( ')' )*
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_10()); 
            // InternalBlockchain.g:2265:2: ( ')' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:2265:3: ')'
            	    {
            	    match(input,44,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__10__Impl"


    // $ANTLR start "rule__Operacion__Group__11"
    // InternalBlockchain.g:2273:1: rule__Operacion__Group__11 : rule__Operacion__Group__11__Impl ;
    public final void rule__Operacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2277:1: ( rule__Operacion__Group__11__Impl )
            // InternalBlockchain.g:2278:2: rule__Operacion__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__11"


    // $ANTLR start "rule__Operacion__Group__11__Impl"
    // InternalBlockchain.g:2284:1: rule__Operacion__Group__11__Impl : ( '}' ) ;
    public final void rule__Operacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2288:1: ( ( '}' ) )
            // InternalBlockchain.g:2289:1: ( '}' )
            {
            // InternalBlockchain.g:2289:1: ( '}' )
            // InternalBlockchain.g:2290:2: '}'
            {
             before(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group__11__Impl"


    // $ANTLR start "rule__Operacion__Group_1__0"
    // InternalBlockchain.g:2300:1: rule__Operacion__Group_1__0 : rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 ;
    public final void rule__Operacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2304:1: ( rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 )
            // InternalBlockchain.g:2305:2: rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Operacion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__0"


    // $ANTLR start "rule__Operacion__Group_1__0__Impl"
    // InternalBlockchain.g:2312:1: rule__Operacion__Group_1__0__Impl : ( 'isUd=' ) ;
    public final void rule__Operacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2316:1: ( ( 'isUd=' ) )
            // InternalBlockchain.g:2317:1: ( 'isUd=' )
            {
            // InternalBlockchain.g:2317:1: ( 'isUd=' )
            // InternalBlockchain.g:2318:2: 'isUd='
            {
             before(grammarAccess.getOperacionAccess().getIsUdKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getIsUdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_1__1"
    // InternalBlockchain.g:2327:1: rule__Operacion__Group_1__1 : rule__Operacion__Group_1__1__Impl ;
    public final void rule__Operacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2331:1: ( rule__Operacion__Group_1__1__Impl )
            // InternalBlockchain.g:2332:2: rule__Operacion__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__1"


    // $ANTLR start "rule__Operacion__Group_1__1__Impl"
    // InternalBlockchain.g:2338:1: rule__Operacion__Group_1__1__Impl : ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) ;
    public final void rule__Operacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2342:1: ( ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) )
            // InternalBlockchain.g:2343:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            {
            // InternalBlockchain.g:2343:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            // InternalBlockchain.g:2344:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 
            // InternalBlockchain.g:2345:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            // InternalBlockchain.g:2345:3: rule__Operacion__EsUserDefinedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__EsUserDefinedAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_4__0"
    // InternalBlockchain.g:2354:1: rule__Operacion__Group_4__0 : rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 ;
    public final void rule__Operacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2358:1: ( rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 )
            // InternalBlockchain.g:2359:2: rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__Operacion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__0"


    // $ANTLR start "rule__Operacion__Group_4__0__Impl"
    // InternalBlockchain.g:2366:1: rule__Operacion__Group_4__0__Impl : ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) ;
    public final void rule__Operacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2370:1: ( ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) )
            // InternalBlockchain.g:2371:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:2371:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            // InternalBlockchain.g:2372:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 
            // InternalBlockchain.g:2373:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            // InternalBlockchain.g:2373:3: rule__Operacion__ParametrosAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__0__Impl"


    // $ANTLR start "rule__Operacion__Group_4__1"
    // InternalBlockchain.g:2381:1: rule__Operacion__Group_4__1 : rule__Operacion__Group_4__1__Impl ;
    public final void rule__Operacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2385:1: ( rule__Operacion__Group_4__1__Impl )
            // InternalBlockchain.g:2386:2: rule__Operacion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__1"


    // $ANTLR start "rule__Operacion__Group_4__1__Impl"
    // InternalBlockchain.g:2392:1: rule__Operacion__Group_4__1__Impl : ( ( rule__Operacion__Group_4_1__0 )* ) ;
    public final void rule__Operacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2396:1: ( ( ( rule__Operacion__Group_4_1__0 )* ) )
            // InternalBlockchain.g:2397:1: ( ( rule__Operacion__Group_4_1__0 )* )
            {
            // InternalBlockchain.g:2397:1: ( ( rule__Operacion__Group_4_1__0 )* )
            // InternalBlockchain.g:2398:2: ( rule__Operacion__Group_4_1__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_4_1()); 
            // InternalBlockchain.g:2399:2: ( rule__Operacion__Group_4_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlockchain.g:2399:3: rule__Operacion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Operacion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4__1__Impl"


    // $ANTLR start "rule__Operacion__Group_4_1__0"
    // InternalBlockchain.g:2408:1: rule__Operacion__Group_4_1__0 : rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 ;
    public final void rule__Operacion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2412:1: ( rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 )
            // InternalBlockchain.g:2413:2: rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__0"


    // $ANTLR start "rule__Operacion__Group_4_1__0__Impl"
    // InternalBlockchain.g:2420:1: rule__Operacion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operacion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2424:1: ( ( ',' ) )
            // InternalBlockchain.g:2425:1: ( ',' )
            {
            // InternalBlockchain.g:2425:1: ( ',' )
            // InternalBlockchain.g:2426:2: ','
            {
             before(grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__0__Impl"


    // $ANTLR start "rule__Operacion__Group_4_1__1"
    // InternalBlockchain.g:2435:1: rule__Operacion__Group_4_1__1 : rule__Operacion__Group_4_1__1__Impl ;
    public final void rule__Operacion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2439:1: ( rule__Operacion__Group_4_1__1__Impl )
            // InternalBlockchain.g:2440:2: rule__Operacion__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__1"


    // $ANTLR start "rule__Operacion__Group_4_1__1__Impl"
    // InternalBlockchain.g:2446:1: rule__Operacion__Group_4_1__1__Impl : ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) ;
    public final void rule__Operacion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2450:1: ( ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) )
            // InternalBlockchain.g:2451:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            {
            // InternalBlockchain.g:2451:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            // InternalBlockchain.g:2452:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 
            // InternalBlockchain.g:2453:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            // InternalBlockchain.g:2453:3: rule__Operacion__ParametrosAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__ParametrosAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_4_1__1__Impl"


    // $ANTLR start "rule__Operacion__Group_6__0"
    // InternalBlockchain.g:2462:1: rule__Operacion__Group_6__0 : rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 ;
    public final void rule__Operacion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2466:1: ( rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 )
            // InternalBlockchain.g:2467:2: rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Operacion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__0"


    // $ANTLR start "rule__Operacion__Group_6__0__Impl"
    // InternalBlockchain.g:2474:1: rule__Operacion__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Operacion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2478:1: ( ( ':' ) )
            // InternalBlockchain.g:2479:1: ( ':' )
            {
            // InternalBlockchain.g:2479:1: ( ':' )
            // InternalBlockchain.g:2480:2: ':'
            {
             before(grammarAccess.getOperacionAccess().getColonKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getColonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__0__Impl"


    // $ANTLR start "rule__Operacion__Group_6__1"
    // InternalBlockchain.g:2489:1: rule__Operacion__Group_6__1 : rule__Operacion__Group_6__1__Impl ;
    public final void rule__Operacion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2493:1: ( rule__Operacion__Group_6__1__Impl )
            // InternalBlockchain.g:2494:2: rule__Operacion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__1"


    // $ANTLR start "rule__Operacion__Group_6__1__Impl"
    // InternalBlockchain.g:2500:1: rule__Operacion__Group_6__1__Impl : ( ( rule__Operacion__RetornoAssignment_6_1 ) ) ;
    public final void rule__Operacion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2504:1: ( ( ( rule__Operacion__RetornoAssignment_6_1 ) ) )
            // InternalBlockchain.g:2505:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            {
            // InternalBlockchain.g:2505:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            // InternalBlockchain.g:2506:2: ( rule__Operacion__RetornoAssignment_6_1 )
            {
             before(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 
            // InternalBlockchain.g:2507:2: ( rule__Operacion__RetornoAssignment_6_1 )
            // InternalBlockchain.g:2507:3: rule__Operacion__RetornoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__RetornoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__Group_6__1__Impl"


    // $ANTLR start "rule__Estado__Group__0"
    // InternalBlockchain.g:2516:1: rule__Estado__Group__0 : rule__Estado__Group__0__Impl rule__Estado__Group__1 ;
    public final void rule__Estado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2520:1: ( rule__Estado__Group__0__Impl rule__Estado__Group__1 )
            // InternalBlockchain.g:2521:2: rule__Estado__Group__0__Impl rule__Estado__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Estado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__0"


    // $ANTLR start "rule__Estado__Group__0__Impl"
    // InternalBlockchain.g:2528:1: rule__Estado__Group__0__Impl : ( 'Estado' ) ;
    public final void rule__Estado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2532:1: ( ( 'Estado' ) )
            // InternalBlockchain.g:2533:1: ( 'Estado' )
            {
            // InternalBlockchain.g:2533:1: ( 'Estado' )
            // InternalBlockchain.g:2534:2: 'Estado'
            {
             before(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEstadoAccess().getEstadoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__0__Impl"


    // $ANTLR start "rule__Estado__Group__1"
    // InternalBlockchain.g:2543:1: rule__Estado__Group__1 : rule__Estado__Group__1__Impl rule__Estado__Group__2 ;
    public final void rule__Estado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2547:1: ( rule__Estado__Group__1__Impl rule__Estado__Group__2 )
            // InternalBlockchain.g:2548:2: rule__Estado__Group__1__Impl rule__Estado__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Estado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__1"


    // $ANTLR start "rule__Estado__Group__1__Impl"
    // InternalBlockchain.g:2555:1: rule__Estado__Group__1__Impl : ( ( rule__Estado__TipodatoAssignment_1 ) ) ;
    public final void rule__Estado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2559:1: ( ( ( rule__Estado__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2560:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2560:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2561:2: ( rule__Estado__TipodatoAssignment_1 )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2562:2: ( rule__Estado__TipodatoAssignment_1 )
            // InternalBlockchain.g:2562:3: rule__Estado__TipodatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Estado__TipodatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__1__Impl"


    // $ANTLR start "rule__Estado__Group__2"
    // InternalBlockchain.g:2570:1: rule__Estado__Group__2 : rule__Estado__Group__2__Impl ;
    public final void rule__Estado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2574:1: ( rule__Estado__Group__2__Impl )
            // InternalBlockchain.g:2575:2: rule__Estado__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estado__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__2"


    // $ANTLR start "rule__Estado__Group__2__Impl"
    // InternalBlockchain.g:2581:1: rule__Estado__Group__2__Impl : ( ( rule__Estado__NameAssignment_2 ) ) ;
    public final void rule__Estado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2585:1: ( ( ( rule__Estado__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2586:1: ( ( rule__Estado__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2586:1: ( ( rule__Estado__NameAssignment_2 ) )
            // InternalBlockchain.g:2587:2: ( rule__Estado__NameAssignment_2 )
            {
             before(grammarAccess.getEstadoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2588:2: ( rule__Estado__NameAssignment_2 )
            // InternalBlockchain.g:2588:3: rule__Estado__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Estado__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEstadoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalBlockchain.g:2597:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2601:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalBlockchain.g:2602:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalBlockchain.g:2609:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipodatoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2613:1: ( ( ( rule__Atributo__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2614:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2614:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2615:2: ( rule__Atributo__TipodatoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2616:2: ( rule__Atributo__TipodatoAssignment_0 )
            // InternalBlockchain.g:2616:3: rule__Atributo__TipodatoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__TipodatoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalBlockchain.g:2624:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2628:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalBlockchain.g:2629:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalBlockchain.g:2636:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__Group_1__0 )? ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2640:1: ( ( ( rule__Atributo__Group_1__0 )? ) )
            // InternalBlockchain.g:2641:1: ( ( rule__Atributo__Group_1__0 )? )
            {
            // InternalBlockchain.g:2641:1: ( ( rule__Atributo__Group_1__0 )? )
            // InternalBlockchain.g:2642:2: ( rule__Atributo__Group_1__0 )?
            {
             before(grammarAccess.getAtributoAccess().getGroup_1()); 
            // InternalBlockchain.g:2643:2: ( rule__Atributo__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBlockchain.g:2643:3: rule__Atributo__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atributo__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__2"
    // InternalBlockchain.g:2651:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2655:1: ( rule__Atributo__Group__2__Impl )
            // InternalBlockchain.g:2656:2: rule__Atributo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // InternalBlockchain.g:2662:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__NameAssignment_2 ) ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2666:1: ( ( ( rule__Atributo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2667:1: ( ( rule__Atributo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2667:1: ( ( rule__Atributo__NameAssignment_2 ) )
            // InternalBlockchain.g:2668:2: ( rule__Atributo__NameAssignment_2 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2669:2: ( rule__Atributo__NameAssignment_2 )
            // InternalBlockchain.g:2669:3: rule__Atributo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group_1__0"
    // InternalBlockchain.g:2678:1: rule__Atributo__Group_1__0 : rule__Atributo__Group_1__0__Impl rule__Atributo__Group_1__1 ;
    public final void rule__Atributo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2682:1: ( rule__Atributo__Group_1__0__Impl rule__Atributo__Group_1__1 )
            // InternalBlockchain.g:2683:2: rule__Atributo__Group_1__0__Impl rule__Atributo__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Atributo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_1__0"


    // $ANTLR start "rule__Atributo__Group_1__0__Impl"
    // InternalBlockchain.g:2690:1: rule__Atributo__Group_1__0__Impl : ( 'isId=' ) ;
    public final void rule__Atributo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2694:1: ( ( 'isId=' ) )
            // InternalBlockchain.g:2695:1: ( 'isId=' )
            {
            // InternalBlockchain.g:2695:1: ( 'isId=' )
            // InternalBlockchain.g:2696:2: 'isId='
            {
             before(grammarAccess.getAtributoAccess().getIsIdKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAtributoAccess().getIsIdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_1__0__Impl"


    // $ANTLR start "rule__Atributo__Group_1__1"
    // InternalBlockchain.g:2705:1: rule__Atributo__Group_1__1 : rule__Atributo__Group_1__1__Impl ;
    public final void rule__Atributo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2709:1: ( rule__Atributo__Group_1__1__Impl )
            // InternalBlockchain.g:2710:2: rule__Atributo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_1__1"


    // $ANTLR start "rule__Atributo__Group_1__1__Impl"
    // InternalBlockchain.g:2716:1: rule__Atributo__Group_1__1__Impl : ( ( rule__Atributo__IsIdAssignment_1_1 ) ) ;
    public final void rule__Atributo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2720:1: ( ( ( rule__Atributo__IsIdAssignment_1_1 ) ) )
            // InternalBlockchain.g:2721:1: ( ( rule__Atributo__IsIdAssignment_1_1 ) )
            {
            // InternalBlockchain.g:2721:1: ( ( rule__Atributo__IsIdAssignment_1_1 ) )
            // InternalBlockchain.g:2722:2: ( rule__Atributo__IsIdAssignment_1_1 )
            {
             before(grammarAccess.getAtributoAccess().getIsIdAssignment_1_1()); 
            // InternalBlockchain.g:2723:2: ( rule__Atributo__IsIdAssignment_1_1 )
            // InternalBlockchain.g:2723:3: rule__Atributo__IsIdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__IsIdAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getIsIdAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group_1__1__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalBlockchain.g:2732:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2736:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalBlockchain.g:2737:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // InternalBlockchain.g:2744:1: rule__Parametro__Group__0__Impl : ( ( rule__Parametro__TipodatoAssignment_0 ) ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2748:1: ( ( ( rule__Parametro__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2749:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2749:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2750:2: ( rule__Parametro__TipodatoAssignment_0 )
            {
             before(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2751:2: ( rule__Parametro__TipodatoAssignment_0 )
            // InternalBlockchain.g:2751:3: rule__Parametro__TipodatoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__TipodatoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // InternalBlockchain.g:2759:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2763:1: ( rule__Parametro__Group__1__Impl )
            // InternalBlockchain.g:2764:2: rule__Parametro__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // InternalBlockchain.g:2770:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__NameAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2774:1: ( ( ( rule__Parametro__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2775:1: ( ( rule__Parametro__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2775:1: ( ( rule__Parametro__NameAssignment_1 ) )
            // InternalBlockchain.g:2776:2: ( rule__Parametro__NameAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2777:2: ( rule__Parametro__NameAssignment_1 )
            // InternalBlockchain.g:2777:3: rule__Parametro__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__0"
    // InternalBlockchain.g:2786:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2790:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalBlockchain.g:2791:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0"


    // $ANTLR start "rule__ExpresionLogica__Group__0__Impl"
    // InternalBlockchain.g:2798:1: rule__ExpresionLogica__Group__0__Impl : ( 'ExpLog' ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2802:1: ( ( 'ExpLog' ) )
            // InternalBlockchain.g:2803:1: ( 'ExpLog' )
            {
            // InternalBlockchain.g:2803:1: ( 'ExpLog' )
            // InternalBlockchain.g:2804:2: 'ExpLog'
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__1"
    // InternalBlockchain.g:2813:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2817:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalBlockchain.g:2818:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionLogica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1"


    // $ANTLR start "rule__ExpresionLogica__Group__1__Impl"
    // InternalBlockchain.g:2825:1: rule__ExpresionLogica__Group__1__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2829:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2830:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2830:1: ( ( '(' )* )
            // InternalBlockchain.g:2831:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 
            // InternalBlockchain.g:2832:2: ( '(' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlockchain.g:2832:3: '('
            	    {
            	    match(input,43,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__2"
    // InternalBlockchain.g:2840:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2844:1: ( rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 )
            // InternalBlockchain.g:2845:2: rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2"


    // $ANTLR start "rule__ExpresionLogica__Group__2__Impl"
    // InternalBlockchain.g:2852:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2856:1: ( ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) )
            // InternalBlockchain.g:2857:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            {
            // InternalBlockchain.g:2857:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            // InternalBlockchain.g:2858:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 
            // InternalBlockchain.g:2859:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            // InternalBlockchain.g:2859:3: rule__ExpresionLogica__IzqAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__IzqAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__3"
    // InternalBlockchain.g:2867:1: rule__ExpresionLogica__Group__3 : rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 ;
    public final void rule__ExpresionLogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2871:1: ( rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 )
            // InternalBlockchain.g:2872:2: rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__3"


    // $ANTLR start "rule__ExpresionLogica__Group__3__Impl"
    // InternalBlockchain.g:2879:1: rule__ExpresionLogica__Group__3__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2883:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2884:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2884:1: ( ( ')' )* )
            // InternalBlockchain.g:2885:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 
            // InternalBlockchain.g:2886:2: ( ')' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBlockchain.g:2886:3: ')'
            	    {
            	    match(input,44,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__3__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__4"
    // InternalBlockchain.g:2894:1: rule__ExpresionLogica__Group__4 : rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 ;
    public final void rule__ExpresionLogica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2898:1: ( rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 )
            // InternalBlockchain.g:2899:2: rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__4"


    // $ANTLR start "rule__ExpresionLogica__Group__4__Impl"
    // InternalBlockchain.g:2906:1: rule__ExpresionLogica__Group__4__Impl : ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) ;
    public final void rule__ExpresionLogica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2910:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) )
            // InternalBlockchain.g:2911:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            {
            // InternalBlockchain.g:2911:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            // InternalBlockchain.g:2912:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 
            // InternalBlockchain.g:2913:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=16 && LA31_0<=23)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:2913:3: rule__ExpresionLogica__OperadorAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionLogica__OperadorAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__4__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__5"
    // InternalBlockchain.g:2921:1: rule__ExpresionLogica__Group__5 : rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 ;
    public final void rule__ExpresionLogica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2925:1: ( rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 )
            // InternalBlockchain.g:2926:2: rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__ExpresionLogica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__5"


    // $ANTLR start "rule__ExpresionLogica__Group__5__Impl"
    // InternalBlockchain.g:2933:1: rule__ExpresionLogica__Group__5__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2937:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2938:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2938:1: ( ( '(' )* )
            // InternalBlockchain.g:2939:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 
            // InternalBlockchain.g:2940:2: ( '(' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==43) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:2940:3: '('
            	    {
            	    match(input,43,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__5__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__6"
    // InternalBlockchain.g:2948:1: rule__ExpresionLogica__Group__6 : rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 ;
    public final void rule__ExpresionLogica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2952:1: ( rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 )
            // InternalBlockchain.g:2953:2: rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionLogica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__6"


    // $ANTLR start "rule__ExpresionLogica__Group__6__Impl"
    // InternalBlockchain.g:2960:1: rule__ExpresionLogica__Group__6__Impl : ( ( rule__ExpresionLogica__DerAssignment_6 ) ) ;
    public final void rule__ExpresionLogica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2964:1: ( ( ( rule__ExpresionLogica__DerAssignment_6 ) ) )
            // InternalBlockchain.g:2965:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            {
            // InternalBlockchain.g:2965:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            // InternalBlockchain.g:2966:2: ( rule__ExpresionLogica__DerAssignment_6 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 
            // InternalBlockchain.g:2967:2: ( rule__ExpresionLogica__DerAssignment_6 )
            // InternalBlockchain.g:2967:3: rule__ExpresionLogica__DerAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__DerAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__6__Impl"


    // $ANTLR start "rule__ExpresionLogica__Group__7"
    // InternalBlockchain.g:2975:1: rule__ExpresionLogica__Group__7 : rule__ExpresionLogica__Group__7__Impl ;
    public final void rule__ExpresionLogica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2979:1: ( rule__ExpresionLogica__Group__7__Impl )
            // InternalBlockchain.g:2980:2: rule__ExpresionLogica__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionLogica__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__7"


    // $ANTLR start "rule__ExpresionLogica__Group__7__Impl"
    // InternalBlockchain.g:2986:1: rule__ExpresionLogica__Group__7__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2990:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2991:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2991:1: ( ( ')' )* )
            // InternalBlockchain.g:2992:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 
            // InternalBlockchain.g:2993:2: ( ')' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBlockchain.g:2993:3: ')'
            	    {
            	    match(input,44,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__Group__7__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0"
    // InternalBlockchain.g:3002:1: rule__ExpresionAritmetica__Group__0 : rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 ;
    public final void rule__ExpresionAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3006:1: ( rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 )
            // InternalBlockchain.g:3007:2: rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpresionAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__0"


    // $ANTLR start "rule__ExpresionAritmetica__Group__0__Impl"
    // InternalBlockchain.g:3014:1: rule__ExpresionAritmetica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3018:1: ( ( () ) )
            // InternalBlockchain.g:3019:1: ( () )
            {
            // InternalBlockchain.g:3019:1: ( () )
            // InternalBlockchain.g:3020:2: ()
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 
            // InternalBlockchain.g:3021:2: ()
            // InternalBlockchain.g:3021:3: 
            {
            }

             after(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1"
    // InternalBlockchain.g:3029:1: rule__ExpresionAritmetica__Group__1 : rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 ;
    public final void rule__ExpresionAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3033:1: ( rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 )
            // InternalBlockchain.g:3034:2: rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionAritmetica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__1"


    // $ANTLR start "rule__ExpresionAritmetica__Group__1__Impl"
    // InternalBlockchain.g:3041:1: rule__ExpresionAritmetica__Group__1__Impl : ( 'ExpArit' ) ;
    public final void rule__ExpresionAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3045:1: ( ( 'ExpArit' ) )
            // InternalBlockchain.g:3046:1: ( 'ExpArit' )
            {
            // InternalBlockchain.g:3046:1: ( 'ExpArit' )
            // InternalBlockchain.g:3047:2: 'ExpArit'
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__2"
    // InternalBlockchain.g:3056:1: rule__ExpresionAritmetica__Group__2 : rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 ;
    public final void rule__ExpresionAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3060:1: ( rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 )
            // InternalBlockchain.g:3061:2: rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ExpresionAritmetica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__2"


    // $ANTLR start "rule__ExpresionAritmetica__Group__2__Impl"
    // InternalBlockchain.g:3068:1: rule__ExpresionAritmetica__Group__2__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3072:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:3073:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:3073:1: ( ( '(' )* )
            // InternalBlockchain.g:3074:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 
            // InternalBlockchain.g:3075:2: ( '(' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==43) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBlockchain.g:3075:3: '('
            	    {
            	    match(input,43,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__3"
    // InternalBlockchain.g:3083:1: rule__ExpresionAritmetica__Group__3 : rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 ;
    public final void rule__ExpresionAritmetica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3087:1: ( rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 )
            // InternalBlockchain.g:3088:2: rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionAritmetica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__3"


    // $ANTLR start "rule__ExpresionAritmetica__Group__3__Impl"
    // InternalBlockchain.g:3095:1: rule__ExpresionAritmetica__Group__3__Impl : ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) ;
    public final void rule__ExpresionAritmetica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3099:1: ( ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) )
            // InternalBlockchain.g:3100:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            {
            // InternalBlockchain.g:3100:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            // InternalBlockchain.g:3101:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 
            // InternalBlockchain.g:3102:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            // InternalBlockchain.g:3102:3: rule__ExpresionAritmetica__IzqAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__IzqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__3__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__4"
    // InternalBlockchain.g:3110:1: rule__ExpresionAritmetica__Group__4 : rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 ;
    public final void rule__ExpresionAritmetica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3114:1: ( rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 )
            // InternalBlockchain.g:3115:2: rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionAritmetica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__4"


    // $ANTLR start "rule__ExpresionAritmetica__Group__4__Impl"
    // InternalBlockchain.g:3122:1: rule__ExpresionAritmetica__Group__4__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3126:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3127:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3127:1: ( ( ')' )* )
            // InternalBlockchain.g:3128:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 
            // InternalBlockchain.g:3129:2: ( ')' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBlockchain.g:3129:3: ')'
            	    {
            	    match(input,44,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__4__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__5"
    // InternalBlockchain.g:3137:1: rule__ExpresionAritmetica__Group__5 : rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 ;
    public final void rule__ExpresionAritmetica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3141:1: ( rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 )
            // InternalBlockchain.g:3142:2: rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionAritmetica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__5"


    // $ANTLR start "rule__ExpresionAritmetica__Group__5__Impl"
    // InternalBlockchain.g:3149:1: rule__ExpresionAritmetica__Group__5__Impl : ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) ;
    public final void rule__ExpresionAritmetica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3153:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) )
            // InternalBlockchain.g:3154:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            {
            // InternalBlockchain.g:3154:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            // InternalBlockchain.g:3155:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 
            // InternalBlockchain.g:3156:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=24 && LA36_0<=31)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBlockchain.g:3156:3: rule__ExpresionAritmetica__OperadorAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionAritmetica__OperadorAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__5__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__6"
    // InternalBlockchain.g:3164:1: rule__ExpresionAritmetica__Group__6 : rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 ;
    public final void rule__ExpresionAritmetica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3168:1: ( rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 )
            // InternalBlockchain.g:3169:2: rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__ExpresionAritmetica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__6"


    // $ANTLR start "rule__ExpresionAritmetica__Group__6__Impl"
    // InternalBlockchain.g:3176:1: rule__ExpresionAritmetica__Group__6__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3180:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:3181:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:3181:1: ( ( '(' )* )
            // InternalBlockchain.g:3182:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 
            // InternalBlockchain.g:3183:2: ( '(' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==43) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBlockchain.g:3183:3: '('
            	    {
            	    match(input,43,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__6__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__7"
    // InternalBlockchain.g:3191:1: rule__ExpresionAritmetica__Group__7 : rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 ;
    public final void rule__ExpresionAritmetica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3195:1: ( rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 )
            // InternalBlockchain.g:3196:2: rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__ExpresionAritmetica__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__7"


    // $ANTLR start "rule__ExpresionAritmetica__Group__7__Impl"
    // InternalBlockchain.g:3203:1: rule__ExpresionAritmetica__Group__7__Impl : ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) ;
    public final void rule__ExpresionAritmetica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3207:1: ( ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) )
            // InternalBlockchain.g:3208:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            {
            // InternalBlockchain.g:3208:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            // InternalBlockchain.g:3209:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 
            // InternalBlockchain.g:3210:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            // InternalBlockchain.g:3210:3: rule__ExpresionAritmetica__DerAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__DerAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__7__Impl"


    // $ANTLR start "rule__ExpresionAritmetica__Group__8"
    // InternalBlockchain.g:3218:1: rule__ExpresionAritmetica__Group__8 : rule__ExpresionAritmetica__Group__8__Impl ;
    public final void rule__ExpresionAritmetica__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3222:1: ( rule__ExpresionAritmetica__Group__8__Impl )
            // InternalBlockchain.g:3223:2: rule__ExpresionAritmetica__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionAritmetica__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__8"


    // $ANTLR start "rule__ExpresionAritmetica__Group__8__Impl"
    // InternalBlockchain.g:3229:1: rule__ExpresionAritmetica__Group__8__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3233:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3234:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3234:1: ( ( ')' )* )
            // InternalBlockchain.g:3235:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 
            // InternalBlockchain.g:3236:2: ( ')' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==44) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBlockchain.g:3236:3: ')'
            	    {
            	    match(input,44,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__Group__8__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalBlockchain.g:3245:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3249:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBlockchain.g:3250:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalBlockchain.g:3257:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3261:1: ( ( 'var' ) )
            // InternalBlockchain.g:3262:1: ( 'var' )
            {
            // InternalBlockchain.g:3262:1: ( 'var' )
            // InternalBlockchain.g:3263:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalBlockchain.g:3272:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3276:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalBlockchain.g:3277:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalBlockchain.g:3284:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TipodatoAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3288:1: ( ( ( rule__Variable__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:3289:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:3289:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:3290:2: ( rule__Variable__TipodatoAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:3291:2: ( rule__Variable__TipodatoAssignment_1 )
            // InternalBlockchain.g:3291:3: rule__Variable__TipodatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TipodatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalBlockchain.g:3299:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3303:1: ( rule__Variable__Group__2__Impl )
            // InternalBlockchain.g:3304:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalBlockchain.g:3310:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3314:1: ( ( ( rule__Variable__NameAssignment_2 )? ) )
            // InternalBlockchain.g:3315:1: ( ( rule__Variable__NameAssignment_2 )? )
            {
            // InternalBlockchain.g:3315:1: ( ( rule__Variable__NameAssignment_2 )? )
            // InternalBlockchain.g:3316:2: ( rule__Variable__NameAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:3317:2: ( rule__Variable__NameAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:3317:3: rule__Variable__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Condicional__Group__0"
    // InternalBlockchain.g:3326:1: rule__Condicional__Group__0 : rule__Condicional__Group__0__Impl rule__Condicional__Group__1 ;
    public final void rule__Condicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3330:1: ( rule__Condicional__Group__0__Impl rule__Condicional__Group__1 )
            // InternalBlockchain.g:3331:2: rule__Condicional__Group__0__Impl rule__Condicional__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Condicional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0"


    // $ANTLR start "rule__Condicional__Group__0__Impl"
    // InternalBlockchain.g:3338:1: rule__Condicional__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3342:1: ( ( 'if' ) )
            // InternalBlockchain.g:3343:1: ( 'if' )
            {
            // InternalBlockchain.g:3343:1: ( 'if' )
            // InternalBlockchain.g:3344:2: 'if'
            {
             before(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0__Impl"


    // $ANTLR start "rule__Condicional__Group__1"
    // InternalBlockchain.g:3353:1: rule__Condicional__Group__1 : rule__Condicional__Group__1__Impl rule__Condicional__Group__2 ;
    public final void rule__Condicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3357:1: ( rule__Condicional__Group__1__Impl rule__Condicional__Group__2 )
            // InternalBlockchain.g:3358:2: rule__Condicional__Group__1__Impl rule__Condicional__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Condicional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__1"


    // $ANTLR start "rule__Condicional__Group__1__Impl"
    // InternalBlockchain.g:3365:1: rule__Condicional__Group__1__Impl : ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? ) ;
    public final void rule__Condicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3369:1: ( ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? ) )
            // InternalBlockchain.g:3370:1: ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? )
            {
            // InternalBlockchain.g:3370:1: ( ( rule__Condicional__ExpresionlogicaAssignment_1 )? )
            // InternalBlockchain.g:3371:2: ( rule__Condicional__ExpresionlogicaAssignment_1 )?
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_1()); 
            // InternalBlockchain.g:3372:2: ( rule__Condicional__ExpresionlogicaAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:3372:3: rule__Condicional__ExpresionlogicaAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ExpresionlogicaAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__1__Impl"


    // $ANTLR start "rule__Condicional__Group__2"
    // InternalBlockchain.g:3380:1: rule__Condicional__Group__2 : rule__Condicional__Group__2__Impl rule__Condicional__Group__3 ;
    public final void rule__Condicional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3384:1: ( rule__Condicional__Group__2__Impl rule__Condicional__Group__3 )
            // InternalBlockchain.g:3385:2: rule__Condicional__Group__2__Impl rule__Condicional__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Condicional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__2"


    // $ANTLR start "rule__Condicional__Group__2__Impl"
    // InternalBlockchain.g:3392:1: rule__Condicional__Group__2__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3396:1: ( ( '{' ) )
            // InternalBlockchain.g:3397:1: ( '{' )
            {
            // InternalBlockchain.g:3397:1: ( '{' )
            // InternalBlockchain.g:3398:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__2__Impl"


    // $ANTLR start "rule__Condicional__Group__3"
    // InternalBlockchain.g:3407:1: rule__Condicional__Group__3 : rule__Condicional__Group__3__Impl rule__Condicional__Group__4 ;
    public final void rule__Condicional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3411:1: ( rule__Condicional__Group__3__Impl rule__Condicional__Group__4 )
            // InternalBlockchain.g:3412:2: rule__Condicional__Group__3__Impl rule__Condicional__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Condicional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__3"


    // $ANTLR start "rule__Condicional__Group__3__Impl"
    // InternalBlockchain.g:3419:1: rule__Condicional__Group__3__Impl : ( ( rule__Condicional__LineasAssignment_3 )* ) ;
    public final void rule__Condicional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3423:1: ( ( ( rule__Condicional__LineasAssignment_3 )* ) )
            // InternalBlockchain.g:3424:1: ( ( rule__Condicional__LineasAssignment_3 )* )
            {
            // InternalBlockchain.g:3424:1: ( ( rule__Condicional__LineasAssignment_3 )* )
            // InternalBlockchain.g:3425:2: ( rule__Condicional__LineasAssignment_3 )*
            {
             before(grammarAccess.getCondicionalAccess().getLineasAssignment_3()); 
            // InternalBlockchain.g:3426:2: ( rule__Condicional__LineasAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=50 && LA41_0<=53)||(LA41_0>=55 && LA41_0<=58)||(LA41_0>=60 && LA41_0<=61)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBlockchain.g:3426:3: rule__Condicional__LineasAssignment_3
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Condicional__LineasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getLineasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__3__Impl"


    // $ANTLR start "rule__Condicional__Group__4"
    // InternalBlockchain.g:3434:1: rule__Condicional__Group__4 : rule__Condicional__Group__4__Impl rule__Condicional__Group__5 ;
    public final void rule__Condicional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3438:1: ( rule__Condicional__Group__4__Impl rule__Condicional__Group__5 )
            // InternalBlockchain.g:3439:2: rule__Condicional__Group__4__Impl rule__Condicional__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__Condicional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condicional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__4"


    // $ANTLR start "rule__Condicional__Group__4__Impl"
    // InternalBlockchain.g:3446:1: rule__Condicional__Group__4__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3450:1: ( ( '}' ) )
            // InternalBlockchain.g:3451:1: ( '}' )
            {
            // InternalBlockchain.g:3451:1: ( '}' )
            // InternalBlockchain.g:3452:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__4__Impl"


    // $ANTLR start "rule__Condicional__Group__5"
    // InternalBlockchain.g:3461:1: rule__Condicional__Group__5 : rule__Condicional__Group__5__Impl ;
    public final void rule__Condicional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3465:1: ( rule__Condicional__Group__5__Impl )
            // InternalBlockchain.g:3466:2: rule__Condicional__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condicional__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__5"


    // $ANTLR start "rule__Condicional__Group__5__Impl"
    // InternalBlockchain.g:3472:1: rule__Condicional__Group__5__Impl : ( ( rule__Condicional__ElseLinesAssignment_5 )? ) ;
    public final void rule__Condicional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3476:1: ( ( ( rule__Condicional__ElseLinesAssignment_5 )? ) )
            // InternalBlockchain.g:3477:1: ( ( rule__Condicional__ElseLinesAssignment_5 )? )
            {
            // InternalBlockchain.g:3477:1: ( ( rule__Condicional__ElseLinesAssignment_5 )? )
            // InternalBlockchain.g:3478:2: ( rule__Condicional__ElseLinesAssignment_5 )?
            {
             before(grammarAccess.getCondicionalAccess().getElseLinesAssignment_5()); 
            // InternalBlockchain.g:3479:2: ( rule__Condicional__ElseLinesAssignment_5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBlockchain.g:3479:3: rule__Condicional__ElseLinesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ElseLinesAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getElseLinesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__5__Impl"


    // $ANTLR start "rule__Else__Group__0"
    // InternalBlockchain.g:3488:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3492:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalBlockchain.g:3493:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Else__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // InternalBlockchain.g:3500:1: rule__Else__Group__0__Impl : ( 'else' ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3504:1: ( ( 'else' ) )
            // InternalBlockchain.g:3505:1: ( 'else' )
            {
            // InternalBlockchain.g:3505:1: ( 'else' )
            // InternalBlockchain.g:3506:2: 'else'
            {
             before(grammarAccess.getElseAccess().getElseKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // InternalBlockchain.g:3515:1: rule__Else__Group__1 : rule__Else__Group__1__Impl rule__Else__Group__2 ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3519:1: ( rule__Else__Group__1__Impl rule__Else__Group__2 )
            // InternalBlockchain.g:3520:2: rule__Else__Group__1__Impl rule__Else__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Else__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // InternalBlockchain.g:3527:1: rule__Else__Group__1__Impl : ( '{' ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3531:1: ( ( '{' ) )
            // InternalBlockchain.g:3532:1: ( '{' )
            {
            // InternalBlockchain.g:3532:1: ( '{' )
            // InternalBlockchain.g:3533:2: '{'
            {
             before(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1__Impl"


    // $ANTLR start "rule__Else__Group__2"
    // InternalBlockchain.g:3542:1: rule__Else__Group__2 : rule__Else__Group__2__Impl rule__Else__Group__3 ;
    public final void rule__Else__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3546:1: ( rule__Else__Group__2__Impl rule__Else__Group__3 )
            // InternalBlockchain.g:3547:2: rule__Else__Group__2__Impl rule__Else__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Else__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__2"


    // $ANTLR start "rule__Else__Group__2__Impl"
    // InternalBlockchain.g:3554:1: rule__Else__Group__2__Impl : ( ( rule__Else__LineasAssignment_2 )* ) ;
    public final void rule__Else__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3558:1: ( ( ( rule__Else__LineasAssignment_2 )* ) )
            // InternalBlockchain.g:3559:1: ( ( rule__Else__LineasAssignment_2 )* )
            {
            // InternalBlockchain.g:3559:1: ( ( rule__Else__LineasAssignment_2 )* )
            // InternalBlockchain.g:3560:2: ( rule__Else__LineasAssignment_2 )*
            {
             before(grammarAccess.getElseAccess().getLineasAssignment_2()); 
            // InternalBlockchain.g:3561:2: ( rule__Else__LineasAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=50 && LA43_0<=53)||(LA43_0>=55 && LA43_0<=58)||(LA43_0>=60 && LA43_0<=61)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBlockchain.g:3561:3: rule__Else__LineasAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Else__LineasAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getElseAccess().getLineasAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__2__Impl"


    // $ANTLR start "rule__Else__Group__3"
    // InternalBlockchain.g:3569:1: rule__Else__Group__3 : rule__Else__Group__3__Impl ;
    public final void rule__Else__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3573:1: ( rule__Else__Group__3__Impl )
            // InternalBlockchain.g:3574:2: rule__Else__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__3"


    // $ANTLR start "rule__Else__Group__3__Impl"
    // InternalBlockchain.g:3580:1: rule__Else__Group__3__Impl : ( '}' ) ;
    public final void rule__Else__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3584:1: ( ( '}' ) )
            // InternalBlockchain.g:3585:1: ( '}' )
            {
            // InternalBlockchain.g:3585:1: ( '}' )
            // InternalBlockchain.g:3586:2: '}'
            {
             before(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__3__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__0"
    // InternalBlockchain.g:3596:1: rule__ExpresionNumerica__Group__0 : rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 ;
    public final void rule__ExpresionNumerica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3600:1: ( rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 )
            // InternalBlockchain.g:3601:2: rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ExpresionNumerica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__0"


    // $ANTLR start "rule__ExpresionNumerica__Group__0__Impl"
    // InternalBlockchain.g:3608:1: rule__ExpresionNumerica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumerica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3612:1: ( ( () ) )
            // InternalBlockchain.g:3613:1: ( () )
            {
            // InternalBlockchain.g:3613:1: ( () )
            // InternalBlockchain.g:3614:2: ()
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 
            // InternalBlockchain.g:3615:2: ()
            // InternalBlockchain.g:3615:3: 
            {
            }

             after(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__0__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__1"
    // InternalBlockchain.g:3623:1: rule__ExpresionNumerica__Group__1 : rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 ;
    public final void rule__ExpresionNumerica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3627:1: ( rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 )
            // InternalBlockchain.g:3628:2: rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__ExpresionNumerica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__1"


    // $ANTLR start "rule__ExpresionNumerica__Group__1__Impl"
    // InternalBlockchain.g:3635:1: rule__ExpresionNumerica__Group__1__Impl : ( 'ExpNum' ) ;
    public final void rule__ExpresionNumerica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3639:1: ( ( 'ExpNum' ) )
            // InternalBlockchain.g:3640:1: ( 'ExpNum' )
            {
            // InternalBlockchain.g:3640:1: ( 'ExpNum' )
            // InternalBlockchain.g:3641:2: 'ExpNum'
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__1__Impl"


    // $ANTLR start "rule__ExpresionNumerica__Group__2"
    // InternalBlockchain.g:3650:1: rule__ExpresionNumerica__Group__2 : rule__ExpresionNumerica__Group__2__Impl ;
    public final void rule__ExpresionNumerica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3654:1: ( rule__ExpresionNumerica__Group__2__Impl )
            // InternalBlockchain.g:3655:2: rule__ExpresionNumerica__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionNumerica__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__2"


    // $ANTLR start "rule__ExpresionNumerica__Group__2__Impl"
    // InternalBlockchain.g:3661:1: rule__ExpresionNumerica__Group__2__Impl : ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumerica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3665:1: ( ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3666:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3666:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            // InternalBlockchain.g:3667:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3668:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA44_1 = input.LA(2);

                    if ( (LA44_1==RULE_INT||LA44_1==11) ) {
                        alt44=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt44=1;
                    }
                    break;
                case 11:
                    {
                    int LA44_3 = input.LA(2);

                    if ( (LA44_3==RULE_INT) ) {
                        alt44=1;
                    }
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // InternalBlockchain.g:3668:3: rule__ExpresionNumerica__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionNumerica__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__Group__2__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__0"
    // InternalBlockchain.g:3677:1: rule__ExpresionTexto__Group__0 : rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 ;
    public final void rule__ExpresionTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3681:1: ( rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 )
            // InternalBlockchain.g:3682:2: rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__ExpresionTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__0"


    // $ANTLR start "rule__ExpresionTexto__Group__0__Impl"
    // InternalBlockchain.g:3689:1: rule__ExpresionTexto__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3693:1: ( ( () ) )
            // InternalBlockchain.g:3694:1: ( () )
            {
            // InternalBlockchain.g:3694:1: ( () )
            // InternalBlockchain.g:3695:2: ()
            {
             before(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 
            // InternalBlockchain.g:3696:2: ()
            // InternalBlockchain.g:3696:3: 
            {
            }

             after(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__0__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__1"
    // InternalBlockchain.g:3704:1: rule__ExpresionTexto__Group__1 : rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 ;
    public final void rule__ExpresionTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3708:1: ( rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 )
            // InternalBlockchain.g:3709:2: rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExpresionTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__1"


    // $ANTLR start "rule__ExpresionTexto__Group__1__Impl"
    // InternalBlockchain.g:3716:1: rule__ExpresionTexto__Group__1__Impl : ( 'ExpTex' ) ;
    public final void rule__ExpresionTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3720:1: ( ( 'ExpTex' ) )
            // InternalBlockchain.g:3721:1: ( 'ExpTex' )
            {
            // InternalBlockchain.g:3721:1: ( 'ExpTex' )
            // InternalBlockchain.g:3722:2: 'ExpTex'
            {
             before(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__1__Impl"


    // $ANTLR start "rule__ExpresionTexto__Group__2"
    // InternalBlockchain.g:3731:1: rule__ExpresionTexto__Group__2 : rule__ExpresionTexto__Group__2__Impl ;
    public final void rule__ExpresionTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3735:1: ( rule__ExpresionTexto__Group__2__Impl )
            // InternalBlockchain.g:3736:2: rule__ExpresionTexto__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionTexto__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__2"


    // $ANTLR start "rule__ExpresionTexto__Group__2__Impl"
    // InternalBlockchain.g:3742:1: rule__ExpresionTexto__Group__2__Impl : ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3746:1: ( ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3747:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3747:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            // InternalBlockchain.g:3748:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3749:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBlockchain.g:3749:3: rule__ExpresionTexto__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionTexto__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__Group__2__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__0"
    // InternalBlockchain.g:3758:1: rule__ExpresionBoolean__Group__0 : rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 ;
    public final void rule__ExpresionBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3762:1: ( rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 )
            // InternalBlockchain.g:3763:2: rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ExpresionBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__0"


    // $ANTLR start "rule__ExpresionBoolean__Group__0__Impl"
    // InternalBlockchain.g:3770:1: rule__ExpresionBoolean__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3774:1: ( ( () ) )
            // InternalBlockchain.g:3775:1: ( () )
            {
            // InternalBlockchain.g:3775:1: ( () )
            // InternalBlockchain.g:3776:2: ()
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 
            // InternalBlockchain.g:3777:2: ()
            // InternalBlockchain.g:3777:3: 
            {
            }

             after(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__0__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__1"
    // InternalBlockchain.g:3785:1: rule__ExpresionBoolean__Group__1 : rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 ;
    public final void rule__ExpresionBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3789:1: ( rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 )
            // InternalBlockchain.g:3790:2: rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ExpresionBoolean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__1"


    // $ANTLR start "rule__ExpresionBoolean__Group__1__Impl"
    // InternalBlockchain.g:3797:1: rule__ExpresionBoolean__Group__1__Impl : ( 'ExpBool' ) ;
    public final void rule__ExpresionBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3801:1: ( ( 'ExpBool' ) )
            // InternalBlockchain.g:3802:1: ( 'ExpBool' )
            {
            // InternalBlockchain.g:3802:1: ( 'ExpBool' )
            // InternalBlockchain.g:3803:2: 'ExpBool'
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__1__Impl"


    // $ANTLR start "rule__ExpresionBoolean__Group__2"
    // InternalBlockchain.g:3812:1: rule__ExpresionBoolean__Group__2 : rule__ExpresionBoolean__Group__2__Impl ;
    public final void rule__ExpresionBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3816:1: ( rule__ExpresionBoolean__Group__2__Impl )
            // InternalBlockchain.g:3817:2: rule__ExpresionBoolean__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionBoolean__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__2"


    // $ANTLR start "rule__ExpresionBoolean__Group__2__Impl"
    // InternalBlockchain.g:3823:1: rule__ExpresionBoolean__Group__2__Impl : ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3827:1: ( ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3828:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3828:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            // InternalBlockchain.g:3829:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3830:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=12 && LA46_0<=13)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:3830:3: rule__ExpresionBoolean__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionBoolean__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0"
    // InternalBlockchain.g:3839:1: rule__ExpresionReferenciada__Group__0 : rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 ;
    public final void rule__ExpresionReferenciada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3843:1: ( rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 )
            // InternalBlockchain.g:3844:2: rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ExpresionReferenciada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__0"


    // $ANTLR start "rule__ExpresionReferenciada__Group__0__Impl"
    // InternalBlockchain.g:3851:1: rule__ExpresionReferenciada__Group__0__Impl : ( 'ExpRef' ) ;
    public final void rule__ExpresionReferenciada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3855:1: ( ( 'ExpRef' ) )
            // InternalBlockchain.g:3856:1: ( 'ExpRef' )
            {
            // InternalBlockchain.g:3856:1: ( 'ExpRef' )
            // InternalBlockchain.g:3857:2: 'ExpRef'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1"
    // InternalBlockchain.g:3866:1: rule__ExpresionReferenciada__Group__1 : rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 ;
    public final void rule__ExpresionReferenciada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3870:1: ( rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 )
            // InternalBlockchain.g:3871:2: rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__ExpresionReferenciada__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__1"


    // $ANTLR start "rule__ExpresionReferenciada__Group__1__Impl"
    // InternalBlockchain.g:3878:1: rule__ExpresionReferenciada__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpresionReferenciada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3882:1: ( ( '{' ) )
            // InternalBlockchain.g:3883:1: ( '{' )
            {
            // InternalBlockchain.g:3883:1: ( '{' )
            // InternalBlockchain.g:3884:2: '{'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__1__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__2"
    // InternalBlockchain.g:3893:1: rule__ExpresionReferenciada__Group__2 : rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 ;
    public final void rule__ExpresionReferenciada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3897:1: ( rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 )
            // InternalBlockchain.g:3898:2: rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ExpresionReferenciada__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__2"


    // $ANTLR start "rule__ExpresionReferenciada__Group__2__Impl"
    // InternalBlockchain.g:3905:1: rule__ExpresionReferenciada__Group__2__Impl : ( ( rule__ExpresionReferenciada__Group_2__0 )? ) ;
    public final void rule__ExpresionReferenciada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3909:1: ( ( ( rule__ExpresionReferenciada__Group_2__0 )? ) )
            // InternalBlockchain.g:3910:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            {
            // InternalBlockchain.g:3910:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            // InternalBlockchain.g:3911:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 
            // InternalBlockchain.g:3912:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBlockchain.g:3912:3: rule__ExpresionReferenciada__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionReferenciada__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__2__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__3"
    // InternalBlockchain.g:3920:1: rule__ExpresionReferenciada__Group__3 : rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 ;
    public final void rule__ExpresionReferenciada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3924:1: ( rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 )
            // InternalBlockchain.g:3925:2: rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__ExpresionReferenciada__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__3"


    // $ANTLR start "rule__ExpresionReferenciada__Group__3__Impl"
    // InternalBlockchain.g:3932:1: rule__ExpresionReferenciada__Group__3__Impl : ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) ;
    public final void rule__ExpresionReferenciada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3936:1: ( ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) )
            // InternalBlockchain.g:3937:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            {
            // InternalBlockchain.g:3937:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            // InternalBlockchain.g:3938:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 
            // InternalBlockchain.g:3939:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            // InternalBlockchain.g:3939:3: rule__ExpresionReferenciada__ReferenciaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__ReferenciaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__3__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group__4"
    // InternalBlockchain.g:3947:1: rule__ExpresionReferenciada__Group__4 : rule__ExpresionReferenciada__Group__4__Impl ;
    public final void rule__ExpresionReferenciada__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3951:1: ( rule__ExpresionReferenciada__Group__4__Impl )
            // InternalBlockchain.g:3952:2: rule__ExpresionReferenciada__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__4"


    // $ANTLR start "rule__ExpresionReferenciada__Group__4__Impl"
    // InternalBlockchain.g:3958:1: rule__ExpresionReferenciada__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpresionReferenciada__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3962:1: ( ( '}' ) )
            // InternalBlockchain.g:3963:1: ( '}' )
            {
            // InternalBlockchain.g:3963:1: ( '}' )
            // InternalBlockchain.g:3964:2: '}'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group__4__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__0"
    // InternalBlockchain.g:3974:1: rule__ExpresionReferenciada__Group_2__0 : rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 ;
    public final void rule__ExpresionReferenciada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3978:1: ( rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 )
            // InternalBlockchain.g:3979:2: rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__ExpresionReferenciada__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__0"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__0__Impl"
    // InternalBlockchain.g:3986:1: rule__ExpresionReferenciada__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionReferenciada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3990:1: ( ( 'id' ) )
            // InternalBlockchain.g:3991:1: ( 'id' )
            {
            // InternalBlockchain.g:3991:1: ( 'id' )
            // InternalBlockchain.g:3992:2: 'id'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__0__Impl"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__1"
    // InternalBlockchain.g:4001:1: rule__ExpresionReferenciada__Group_2__1 : rule__ExpresionReferenciada__Group_2__1__Impl ;
    public final void rule__ExpresionReferenciada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4005:1: ( rule__ExpresionReferenciada__Group_2__1__Impl )
            // InternalBlockchain.g:4006:2: rule__ExpresionReferenciada__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__1"


    // $ANTLR start "rule__ExpresionReferenciada__Group_2__1__Impl"
    // InternalBlockchain.g:4012:1: rule__ExpresionReferenciada__Group_2__1__Impl : ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionReferenciada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4016:1: ( ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:4017:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:4017:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            // InternalBlockchain.g:4018:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:4019:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            // InternalBlockchain.g:4019:3: rule__ExpresionReferenciada__IdAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionReferenciada__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__Group_2__1__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__0"
    // InternalBlockchain.g:4028:1: rule__ExpresionRelacional__Group__0 : rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 ;
    public final void rule__ExpresionRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4032:1: ( rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 )
            // InternalBlockchain.g:4033:2: rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__ExpresionRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__0"


    // $ANTLR start "rule__ExpresionRelacional__Group__0__Impl"
    // InternalBlockchain.g:4040:1: rule__ExpresionRelacional__Group__0__Impl : ( 'ExpRel' ) ;
    public final void rule__ExpresionRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4044:1: ( ( 'ExpRel' ) )
            // InternalBlockchain.g:4045:1: ( 'ExpRel' )
            {
            // InternalBlockchain.g:4045:1: ( 'ExpRel' )
            // InternalBlockchain.g:4046:2: 'ExpRel'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__0__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__1"
    // InternalBlockchain.g:4055:1: rule__ExpresionRelacional__Group__1 : rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 ;
    public final void rule__ExpresionRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4059:1: ( rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 )
            // InternalBlockchain.g:4060:2: rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__ExpresionRelacional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__1"


    // $ANTLR start "rule__ExpresionRelacional__Group__1__Impl"
    // InternalBlockchain.g:4067:1: rule__ExpresionRelacional__Group__1__Impl : ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4071:1: ( ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:4072:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:4072:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            // InternalBlockchain.g:4073:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:4074:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            // InternalBlockchain.g:4074:3: rule__ExpresionRelacional__IzqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__IzqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__1__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__2"
    // InternalBlockchain.g:4082:1: rule__ExpresionRelacional__Group__2 : rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 ;
    public final void rule__ExpresionRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4086:1: ( rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 )
            // InternalBlockchain.g:4087:2: rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__ExpresionRelacional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__2"


    // $ANTLR start "rule__ExpresionRelacional__Group__2__Impl"
    // InternalBlockchain.g:4094:1: rule__ExpresionRelacional__Group__2__Impl : ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) ;
    public final void rule__ExpresionRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4098:1: ( ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) )
            // InternalBlockchain.g:4099:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            {
            // InternalBlockchain.g:4099:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            // InternalBlockchain.g:4100:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 
            // InternalBlockchain.g:4101:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBlockchain.g:4101:3: rule__ExpresionRelacional__OperadorRelacionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpresionRelacional__OperadorRelacionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__2__Impl"


    // $ANTLR start "rule__ExpresionRelacional__Group__3"
    // InternalBlockchain.g:4109:1: rule__ExpresionRelacional__Group__3 : rule__ExpresionRelacional__Group__3__Impl ;
    public final void rule__ExpresionRelacional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4113:1: ( rule__ExpresionRelacional__Group__3__Impl )
            // InternalBlockchain.g:4114:2: rule__ExpresionRelacional__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__3"


    // $ANTLR start "rule__ExpresionRelacional__Group__3__Impl"
    // InternalBlockchain.g:4120:1: rule__ExpresionRelacional__Group__3__Impl : ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) ;
    public final void rule__ExpresionRelacional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4124:1: ( ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) )
            // InternalBlockchain.g:4125:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:4125:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            // InternalBlockchain.g:4126:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:4127:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            // InternalBlockchain.g:4127:3: rule__ExpresionRelacional__DerAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExpresionRelacional__DerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__Group__3__Impl"


    // $ANTLR start "rule__Retorno__Group__0"
    // InternalBlockchain.g:4136:1: rule__Retorno__Group__0 : rule__Retorno__Group__0__Impl rule__Retorno__Group__1 ;
    public final void rule__Retorno__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4140:1: ( rule__Retorno__Group__0__Impl rule__Retorno__Group__1 )
            // InternalBlockchain.g:4141:2: rule__Retorno__Group__0__Impl rule__Retorno__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Retorno__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retorno__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__0"


    // $ANTLR start "rule__Retorno__Group__0__Impl"
    // InternalBlockchain.g:4148:1: rule__Retorno__Group__0__Impl : ( 'return' ) ;
    public final void rule__Retorno__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4152:1: ( ( 'return' ) )
            // InternalBlockchain.g:4153:1: ( 'return' )
            {
            // InternalBlockchain.g:4153:1: ( 'return' )
            // InternalBlockchain.g:4154:2: 'return'
            {
             before(grammarAccess.getRetornoAccess().getReturnKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRetornoAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__0__Impl"


    // $ANTLR start "rule__Retorno__Group__1"
    // InternalBlockchain.g:4163:1: rule__Retorno__Group__1 : rule__Retorno__Group__1__Impl rule__Retorno__Group__2 ;
    public final void rule__Retorno__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4167:1: ( rule__Retorno__Group__1__Impl rule__Retorno__Group__2 )
            // InternalBlockchain.g:4168:2: rule__Retorno__Group__1__Impl rule__Retorno__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Retorno__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retorno__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__1"


    // $ANTLR start "rule__Retorno__Group__1__Impl"
    // InternalBlockchain.g:4175:1: rule__Retorno__Group__1__Impl : ( '{' ) ;
    public final void rule__Retorno__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4179:1: ( ( '{' ) )
            // InternalBlockchain.g:4180:1: ( '{' )
            {
            // InternalBlockchain.g:4180:1: ( '{' )
            // InternalBlockchain.g:4181:2: '{'
            {
             before(grammarAccess.getRetornoAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRetornoAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__1__Impl"


    // $ANTLR start "rule__Retorno__Group__2"
    // InternalBlockchain.g:4190:1: rule__Retorno__Group__2 : rule__Retorno__Group__2__Impl rule__Retorno__Group__3 ;
    public final void rule__Retorno__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4194:1: ( rule__Retorno__Group__2__Impl rule__Retorno__Group__3 )
            // InternalBlockchain.g:4195:2: rule__Retorno__Group__2__Impl rule__Retorno__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Retorno__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retorno__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__2"


    // $ANTLR start "rule__Retorno__Group__2__Impl"
    // InternalBlockchain.g:4202:1: rule__Retorno__Group__2__Impl : ( ( rule__Retorno__LineaRetornoAssignment_2 )* ) ;
    public final void rule__Retorno__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4206:1: ( ( ( rule__Retorno__LineaRetornoAssignment_2 )* ) )
            // InternalBlockchain.g:4207:1: ( ( rule__Retorno__LineaRetornoAssignment_2 )* )
            {
            // InternalBlockchain.g:4207:1: ( ( rule__Retorno__LineaRetornoAssignment_2 )* )
            // InternalBlockchain.g:4208:2: ( rule__Retorno__LineaRetornoAssignment_2 )*
            {
             before(grammarAccess.getRetornoAccess().getLineaRetornoAssignment_2()); 
            // InternalBlockchain.g:4209:2: ( rule__Retorno__LineaRetornoAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=50 && LA49_0<=53)||(LA49_0>=55 && LA49_0<=58)||(LA49_0>=60 && LA49_0<=61)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalBlockchain.g:4209:3: rule__Retorno__LineaRetornoAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Retorno__LineaRetornoAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getRetornoAccess().getLineaRetornoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__2__Impl"


    // $ANTLR start "rule__Retorno__Group__3"
    // InternalBlockchain.g:4217:1: rule__Retorno__Group__3 : rule__Retorno__Group__3__Impl ;
    public final void rule__Retorno__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4221:1: ( rule__Retorno__Group__3__Impl )
            // InternalBlockchain.g:4222:2: rule__Retorno__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Retorno__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__3"


    // $ANTLR start "rule__Retorno__Group__3__Impl"
    // InternalBlockchain.g:4228:1: rule__Retorno__Group__3__Impl : ( '}' ) ;
    public final void rule__Retorno__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4232:1: ( ( '}' ) )
            // InternalBlockchain.g:4233:1: ( '}' )
            {
            // InternalBlockchain.g:4233:1: ( '}' )
            // InternalBlockchain.g:4234:2: '}'
            {
             before(grammarAccess.getRetornoAccess().getRightCurlyBracketKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRetornoAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalBlockchain.g:4244:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4248:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBlockchain.g:4249:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalBlockchain.g:4256:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4260:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4261:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4261:1: ( ( '-' )? )
            // InternalBlockchain.g:4262:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4263:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:4263:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalBlockchain.g:4271:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4275:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBlockchain.g:4276:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalBlockchain.g:4283:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4287:1: ( ( ( RULE_INT )? ) )
            // InternalBlockchain.g:4288:1: ( ( RULE_INT )? )
            {
            // InternalBlockchain.g:4288:1: ( ( RULE_INT )? )
            // InternalBlockchain.g:4289:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBlockchain.g:4290:2: ( RULE_INT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBlockchain.g:4290:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalBlockchain.g:4298:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4302:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBlockchain.g:4303:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalBlockchain.g:4310:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4314:1: ( ( '.' ) )
            // InternalBlockchain.g:4315:1: ( '.' )
            {
            // InternalBlockchain.g:4315:1: ( '.' )
            // InternalBlockchain.g:4316:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalBlockchain.g:4325:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4329:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBlockchain.g:4330:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalBlockchain.g:4337:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4341:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4342:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4342:1: ( RULE_INT )
            // InternalBlockchain.g:4343:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalBlockchain.g:4352:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4356:1: ( rule__EDouble__Group__4__Impl )
            // InternalBlockchain.g:4357:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalBlockchain.g:4363:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4367:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBlockchain.g:4368:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBlockchain.g:4368:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBlockchain.g:4369:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBlockchain.g:4370:2: ( rule__EDouble__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=14 && LA52_0<=15)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBlockchain.g:4370:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalBlockchain.g:4379:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4383:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBlockchain.g:4384:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_46);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalBlockchain.g:4391:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4395:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBlockchain.g:4396:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBlockchain.g:4396:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBlockchain.g:4397:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBlockchain.g:4398:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBlockchain.g:4398:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalBlockchain.g:4406:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4410:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBlockchain.g:4411:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_46);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalBlockchain.g:4418:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4422:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4423:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4423:1: ( ( '-' )? )
            // InternalBlockchain.g:4424:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBlockchain.g:4425:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==25) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBlockchain.g:4425:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalBlockchain.g:4433:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4437:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBlockchain.g:4438:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalBlockchain.g:4444:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4448:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4449:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4449:1: ( RULE_INT )
            // InternalBlockchain.g:4450:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBlockchain.g:4460:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4464:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBlockchain.g:4465:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBlockchain.g:4472:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4476:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4477:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4477:1: ( ( '-' )? )
            // InternalBlockchain.g:4478:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4479:2: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBlockchain.g:4479:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBlockchain.g:4487:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4491:1: ( rule__EInt__Group__1__Impl )
            // InternalBlockchain.g:4492:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBlockchain.g:4498:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4502:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4503:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4503:1: ( RULE_INT )
            // InternalBlockchain.g:4504:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Primitivo__Group__0"
    // InternalBlockchain.g:4514:1: rule__Primitivo__Group__0 : rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 ;
    public final void rule__Primitivo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4518:1: ( rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 )
            // InternalBlockchain.g:4519:2: rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Primitivo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__0"


    // $ANTLR start "rule__Primitivo__Group__0__Impl"
    // InternalBlockchain.g:4526:1: rule__Primitivo__Group__0__Impl : ( () ) ;
    public final void rule__Primitivo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4530:1: ( ( () ) )
            // InternalBlockchain.g:4531:1: ( () )
            {
            // InternalBlockchain.g:4531:1: ( () )
            // InternalBlockchain.g:4532:2: ()
            {
             before(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 
            // InternalBlockchain.g:4533:2: ()
            // InternalBlockchain.g:4533:3: 
            {
            }

             after(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__0__Impl"


    // $ANTLR start "rule__Primitivo__Group__1"
    // InternalBlockchain.g:4541:1: rule__Primitivo__Group__1 : rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 ;
    public final void rule__Primitivo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4545:1: ( rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 )
            // InternalBlockchain.g:4546:2: rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__Primitivo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__1"


    // $ANTLR start "rule__Primitivo__Group__1__Impl"
    // InternalBlockchain.g:4553:1: rule__Primitivo__Group__1__Impl : ( ( rule__Primitivo__TipoAssignment_1 )? ) ;
    public final void rule__Primitivo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4557:1: ( ( ( rule__Primitivo__TipoAssignment_1 )? ) )
            // InternalBlockchain.g:4558:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            {
            // InternalBlockchain.g:4558:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            // InternalBlockchain.g:4559:2: ( rule__Primitivo__TipoAssignment_1 )?
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4560:2: ( rule__Primitivo__TipoAssignment_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=32 && LA55_0<=35)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBlockchain.g:4560:3: rule__Primitivo__TipoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitivo__TipoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__1__Impl"


    // $ANTLR start "rule__Primitivo__Group__2"
    // InternalBlockchain.g:4568:1: rule__Primitivo__Group__2 : rule__Primitivo__Group__2__Impl ;
    public final void rule__Primitivo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4572:1: ( rule__Primitivo__Group__2__Impl )
            // InternalBlockchain.g:4573:2: rule__Primitivo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__2"


    // $ANTLR start "rule__Primitivo__Group__2__Impl"
    // InternalBlockchain.g:4579:1: rule__Primitivo__Group__2__Impl : ( ( rule__Primitivo__NameAssignment_2 ) ) ;
    public final void rule__Primitivo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4583:1: ( ( ( rule__Primitivo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:4584:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:4584:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            // InternalBlockchain.g:4585:2: ( rule__Primitivo__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:4586:2: ( rule__Primitivo__NameAssignment_2 )
            // InternalBlockchain.g:4586:3: rule__Primitivo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Primitivo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__0"
    // InternalBlockchain.g:4595:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4599:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // InternalBlockchain.g:4600:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Mapa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__0"


    // $ANTLR start "rule__Mapa__Group__0__Impl"
    // InternalBlockchain.g:4607:1: rule__Mapa__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4611:1: ( ( 'Map' ) )
            // InternalBlockchain.g:4612:1: ( 'Map' )
            {
            // InternalBlockchain.g:4612:1: ( 'Map' )
            // InternalBlockchain.g:4613:2: 'Map'
            {
             before(grammarAccess.getMapaAccess().getMapKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__0__Impl"


    // $ANTLR start "rule__Mapa__Group__1"
    // InternalBlockchain.g:4622:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4626:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // InternalBlockchain.g:4627:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__1"


    // $ANTLR start "rule__Mapa__Group__1__Impl"
    // InternalBlockchain.g:4634:1: rule__Mapa__Group__1__Impl : ( '<' ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4638:1: ( ( '<' ) )
            // InternalBlockchain.g:4639:1: ( '<' )
            {
            // InternalBlockchain.g:4639:1: ( '<' )
            // InternalBlockchain.g:4640:2: '<'
            {
             before(grammarAccess.getMapaAccess().getLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__1__Impl"


    // $ANTLR start "rule__Mapa__Group__2"
    // InternalBlockchain.g:4649:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4653:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // InternalBlockchain.g:4654:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Mapa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__2"


    // $ANTLR start "rule__Mapa__Group__2__Impl"
    // InternalBlockchain.g:4661:1: rule__Mapa__Group__2__Impl : ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4665:1: ( ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) )
            // InternalBlockchain.g:4666:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            {
            // InternalBlockchain.g:4666:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            // InternalBlockchain.g:4667:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 
            // InternalBlockchain.g:4668:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            // InternalBlockchain.g:4668:3: rule__Mapa__TipoDatoKeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoKeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__2__Impl"


    // $ANTLR start "rule__Mapa__Group__3"
    // InternalBlockchain.g:4676:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4680:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // InternalBlockchain.g:4681:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__3"


    // $ANTLR start "rule__Mapa__Group__3__Impl"
    // InternalBlockchain.g:4688:1: rule__Mapa__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4692:1: ( ( ',' ) )
            // InternalBlockchain.g:4693:1: ( ',' )
            {
            // InternalBlockchain.g:4693:1: ( ',' )
            // InternalBlockchain.g:4694:2: ','
            {
             before(grammarAccess.getMapaAccess().getCommaKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__3__Impl"


    // $ANTLR start "rule__Mapa__Group__4"
    // InternalBlockchain.g:4703:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4707:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // InternalBlockchain.g:4708:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FOLLOW_53);
            rule__Mapa__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__4"


    // $ANTLR start "rule__Mapa__Group__4__Impl"
    // InternalBlockchain.g:4715:1: rule__Mapa__Group__4__Impl : ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4719:1: ( ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) )
            // InternalBlockchain.g:4720:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            {
            // InternalBlockchain.g:4720:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            // InternalBlockchain.g:4721:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 
            // InternalBlockchain.g:4722:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            // InternalBlockchain.g:4722:3: rule__Mapa__TipoDatoValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__TipoDatoValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__4__Impl"


    // $ANTLR start "rule__Mapa__Group__5"
    // InternalBlockchain.g:4730:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4734:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // InternalBlockchain.g:4735:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FOLLOW_54);
            rule__Mapa__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__5"


    // $ANTLR start "rule__Mapa__Group__5__Impl"
    // InternalBlockchain.g:4742:1: rule__Mapa__Group__5__Impl : ( '>' ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4746:1: ( ( '>' ) )
            // InternalBlockchain.g:4747:1: ( '>' )
            {
            // InternalBlockchain.g:4747:1: ( '>' )
            // InternalBlockchain.g:4748:2: '>'
            {
             before(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__5__Impl"


    // $ANTLR start "rule__Mapa__Group__6"
    // InternalBlockchain.g:4757:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4761:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // InternalBlockchain.g:4762:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Mapa__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapa__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__6"


    // $ANTLR start "rule__Mapa__Group__6__Impl"
    // InternalBlockchain.g:4769:1: rule__Mapa__Group__6__Impl : ( ':' ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4773:1: ( ( ':' ) )
            // InternalBlockchain.g:4774:1: ( ':' )
            {
            // InternalBlockchain.g:4774:1: ( ':' )
            // InternalBlockchain.g:4775:2: ':'
            {
             before(grammarAccess.getMapaAccess().getColonKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMapaAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__6__Impl"


    // $ANTLR start "rule__Mapa__Group__7"
    // InternalBlockchain.g:4784:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4788:1: ( rule__Mapa__Group__7__Impl )
            // InternalBlockchain.g:4789:2: rule__Mapa__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__7"


    // $ANTLR start "rule__Mapa__Group__7__Impl"
    // InternalBlockchain.g:4795:1: rule__Mapa__Group__7__Impl : ( ( rule__Mapa__NameAssignment_7 ) ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4799:1: ( ( ( rule__Mapa__NameAssignment_7 ) ) )
            // InternalBlockchain.g:4800:1: ( ( rule__Mapa__NameAssignment_7 ) )
            {
            // InternalBlockchain.g:4800:1: ( ( rule__Mapa__NameAssignment_7 ) )
            // InternalBlockchain.g:4801:2: ( rule__Mapa__NameAssignment_7 )
            {
             before(grammarAccess.getMapaAccess().getNameAssignment_7()); 
            // InternalBlockchain.g:4802:2: ( rule__Mapa__NameAssignment_7 )
            // InternalBlockchain.g:4802:3: rule__Mapa__NameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mapa__NameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMapaAccess().getNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__Group__7__Impl"


    // $ANTLR start "rule__Aplicacion__NameAssignment_2"
    // InternalBlockchain.g:4811:1: rule__Aplicacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Aplicacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4815:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4816:2: ( ruleEString )
            {
            // InternalBlockchain.g:4816:2: ( ruleEString )
            // InternalBlockchain.g:4817:3: ruleEString
            {
             before(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__NameAssignment_2"


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_0"
    // InternalBlockchain.g:4826:1: rule__Aplicacion__SmartcontractAssignment_4_0 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4830:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4831:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4831:2: ( ruleSmartContract )
            // InternalBlockchain.g:4832:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_0"


    // $ANTLR start "rule__Aplicacion__SmartcontractAssignment_4_1"
    // InternalBlockchain.g:4841:1: rule__Aplicacion__SmartcontractAssignment_4_1 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4845:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4846:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4846:2: ( ruleSmartContract )
            // InternalBlockchain.g:4847:3: ruleSmartContract
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getSmartcontractSmartContractParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__SmartcontractAssignment_4_1"


    // $ANTLR start "rule__Aplicacion__TipodatoAssignment_5_1"
    // InternalBlockchain.g:4856:1: rule__Aplicacion__TipodatoAssignment_5_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4860:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:4861:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:4861:2: ( ruleTipoDato )
            // InternalBlockchain.g:4862:3: ruleTipoDato
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getAplicacionAccess().getTipodatoTipoDatoParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicacion__TipodatoAssignment_5_1"


    // $ANTLR start "rule__SmartContract__NameAssignment_1"
    // InternalBlockchain.g:4871:1: rule__SmartContract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4875:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4876:2: ( ruleEString )
            {
            // InternalBlockchain.g:4876:2: ( ruleEString )
            // InternalBlockchain.g:4877:3: ruleEString
            {
             before(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__NameAssignment_1"


    // $ANTLR start "rule__SmartContract__EntidadesAssignment_3_0"
    // InternalBlockchain.g:4886:1: rule__SmartContract__EntidadesAssignment_3_0 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4890:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4891:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4891:2: ( ruleEntidad )
            // InternalBlockchain.g:4892:3: ruleEntidad
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EntidadesAssignment_3_0"


    // $ANTLR start "rule__SmartContract__EntidadesAssignment_3_1"
    // InternalBlockchain.g:4901:1: rule__SmartContract__EntidadesAssignment_3_1 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4905:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4906:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4906:2: ( ruleEntidad )
            // InternalBlockchain.g:4907:3: ruleEntidad
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEntidadesEntidadParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EntidadesAssignment_3_1"


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_0"
    // InternalBlockchain.g:4916:1: rule__SmartContract__EstadoAssignment_4_0 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4920:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4921:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4921:2: ( ruleEstado )
            // InternalBlockchain.g:4922:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_0"


    // $ANTLR start "rule__SmartContract__EstadoAssignment_4_1"
    // InternalBlockchain.g:4931:1: rule__SmartContract__EstadoAssignment_4_1 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4935:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4936:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4936:2: ( ruleEstado )
            // InternalBlockchain.g:4937:3: ruleEstado
            {
             before(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEstado();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getEstadoEstadoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__EstadoAssignment_4_1"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_0"
    // InternalBlockchain.g:4946:1: rule__SmartContract__OperacionesAssignment_5_0 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4950:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4951:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4951:2: ( ruleOperacion )
            // InternalBlockchain.g:4952:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_0"


    // $ANTLR start "rule__SmartContract__OperacionesAssignment_5_1"
    // InternalBlockchain.g:4961:1: rule__SmartContract__OperacionesAssignment_5_1 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4965:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4966:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4966:2: ( ruleOperacion )
            // InternalBlockchain.g:4967:3: ruleOperacion
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperacion();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOperacionesOperacionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OperacionesAssignment_5_1"


    // $ANTLR start "rule__Entidad__NameAssignment_2"
    // InternalBlockchain.g:4976:1: rule__Entidad__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4980:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4981:2: ( ruleEString )
            {
            // InternalBlockchain.g:4981:2: ( ruleEString )
            // InternalBlockchain.g:4982:3: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_2"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4_0"
    // InternalBlockchain.g:4991:1: rule__Entidad__AtributosAssignment_4_0 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4995:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4996:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4996:2: ( ruleAtributo )
            // InternalBlockchain.g:4997:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4_0"


    // $ANTLR start "rule__Entidad__AtributosAssignment_4_1"
    // InternalBlockchain.g:5006:1: rule__Entidad__AtributosAssignment_4_1 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5010:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:5011:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:5011:2: ( ruleAtributo )
            // InternalBlockchain.g:5012:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getAtributosAtributoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__AtributosAssignment_4_1"


    // $ANTLR start "rule__Operacion__EsUserDefinedAssignment_1_1"
    // InternalBlockchain.g:5021:1: rule__Operacion__EsUserDefinedAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Operacion__EsUserDefinedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5025:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5026:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5026:2: ( ruleEBoolean )
            // InternalBlockchain.g:5027:3: ruleEBoolean
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getEsUserDefinedEBooleanParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__EsUserDefinedAssignment_1_1"


    // $ANTLR start "rule__Operacion__NameAssignment_2"
    // InternalBlockchain.g:5036:1: rule__Operacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5040:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5041:2: ( ruleEString )
            {
            // InternalBlockchain.g:5041:2: ( ruleEString )
            // InternalBlockchain.g:5042:3: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__NameAssignment_2"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_4_0"
    // InternalBlockchain.g:5051:1: rule__Operacion__ParametrosAssignment_4_0 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5055:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:5056:2: ( ruleParametro )
            {
            // InternalBlockchain.g:5056:2: ( ruleParametro )
            // InternalBlockchain.g:5057:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__ParametrosAssignment_4_0"


    // $ANTLR start "rule__Operacion__ParametrosAssignment_4_1_1"
    // InternalBlockchain.g:5066:1: rule__Operacion__ParametrosAssignment_4_1_1 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5070:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:5071:2: ( ruleParametro )
            {
            // InternalBlockchain.g:5071:2: ( ruleParametro )
            // InternalBlockchain.g:5072:3: ruleParametro
            {
             before(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getParametrosParametroParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__ParametrosAssignment_4_1_1"


    // $ANTLR start "rule__Operacion__RetornoAssignment_6_1"
    // InternalBlockchain.g:5081:1: rule__Operacion__RetornoAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Operacion__RetornoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5085:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5086:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5086:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5087:3: ( ruleEString )
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 
            // InternalBlockchain.g:5088:3: ( ruleEString )
            // InternalBlockchain.g:5089:4: ruleEString
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__RetornoAssignment_6_1"


    // $ANTLR start "rule__Operacion__LineasAssignment_9"
    // InternalBlockchain.g:5100:1: rule__Operacion__LineasAssignment_9 : ( ruleLinea ) ;
    public final void rule__Operacion__LineasAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5104:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5105:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5105:2: ( ruleLinea )
            // InternalBlockchain.g:5106:3: ruleLinea
            {
             before(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacion__LineasAssignment_9"


    // $ANTLR start "rule__Estado__TipodatoAssignment_1"
    // InternalBlockchain.g:5115:1: rule__Estado__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Estado__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5119:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5120:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5120:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5121:3: ( ruleEString )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5122:3: ( ruleEString )
            // InternalBlockchain.g:5123:4: ruleEString
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__TipodatoAssignment_1"


    // $ANTLR start "rule__Estado__NameAssignment_2"
    // InternalBlockchain.g:5134:1: rule__Estado__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Estado__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5138:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5139:2: ( ruleEString )
            {
            // InternalBlockchain.g:5139:2: ( ruleEString )
            // InternalBlockchain.g:5140:3: ruleEString
            {
             before(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstadoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estado__NameAssignment_2"


    // $ANTLR start "rule__Atributo__TipodatoAssignment_0"
    // InternalBlockchain.g:5149:1: rule__Atributo__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Atributo__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5153:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5154:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5154:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5155:3: ( ruleEString )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:5156:3: ( ruleEString )
            // InternalBlockchain.g:5157:4: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipodatoAssignment_0"


    // $ANTLR start "rule__Atributo__IsIdAssignment_1_1"
    // InternalBlockchain.g:5168:1: rule__Atributo__IsIdAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Atributo__IsIdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5172:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5173:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5173:2: ( ruleEBoolean )
            // InternalBlockchain.g:5174:3: ruleEBoolean
            {
             before(grammarAccess.getAtributoAccess().getIsIdEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getIsIdEBooleanParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__IsIdAssignment_1_1"


    // $ANTLR start "rule__Atributo__NameAssignment_2"
    // InternalBlockchain.g:5183:1: rule__Atributo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5187:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5188:2: ( ruleEString )
            {
            // InternalBlockchain.g:5188:2: ( ruleEString )
            // InternalBlockchain.g:5189:3: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NameAssignment_2"


    // $ANTLR start "rule__Parametro__TipodatoAssignment_0"
    // InternalBlockchain.g:5198:1: rule__Parametro__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5202:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5203:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5203:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5204:3: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:5205:3: ( ruleEString )
            // InternalBlockchain.g:5206:4: ruleEString
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getTipodatoTipoDatoEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__TipodatoAssignment_0"


    // $ANTLR start "rule__Parametro__NameAssignment_1"
    // InternalBlockchain.g:5217:1: rule__Parametro__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parametro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5221:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5222:2: ( ruleEString )
            {
            // InternalBlockchain.g:5222:2: ( ruleEString )
            // InternalBlockchain.g:5223:3: ruleEString
            {
             before(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__NameAssignment_1"


    // $ANTLR start "rule__ExpresionLogica__IzqAssignment_2"
    // InternalBlockchain.g:5232:1: rule__ExpresionLogica__IzqAssignment_2 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__IzqAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5236:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5237:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5237:2: ( ruleExpresion )
            // InternalBlockchain.g:5238:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getIzqExpresionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__IzqAssignment_2"


    // $ANTLR start "rule__ExpresionLogica__OperadorAssignment_4"
    // InternalBlockchain.g:5247:1: rule__ExpresionLogica__OperadorAssignment_4 : ( ruleOperadorLogico ) ;
    public final void rule__ExpresionLogica__OperadorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5251:1: ( ( ruleOperadorLogico ) )
            // InternalBlockchain.g:5252:2: ( ruleOperadorLogico )
            {
            // InternalBlockchain.g:5252:2: ( ruleOperadorLogico )
            // InternalBlockchain.g:5253:3: ruleOperadorLogico
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorLogico();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getOperadorOperadorLogicoEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__OperadorAssignment_4"


    // $ANTLR start "rule__ExpresionLogica__DerAssignment_6"
    // InternalBlockchain.g:5262:1: rule__ExpresionLogica__DerAssignment_6 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__DerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5266:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5267:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5267:2: ( ruleExpresion )
            // InternalBlockchain.g:5268:3: ruleExpresion
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionLogicaAccess().getDerExpresionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionLogica__DerAssignment_6"


    // $ANTLR start "rule__ExpresionAritmetica__IzqAssignment_3"
    // InternalBlockchain.g:5277:1: rule__ExpresionAritmetica__IzqAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__IzqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5281:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5282:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5282:2: ( ruleExpresion )
            // InternalBlockchain.g:5283:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getIzqExpresionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__IzqAssignment_3"


    // $ANTLR start "rule__ExpresionAritmetica__OperadorAssignment_5"
    // InternalBlockchain.g:5292:1: rule__ExpresionAritmetica__OperadorAssignment_5 : ( ruleOperador ) ;
    public final void rule__ExpresionAritmetica__OperadorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5296:1: ( ( ruleOperador ) )
            // InternalBlockchain.g:5297:2: ( ruleOperador )
            {
            // InternalBlockchain.g:5297:2: ( ruleOperador )
            // InternalBlockchain.g:5298:3: ruleOperador
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getOperadorOperadorEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__OperadorAssignment_5"


    // $ANTLR start "rule__ExpresionAritmetica__DerAssignment_7"
    // InternalBlockchain.g:5307:1: rule__ExpresionAritmetica__DerAssignment_7 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__DerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5311:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5312:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5312:2: ( ruleExpresion )
            // InternalBlockchain.g:5313:3: ruleExpresion
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionAritmeticaAccess().getDerExpresionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionAritmetica__DerAssignment_7"


    // $ANTLR start "rule__Variable__TipodatoAssignment_1"
    // InternalBlockchain.g:5322:1: rule__Variable__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5326:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5327:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5327:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5328:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:5329:3: ( ruleEString )
            // InternalBlockchain.g:5330:4: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTipodatoTipoDatoEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TipodatoAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_2"
    // InternalBlockchain.g:5341:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5345:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5346:2: ( ruleEString )
            {
            // InternalBlockchain.g:5346:2: ( ruleEString )
            // InternalBlockchain.g:5347:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_2"


    // $ANTLR start "rule__Condicional__ExpresionlogicaAssignment_1"
    // InternalBlockchain.g:5356:1: rule__Condicional__ExpresionlogicaAssignment_1 : ( ruleExpresionLogica ) ;
    public final void rule__Condicional__ExpresionlogicaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5360:1: ( ( ruleExpresionLogica ) )
            // InternalBlockchain.g:5361:2: ( ruleExpresionLogica )
            {
            // InternalBlockchain.g:5361:2: ( ruleExpresionLogica )
            // InternalBlockchain.g:5362:3: ruleExpresionLogica
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ExpresionlogicaAssignment_1"


    // $ANTLR start "rule__Condicional__LineasAssignment_3"
    // InternalBlockchain.g:5371:1: rule__Condicional__LineasAssignment_3 : ( ruleLinea ) ;
    public final void rule__Condicional__LineasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5375:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5376:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5376:2: ( ruleLinea )
            // InternalBlockchain.g:5377:3: ruleLinea
            {
             before(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getLineasLineaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__LineasAssignment_3"


    // $ANTLR start "rule__Condicional__ElseLinesAssignment_5"
    // InternalBlockchain.g:5386:1: rule__Condicional__ElseLinesAssignment_5 : ( ruleElse ) ;
    public final void rule__Condicional__ElseLinesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5390:1: ( ( ruleElse ) )
            // InternalBlockchain.g:5391:2: ( ruleElse )
            {
            // InternalBlockchain.g:5391:2: ( ruleElse )
            // InternalBlockchain.g:5392:3: ruleElse
            {
             before(grammarAccess.getCondicionalAccess().getElseLinesElseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getElseLinesElseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__ElseLinesAssignment_5"


    // $ANTLR start "rule__Else__LineasAssignment_2"
    // InternalBlockchain.g:5401:1: rule__Else__LineasAssignment_2 : ( ruleLinea ) ;
    public final void rule__Else__LineasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5405:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5406:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5406:2: ( ruleLinea )
            // InternalBlockchain.g:5407:3: ruleLinea
            {
             before(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getElseAccess().getLineasLineaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__LineasAssignment_2"


    // $ANTLR start "rule__ExpresionNumerica__ValueAssignment_2"
    // InternalBlockchain.g:5416:1: rule__ExpresionNumerica__ValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExpresionNumerica__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5420:1: ( ( ruleEDouble ) )
            // InternalBlockchain.g:5421:2: ( ruleEDouble )
            {
            // InternalBlockchain.g:5421:2: ( ruleEDouble )
            // InternalBlockchain.g:5422:3: ruleEDouble
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpresionNumericaAccess().getValueEDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionNumerica__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionTexto__ValueAssignment_2"
    // InternalBlockchain.g:5431:1: rule__ExpresionTexto__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ExpresionTexto__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5435:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5436:2: ( ruleEString )
            {
            // InternalBlockchain.g:5436:2: ( ruleEString )
            // InternalBlockchain.g:5437:3: ruleEString
            {
             before(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionTextoAccess().getValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionTexto__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionBoolean__ValueAssignment_2"
    // InternalBlockchain.g:5446:1: rule__ExpresionBoolean__ValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ExpresionBoolean__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5450:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5451:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5451:2: ( ruleEBoolean )
            // InternalBlockchain.g:5452:3: ruleEBoolean
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getExpresionBooleanAccess().getValueEBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionBoolean__ValueAssignment_2"


    // $ANTLR start "rule__ExpresionReferenciada__IdAssignment_2_1"
    // InternalBlockchain.g:5461:1: rule__ExpresionReferenciada__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionReferenciada__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5465:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5466:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5466:2: ( ruleEInt )
            // InternalBlockchain.g:5467:3: ruleEInt
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getIdEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__IdAssignment_2_1"


    // $ANTLR start "rule__ExpresionReferenciada__ReferenciaAssignment_3"
    // InternalBlockchain.g:5476:1: rule__ExpresionReferenciada__ReferenciaAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__ReferenciaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5480:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5481:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5481:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5482:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 
            // InternalBlockchain.g:5483:3: ( ruleEString )
            // InternalBlockchain.g:5484:4: ruleEString
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionReferenciada__ReferenciaAssignment_3"


    // $ANTLR start "rule__ExpresionRelacional__IzqAssignment_1"
    // InternalBlockchain.g:5495:1: rule__ExpresionRelacional__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5499:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5500:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5500:2: ( ruleExpresion )
            // InternalBlockchain.g:5501:3: ruleExpresion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getIzqExpresionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__IzqAssignment_1"


    // $ANTLR start "rule__ExpresionRelacional__OperadorRelacionalAssignment_2"
    // InternalBlockchain.g:5510:1: rule__ExpresionRelacional__OperadorRelacionalAssignment_2 : ( ruleOperadorRelacion ) ;
    public final void rule__ExpresionRelacional__OperadorRelacionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5514:1: ( ( ruleOperadorRelacion ) )
            // InternalBlockchain.g:5515:2: ( ruleOperadorRelacion )
            {
            // InternalBlockchain.g:5515:2: ( ruleOperadorRelacion )
            // InternalBlockchain.g:5516:3: ruleOperadorRelacion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperadorRelacion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalOperadorRelacionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__OperadorRelacionalAssignment_2"


    // $ANTLR start "rule__ExpresionRelacional__DerAssignment_3"
    // InternalBlockchain.g:5525:1: rule__ExpresionRelacional__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5529:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5530:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5530:2: ( ruleExpresion )
            // InternalBlockchain.g:5531:3: ruleExpresion
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresion();

            state._fsp--;

             after(grammarAccess.getExpresionRelacionalAccess().getDerExpresionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpresionRelacional__DerAssignment_3"


    // $ANTLR start "rule__Retorno__LineaRetornoAssignment_2"
    // InternalBlockchain.g:5540:1: rule__Retorno__LineaRetornoAssignment_2 : ( ruleLinea ) ;
    public final void rule__Retorno__LineaRetornoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5544:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5545:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5545:2: ( ruleLinea )
            // InternalBlockchain.g:5546:3: ruleLinea
            {
             before(grammarAccess.getRetornoAccess().getLineaRetornoLineaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getRetornoAccess().getLineaRetornoLineaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retorno__LineaRetornoAssignment_2"


    // $ANTLR start "rule__Primitivo__TipoAssignment_1"
    // InternalBlockchain.g:5555:1: rule__Primitivo__TipoAssignment_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Primitivo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5559:1: ( ( ruleDatoPrimitivo ) )
            // InternalBlockchain.g:5560:2: ( ruleDatoPrimitivo )
            {
            // InternalBlockchain.g:5560:2: ( ruleDatoPrimitivo )
            // InternalBlockchain.g:5561:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getPrimitivoAccess().getTipoDatoPrimitivoEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__TipoAssignment_1"


    // $ANTLR start "rule__Primitivo__NameAssignment_2"
    // InternalBlockchain.g:5570:1: rule__Primitivo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitivo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5574:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5575:2: ( ruleEString )
            {
            // InternalBlockchain.g:5575:2: ( ruleEString )
            // InternalBlockchain.g:5576:3: ruleEString
            {
             before(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitivoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitivo__NameAssignment_2"


    // $ANTLR start "rule__Mapa__TipoDatoKeyAssignment_2"
    // InternalBlockchain.g:5585:1: rule__Mapa__TipoDatoKeyAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5589:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5590:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5590:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5591:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 
            // InternalBlockchain.g:5592:3: ( ruleEString )
            // InternalBlockchain.g:5593:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__TipoDatoKeyAssignment_2"


    // $ANTLR start "rule__Mapa__TipoDatoValueAssignment_4"
    // InternalBlockchain.g:5604:1: rule__Mapa__TipoDatoValueAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5608:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5609:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5609:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5610:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 
            // InternalBlockchain.g:5611:3: ( ruleEString )
            // InternalBlockchain.g:5612:4: ruleEString
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__TipoDatoValueAssignment_4"


    // $ANTLR start "rule__Mapa__NameAssignment_7"
    // InternalBlockchain.g:5623:1: rule__Mapa__NameAssignment_7 : ( ruleEString ) ;
    public final void rule__Mapa__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5627:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5628:2: ( ruleEString )
            {
            // InternalBlockchain.g:5628:2: ( ruleEString )
            // InternalBlockchain.g:5629:3: ruleEString
            {
             before(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMapaAccess().getNameEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapa__NameAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4000020F00000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001064000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000802000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x37BC184000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x37BC000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x178C080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x178C180000FF0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x178C1800FF000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x37BC004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000840L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x178C000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x178C000000000800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000F00000030L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000000000L});

}