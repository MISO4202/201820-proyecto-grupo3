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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'true'", "'false'", "'E'", "'e'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'='", "'GET'", "'DELETE'", "'String'", "'uint'", "'Boolean'", "'address'", "'Aplicacion'", "'{'", "'}'", "'tipodato'", "'SmartContract'", "'Entidad'", "'Operacion'", "'('", "')'", "'return'", "'isUd='", "','", "':'", "'Estado'", "'ExpLog'", "'ExpArit'", "'var'", "'if'", "'ExpNum'", "'ExpTex'", "'ExpBool'", "'ExpRef'", "'id'", "'ExpRel'", "'Map'"
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


    // $ANTLR start "entryRuleExpresionNumerica"
    // InternalBlockchain.g:453:1: entryRuleExpresionNumerica : ruleExpresionNumerica EOF ;
    public final void entryRuleExpresionNumerica() throws RecognitionException {
        try {
            // InternalBlockchain.g:454:1: ( ruleExpresionNumerica EOF )
            // InternalBlockchain.g:455:1: ruleExpresionNumerica EOF
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
    // InternalBlockchain.g:462:1: ruleExpresionNumerica : ( ( rule__ExpresionNumerica__Group__0 ) ) ;
    public final void ruleExpresionNumerica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:466:2: ( ( ( rule__ExpresionNumerica__Group__0 ) ) )
            // InternalBlockchain.g:467:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            {
            // InternalBlockchain.g:467:2: ( ( rule__ExpresionNumerica__Group__0 ) )
            // InternalBlockchain.g:468:3: ( rule__ExpresionNumerica__Group__0 )
            {
             before(grammarAccess.getExpresionNumericaAccess().getGroup()); 
            // InternalBlockchain.g:469:3: ( rule__ExpresionNumerica__Group__0 )
            // InternalBlockchain.g:469:4: rule__ExpresionNumerica__Group__0
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
    // InternalBlockchain.g:478:1: entryRuleExpresionTexto : ruleExpresionTexto EOF ;
    public final void entryRuleExpresionTexto() throws RecognitionException {
        try {
            // InternalBlockchain.g:479:1: ( ruleExpresionTexto EOF )
            // InternalBlockchain.g:480:1: ruleExpresionTexto EOF
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
    // InternalBlockchain.g:487:1: ruleExpresionTexto : ( ( rule__ExpresionTexto__Group__0 ) ) ;
    public final void ruleExpresionTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:491:2: ( ( ( rule__ExpresionTexto__Group__0 ) ) )
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionTexto__Group__0 ) )
            {
            // InternalBlockchain.g:492:2: ( ( rule__ExpresionTexto__Group__0 ) )
            // InternalBlockchain.g:493:3: ( rule__ExpresionTexto__Group__0 )
            {
             before(grammarAccess.getExpresionTextoAccess().getGroup()); 
            // InternalBlockchain.g:494:3: ( rule__ExpresionTexto__Group__0 )
            // InternalBlockchain.g:494:4: rule__ExpresionTexto__Group__0
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
    // InternalBlockchain.g:503:1: entryRuleExpresionBoolean : ruleExpresionBoolean EOF ;
    public final void entryRuleExpresionBoolean() throws RecognitionException {
        try {
            // InternalBlockchain.g:504:1: ( ruleExpresionBoolean EOF )
            // InternalBlockchain.g:505:1: ruleExpresionBoolean EOF
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
    // InternalBlockchain.g:512:1: ruleExpresionBoolean : ( ( rule__ExpresionBoolean__Group__0 ) ) ;
    public final void ruleExpresionBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:516:2: ( ( ( rule__ExpresionBoolean__Group__0 ) ) )
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            {
            // InternalBlockchain.g:517:2: ( ( rule__ExpresionBoolean__Group__0 ) )
            // InternalBlockchain.g:518:3: ( rule__ExpresionBoolean__Group__0 )
            {
             before(grammarAccess.getExpresionBooleanAccess().getGroup()); 
            // InternalBlockchain.g:519:3: ( rule__ExpresionBoolean__Group__0 )
            // InternalBlockchain.g:519:4: rule__ExpresionBoolean__Group__0
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
    // InternalBlockchain.g:528:1: entryRuleExpresionReferenciada : ruleExpresionReferenciada EOF ;
    public final void entryRuleExpresionReferenciada() throws RecognitionException {
        try {
            // InternalBlockchain.g:529:1: ( ruleExpresionReferenciada EOF )
            // InternalBlockchain.g:530:1: ruleExpresionReferenciada EOF
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
    // InternalBlockchain.g:537:1: ruleExpresionReferenciada : ( ( rule__ExpresionReferenciada__Group__0 ) ) ;
    public final void ruleExpresionReferenciada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:541:2: ( ( ( rule__ExpresionReferenciada__Group__0 ) ) )
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            {
            // InternalBlockchain.g:542:2: ( ( rule__ExpresionReferenciada__Group__0 ) )
            // InternalBlockchain.g:543:3: ( rule__ExpresionReferenciada__Group__0 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup()); 
            // InternalBlockchain.g:544:3: ( rule__ExpresionReferenciada__Group__0 )
            // InternalBlockchain.g:544:4: rule__ExpresionReferenciada__Group__0
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
    // InternalBlockchain.g:553:1: entryRuleExpresionRelacional : ruleExpresionRelacional EOF ;
    public final void entryRuleExpresionRelacional() throws RecognitionException {
        try {
            // InternalBlockchain.g:554:1: ( ruleExpresionRelacional EOF )
            // InternalBlockchain.g:555:1: ruleExpresionRelacional EOF
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
    // InternalBlockchain.g:562:1: ruleExpresionRelacional : ( ( rule__ExpresionRelacional__Group__0 ) ) ;
    public final void ruleExpresionRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:566:2: ( ( ( rule__ExpresionRelacional__Group__0 ) ) )
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            {
            // InternalBlockchain.g:567:2: ( ( rule__ExpresionRelacional__Group__0 ) )
            // InternalBlockchain.g:568:3: ( rule__ExpresionRelacional__Group__0 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getGroup()); 
            // InternalBlockchain.g:569:3: ( rule__ExpresionRelacional__Group__0 )
            // InternalBlockchain.g:569:4: rule__ExpresionRelacional__Group__0
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


    // $ANTLR start "entryRuleEDouble"
    // InternalBlockchain.g:578:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBlockchain.g:579:1: ( ruleEDouble EOF )
            // InternalBlockchain.g:580:1: ruleEDouble EOF
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
    // InternalBlockchain.g:587:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:591:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBlockchain.g:592:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBlockchain.g:592:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBlockchain.g:593:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBlockchain.g:594:3: ( rule__EDouble__Group__0 )
            // InternalBlockchain.g:594:4: rule__EDouble__Group__0
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
    // InternalBlockchain.g:603:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBlockchain.g:604:1: ( ruleEInt EOF )
            // InternalBlockchain.g:605:1: ruleEInt EOF
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
    // InternalBlockchain.g:612:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:616:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBlockchain.g:617:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBlockchain.g:617:2: ( ( rule__EInt__Group__0 ) )
            // InternalBlockchain.g:618:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBlockchain.g:619:3: ( rule__EInt__Group__0 )
            // InternalBlockchain.g:619:4: rule__EInt__Group__0
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
    // InternalBlockchain.g:628:1: entryRulePrimitivo : rulePrimitivo EOF ;
    public final void entryRulePrimitivo() throws RecognitionException {
        try {
            // InternalBlockchain.g:629:1: ( rulePrimitivo EOF )
            // InternalBlockchain.g:630:1: rulePrimitivo EOF
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
    // InternalBlockchain.g:637:1: rulePrimitivo : ( ( rule__Primitivo__Group__0 ) ) ;
    public final void rulePrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:641:2: ( ( ( rule__Primitivo__Group__0 ) ) )
            // InternalBlockchain.g:642:2: ( ( rule__Primitivo__Group__0 ) )
            {
            // InternalBlockchain.g:642:2: ( ( rule__Primitivo__Group__0 ) )
            // InternalBlockchain.g:643:3: ( rule__Primitivo__Group__0 )
            {
             before(grammarAccess.getPrimitivoAccess().getGroup()); 
            // InternalBlockchain.g:644:3: ( rule__Primitivo__Group__0 )
            // InternalBlockchain.g:644:4: rule__Primitivo__Group__0
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
    // InternalBlockchain.g:653:1: entryRuleMapa : ruleMapa EOF ;
    public final void entryRuleMapa() throws RecognitionException {
        try {
            // InternalBlockchain.g:654:1: ( ruleMapa EOF )
            // InternalBlockchain.g:655:1: ruleMapa EOF
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
    // InternalBlockchain.g:662:1: ruleMapa : ( ( rule__Mapa__Group__0 ) ) ;
    public final void ruleMapa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:666:2: ( ( ( rule__Mapa__Group__0 ) ) )
            // InternalBlockchain.g:667:2: ( ( rule__Mapa__Group__0 ) )
            {
            // InternalBlockchain.g:667:2: ( ( rule__Mapa__Group__0 ) )
            // InternalBlockchain.g:668:3: ( rule__Mapa__Group__0 )
            {
             before(grammarAccess.getMapaAccess().getGroup()); 
            // InternalBlockchain.g:669:3: ( rule__Mapa__Group__0 )
            // InternalBlockchain.g:669:4: rule__Mapa__Group__0
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
    // InternalBlockchain.g:678:1: ruleOperadorLogico : ( ( rule__OperadorLogico__Alternatives ) ) ;
    public final void ruleOperadorLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:682:1: ( ( ( rule__OperadorLogico__Alternatives ) ) )
            // InternalBlockchain.g:683:2: ( ( rule__OperadorLogico__Alternatives ) )
            {
            // InternalBlockchain.g:683:2: ( ( rule__OperadorLogico__Alternatives ) )
            // InternalBlockchain.g:684:3: ( rule__OperadorLogico__Alternatives )
            {
             before(grammarAccess.getOperadorLogicoAccess().getAlternatives()); 
            // InternalBlockchain.g:685:3: ( rule__OperadorLogico__Alternatives )
            // InternalBlockchain.g:685:4: rule__OperadorLogico__Alternatives
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
    // InternalBlockchain.g:694:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:698:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalBlockchain.g:699:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalBlockchain.g:699:2: ( ( rule__Operador__Alternatives ) )
            // InternalBlockchain.g:700:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalBlockchain.g:701:3: ( rule__Operador__Alternatives )
            // InternalBlockchain.g:701:4: rule__Operador__Alternatives
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
    // InternalBlockchain.g:710:1: ruleOperadorRelacion : ( ( '.' ) ) ;
    public final void ruleOperadorRelacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:714:1: ( ( ( '.' ) ) )
            // InternalBlockchain.g:715:2: ( ( '.' ) )
            {
            // InternalBlockchain.g:715:2: ( ( '.' ) )
            // InternalBlockchain.g:716:3: ( '.' )
            {
             before(grammarAccess.getOperadorRelacionAccess().getPUNTOEnumLiteralDeclaration()); 
            // InternalBlockchain.g:717:3: ( '.' )
            // InternalBlockchain.g:717:4: '.'
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
    // InternalBlockchain.g:726:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:730:1: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalBlockchain.g:731:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalBlockchain.g:731:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalBlockchain.g:732:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalBlockchain.g:733:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalBlockchain.g:733:4: rule__DatoPrimitivo__Alternatives
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
    // InternalBlockchain.g:741:1: rule__TipoDato__Alternatives : ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:745:1: ( ( ruleEntidad ) | ( rulePrimitivo ) | ( ruleMapa ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt1=2;
                }
                break;
            case 59:
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
                    // InternalBlockchain.g:746:2: ( ruleEntidad )
                    {
                    // InternalBlockchain.g:746:2: ( ruleEntidad )
                    // InternalBlockchain.g:747:3: ruleEntidad
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
                    // InternalBlockchain.g:752:2: ( rulePrimitivo )
                    {
                    // InternalBlockchain.g:752:2: ( rulePrimitivo )
                    // InternalBlockchain.g:753:3: rulePrimitivo
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
                    // InternalBlockchain.g:758:2: ( ruleMapa )
                    {
                    // InternalBlockchain.g:758:2: ( ruleMapa )
                    // InternalBlockchain.g:759:3: ruleMapa
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
    // InternalBlockchain.g:768:1: rule__Linea__Alternatives : ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) );
    public final void rule__Linea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:772:1: ( ( ruleExpresion ) | ( ruleVariable ) | ( ruleCondicional ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
            case 53:
            case 54:
            case 55:
            case 56:
            case 58:
                {
                alt2=1;
                }
                break;
            case 51:
                {
                alt2=2;
                }
                break;
            case 52:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBlockchain.g:773:2: ( ruleExpresion )
                    {
                    // InternalBlockchain.g:773:2: ( ruleExpresion )
                    // InternalBlockchain.g:774:3: ruleExpresion
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
                    // InternalBlockchain.g:779:2: ( ruleVariable )
                    {
                    // InternalBlockchain.g:779:2: ( ruleVariable )
                    // InternalBlockchain.g:780:3: ruleVariable
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
                    // InternalBlockchain.g:785:2: ( ruleCondicional )
                    {
                    // InternalBlockchain.g:785:2: ( ruleCondicional )
                    // InternalBlockchain.g:786:3: ruleCondicional
                    {
                     before(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCondicional();

                    state._fsp--;

                     after(grammarAccess.getLineaAccess().getCondicionalParserRuleCall_2()); 

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
    // InternalBlockchain.g:795:1: rule__Expresion__Alternatives : ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) );
    public final void rule__Expresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:799:1: ( ( ruleExpresionLogica ) | ( ruleExpresionAritmetica ) | ( ruleExpresionNumerica ) | ( ruleExpresionTexto ) | ( ruleExpresionBoolean ) | ( ruleExpresionReferenciada ) | ( ruleExpresionRelacional ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case 50:
                {
                alt3=2;
                }
                break;
            case 53:
                {
                alt3=3;
                }
                break;
            case 54:
                {
                alt3=4;
                }
                break;
            case 55:
                {
                alt3=5;
                }
                break;
            case 56:
                {
                alt3=6;
                }
                break;
            case 58:
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
                    // InternalBlockchain.g:800:2: ( ruleExpresionLogica )
                    {
                    // InternalBlockchain.g:800:2: ( ruleExpresionLogica )
                    // InternalBlockchain.g:801:3: ruleExpresionLogica
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
                    // InternalBlockchain.g:806:2: ( ruleExpresionAritmetica )
                    {
                    // InternalBlockchain.g:806:2: ( ruleExpresionAritmetica )
                    // InternalBlockchain.g:807:3: ruleExpresionAritmetica
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
                    // InternalBlockchain.g:812:2: ( ruleExpresionNumerica )
                    {
                    // InternalBlockchain.g:812:2: ( ruleExpresionNumerica )
                    // InternalBlockchain.g:813:3: ruleExpresionNumerica
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
                    // InternalBlockchain.g:818:2: ( ruleExpresionTexto )
                    {
                    // InternalBlockchain.g:818:2: ( ruleExpresionTexto )
                    // InternalBlockchain.g:819:3: ruleExpresionTexto
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
                    // InternalBlockchain.g:824:2: ( ruleExpresionBoolean )
                    {
                    // InternalBlockchain.g:824:2: ( ruleExpresionBoolean )
                    // InternalBlockchain.g:825:3: ruleExpresionBoolean
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
                    // InternalBlockchain.g:830:2: ( ruleExpresionReferenciada )
                    {
                    // InternalBlockchain.g:830:2: ( ruleExpresionReferenciada )
                    // InternalBlockchain.g:831:3: ruleExpresionReferenciada
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
                    // InternalBlockchain.g:836:2: ( ruleExpresionRelacional )
                    {
                    // InternalBlockchain.g:836:2: ( ruleExpresionRelacional )
                    // InternalBlockchain.g:837:3: ruleExpresionRelacional
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
    // InternalBlockchain.g:846:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:850:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBlockchain.g:851:2: ( RULE_STRING )
                    {
                    // InternalBlockchain.g:851:2: ( RULE_STRING )
                    // InternalBlockchain.g:852:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:857:2: ( RULE_ID )
                    {
                    // InternalBlockchain.g:857:2: ( RULE_ID )
                    // InternalBlockchain.g:858:3: RULE_ID
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
    // InternalBlockchain.g:867:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:871:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalBlockchain.g:872:2: ( 'true' )
                    {
                    // InternalBlockchain.g:872:2: ( 'true' )
                    // InternalBlockchain.g:873:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:878:2: ( 'false' )
                    {
                    // InternalBlockchain.g:878:2: ( 'false' )
                    // InternalBlockchain.g:879:3: 'false'
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
    // InternalBlockchain.g:888:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:892:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalBlockchain.g:893:2: ( 'E' )
                    {
                    // InternalBlockchain.g:893:2: ( 'E' )
                    // InternalBlockchain.g:894:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:899:2: ( 'e' )
                    {
                    // InternalBlockchain.g:899:2: ( 'e' )
                    // InternalBlockchain.g:900:3: 'e'
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
    // InternalBlockchain.g:909:1: rule__OperadorLogico__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__OperadorLogico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:913:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
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
                    // InternalBlockchain.g:914:2: ( ( '==' ) )
                    {
                    // InternalBlockchain.g:914:2: ( ( '==' ) )
                    // InternalBlockchain.g:915:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:916:3: ( '==' )
                    // InternalBlockchain.g:916:4: '=='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getIGUAL_IGUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:920:2: ( ( '!=' ) )
                    {
                    // InternalBlockchain.g:920:2: ( ( '!=' ) )
                    // InternalBlockchain.g:921:3: ( '!=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:922:3: ( '!=' )
                    // InternalBlockchain.g:922:4: '!='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getDIFERENTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:926:2: ( ( '>' ) )
                    {
                    // InternalBlockchain.g:926:2: ( ( '>' ) )
                    // InternalBlockchain.g:927:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:928:3: ( '>' )
                    // InternalBlockchain.g:928:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORQUEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:932:2: ( ( '<' ) )
                    {
                    // InternalBlockchain.g:932:2: ( ( '<' ) )
                    // InternalBlockchain.g:933:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:934:3: ( '<' )
                    // InternalBlockchain.g:934:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORQUEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:938:2: ( ( '>=' ) )
                    {
                    // InternalBlockchain.g:938:2: ( ( '>=' ) )
                    // InternalBlockchain.g:939:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:940:3: ( '>=' )
                    // InternalBlockchain.g:940:4: '>='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMAYORIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:944:2: ( ( '<=' ) )
                    {
                    // InternalBlockchain.g:944:2: ( ( '<=' ) )
                    // InternalBlockchain.g:945:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:946:3: ( '<=' )
                    // InternalBlockchain.g:946:4: '<='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getMENORIGUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:950:2: ( ( '&&' ) )
                    {
                    // InternalBlockchain.g:950:2: ( ( '&&' ) )
                    // InternalBlockchain.g:951:3: ( '&&' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:952:3: ( '&&' )
                    // InternalBlockchain.g:952:4: '&&'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorLogicoAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBlockchain.g:956:2: ( ( '||' ) )
                    {
                    // InternalBlockchain.g:956:2: ( ( '||' ) )
                    // InternalBlockchain.g:957:3: ( '||' )
                    {
                     before(grammarAccess.getOperadorLogicoAccess().getOREnumLiteralDeclaration_7()); 
                    // InternalBlockchain.g:958:3: ( '||' )
                    // InternalBlockchain.g:958:4: '||'
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
    // InternalBlockchain.g:966:1: rule__Operador__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:970:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '=' ) ) | ( ( 'GET' ) ) | ( ( 'DELETE' ) ) )
            int alt8=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBlockchain.g:971:2: ( ( '+' ) )
                    {
                    // InternalBlockchain.g:971:2: ( ( '+' ) )
                    // InternalBlockchain.g:972:3: ( '+' )
                    {
                     before(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:973:3: ( '+' )
                    // InternalBlockchain.g:973:4: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMASEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:977:2: ( ( '-' ) )
                    {
                    // InternalBlockchain.g:977:2: ( ( '-' ) )
                    // InternalBlockchain.g:978:3: ( '-' )
                    {
                     before(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:979:3: ( '-' )
                    // InternalBlockchain.g:979:4: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMENOSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:983:2: ( ( '*' ) )
                    {
                    // InternalBlockchain.g:983:2: ( ( '*' ) )
                    // InternalBlockchain.g:984:3: ( '*' )
                    {
                     before(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:985:3: ( '*' )
                    // InternalBlockchain.g:985:4: '*'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getPRODUCTOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:989:2: ( ( '/' ) )
                    {
                    // InternalBlockchain.g:989:2: ( ( '/' ) )
                    // InternalBlockchain.g:990:3: ( '/' )
                    {
                     before(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:991:3: ( '/' )
                    // InternalBlockchain.g:991:4: '/'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDIVISIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBlockchain.g:995:2: ( ( '=' ) )
                    {
                    // InternalBlockchain.g:995:2: ( ( '=' ) )
                    // InternalBlockchain.g:996:3: ( '=' )
                    {
                     before(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 
                    // InternalBlockchain.g:997:3: ( '=' )
                    // InternalBlockchain.g:997:4: '='
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIGUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBlockchain.g:1001:2: ( ( 'GET' ) )
                    {
                    // InternalBlockchain.g:1001:2: ( ( 'GET' ) )
                    // InternalBlockchain.g:1002:3: ( 'GET' )
                    {
                     before(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 
                    // InternalBlockchain.g:1003:3: ( 'GET' )
                    // InternalBlockchain.g:1003:4: 'GET'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getGETEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBlockchain.g:1007:2: ( ( 'DELETE' ) )
                    {
                    // InternalBlockchain.g:1007:2: ( ( 'DELETE' ) )
                    // InternalBlockchain.g:1008:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 
                    // InternalBlockchain.g:1009:3: ( 'DELETE' )
                    // InternalBlockchain.g:1009:4: 'DELETE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getDELETEEnumLiteralDeclaration_6()); 

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
    // InternalBlockchain.g:1017:1: rule__DatoPrimitivo__Alternatives : ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'address' ) ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1021:1: ( ( ( 'String' ) ) | ( ( 'uint' ) ) | ( ( 'Boolean' ) ) | ( ( 'address' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
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
                    // InternalBlockchain.g:1022:2: ( ( 'String' ) )
                    {
                    // InternalBlockchain.g:1022:2: ( ( 'String' ) )
                    // InternalBlockchain.g:1023:3: ( 'String' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalBlockchain.g:1024:3: ( 'String' )
                    // InternalBlockchain.g:1024:4: 'String'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlockchain.g:1028:2: ( ( 'uint' ) )
                    {
                    // InternalBlockchain.g:1028:2: ( ( 'uint' ) )
                    // InternalBlockchain.g:1029:3: ( 'uint' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 
                    // InternalBlockchain.g:1030:3: ( 'uint' )
                    // InternalBlockchain.g:1030:4: 'uint'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getNUMERICOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBlockchain.g:1034:2: ( ( 'Boolean' ) )
                    {
                    // InternalBlockchain.g:1034:2: ( ( 'Boolean' ) )
                    // InternalBlockchain.g:1035:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalBlockchain.g:1036:3: ( 'Boolean' )
                    // InternalBlockchain.g:1036:4: 'Boolean'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatoPrimitivoAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBlockchain.g:1040:2: ( ( 'address' ) )
                    {
                    // InternalBlockchain.g:1040:2: ( ( 'address' ) )
                    // InternalBlockchain.g:1041:3: ( 'address' )
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getADDRESSEnumLiteralDeclaration_3()); 
                    // InternalBlockchain.g:1042:3: ( 'address' )
                    // InternalBlockchain.g:1042:4: 'address'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalBlockchain.g:1050:1: rule__Aplicacion__Group__0 : rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 ;
    public final void rule__Aplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1054:1: ( rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1 )
            // InternalBlockchain.g:1055:2: rule__Aplicacion__Group__0__Impl rule__Aplicacion__Group__1
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
    // InternalBlockchain.g:1062:1: rule__Aplicacion__Group__0__Impl : ( () ) ;
    public final void rule__Aplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1066:1: ( ( () ) )
            // InternalBlockchain.g:1067:1: ( () )
            {
            // InternalBlockchain.g:1067:1: ( () )
            // InternalBlockchain.g:1068:2: ()
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionAction_0()); 
            // InternalBlockchain.g:1069:2: ()
            // InternalBlockchain.g:1069:3: 
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
    // InternalBlockchain.g:1077:1: rule__Aplicacion__Group__1 : rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 ;
    public final void rule__Aplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1081:1: ( rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2 )
            // InternalBlockchain.g:1082:2: rule__Aplicacion__Group__1__Impl rule__Aplicacion__Group__2
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
    // InternalBlockchain.g:1089:1: rule__Aplicacion__Group__1__Impl : ( 'Aplicacion' ) ;
    public final void rule__Aplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1093:1: ( ( 'Aplicacion' ) )
            // InternalBlockchain.g:1094:1: ( 'Aplicacion' )
            {
            // InternalBlockchain.g:1094:1: ( 'Aplicacion' )
            // InternalBlockchain.g:1095:2: 'Aplicacion'
            {
             before(grammarAccess.getAplicacionAccess().getAplicacionKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBlockchain.g:1104:1: rule__Aplicacion__Group__2 : rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 ;
    public final void rule__Aplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1108:1: ( rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3 )
            // InternalBlockchain.g:1109:2: rule__Aplicacion__Group__2__Impl rule__Aplicacion__Group__3
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
    // InternalBlockchain.g:1116:1: rule__Aplicacion__Group__2__Impl : ( ( rule__Aplicacion__NameAssignment_2 ) ) ;
    public final void rule__Aplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1120:1: ( ( ( rule__Aplicacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1121:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1121:1: ( ( rule__Aplicacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1122:2: ( rule__Aplicacion__NameAssignment_2 )
            {
             before(grammarAccess.getAplicacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1123:2: ( rule__Aplicacion__NameAssignment_2 )
            // InternalBlockchain.g:1123:3: rule__Aplicacion__NameAssignment_2
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
    // InternalBlockchain.g:1131:1: rule__Aplicacion__Group__3 : rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 ;
    public final void rule__Aplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1135:1: ( rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4 )
            // InternalBlockchain.g:1136:2: rule__Aplicacion__Group__3__Impl rule__Aplicacion__Group__4
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
    // InternalBlockchain.g:1143:1: rule__Aplicacion__Group__3__Impl : ( '{' ) ;
    public final void rule__Aplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1147:1: ( ( '{' ) )
            // InternalBlockchain.g:1148:1: ( '{' )
            {
            // InternalBlockchain.g:1148:1: ( '{' )
            // InternalBlockchain.g:1149:2: '{'
            {
             before(grammarAccess.getAplicacionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1158:1: rule__Aplicacion__Group__4 : rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 ;
    public final void rule__Aplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1162:1: ( rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5 )
            // InternalBlockchain.g:1163:2: rule__Aplicacion__Group__4__Impl rule__Aplicacion__Group__5
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
    // InternalBlockchain.g:1170:1: rule__Aplicacion__Group__4__Impl : ( ( rule__Aplicacion__Group_4__0 )? ) ;
    public final void rule__Aplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1174:1: ( ( ( rule__Aplicacion__Group_4__0 )? ) )
            // InternalBlockchain.g:1175:1: ( ( rule__Aplicacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:1175:1: ( ( rule__Aplicacion__Group_4__0 )? )
            // InternalBlockchain.g:1176:2: ( rule__Aplicacion__Group_4__0 )?
            {
             before(grammarAccess.getAplicacionAccess().getGroup_4()); 
            // InternalBlockchain.g:1177:2: ( rule__Aplicacion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlockchain.g:1177:3: rule__Aplicacion__Group_4__0
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
    // InternalBlockchain.g:1185:1: rule__Aplicacion__Group__5 : rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 ;
    public final void rule__Aplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1189:1: ( rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6 )
            // InternalBlockchain.g:1190:2: rule__Aplicacion__Group__5__Impl rule__Aplicacion__Group__6
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
    // InternalBlockchain.g:1197:1: rule__Aplicacion__Group__5__Impl : ( ( rule__Aplicacion__Group_5__0 )* ) ;
    public final void rule__Aplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1201:1: ( ( ( rule__Aplicacion__Group_5__0 )* ) )
            // InternalBlockchain.g:1202:1: ( ( rule__Aplicacion__Group_5__0 )* )
            {
            // InternalBlockchain.g:1202:1: ( ( rule__Aplicacion__Group_5__0 )* )
            // InternalBlockchain.g:1203:2: ( rule__Aplicacion__Group_5__0 )*
            {
             before(grammarAccess.getAplicacionAccess().getGroup_5()); 
            // InternalBlockchain.g:1204:2: ( rule__Aplicacion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlockchain.g:1204:3: rule__Aplicacion__Group_5__0
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
    // InternalBlockchain.g:1212:1: rule__Aplicacion__Group__6 : rule__Aplicacion__Group__6__Impl ;
    public final void rule__Aplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1216:1: ( rule__Aplicacion__Group__6__Impl )
            // InternalBlockchain.g:1217:2: rule__Aplicacion__Group__6__Impl
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
    // InternalBlockchain.g:1223:1: rule__Aplicacion__Group__6__Impl : ( '}' ) ;
    public final void rule__Aplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1227:1: ( ( '}' ) )
            // InternalBlockchain.g:1228:1: ( '}' )
            {
            // InternalBlockchain.g:1228:1: ( '}' )
            // InternalBlockchain.g:1229:2: '}'
            {
             before(grammarAccess.getAplicacionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1239:1: rule__Aplicacion__Group_4__0 : rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 ;
    public final void rule__Aplicacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1243:1: ( rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1 )
            // InternalBlockchain.g:1244:2: rule__Aplicacion__Group_4__0__Impl rule__Aplicacion__Group_4__1
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
    // InternalBlockchain.g:1251:1: rule__Aplicacion__Group_4__0__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) ;
    public final void rule__Aplicacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1255:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) ) )
            // InternalBlockchain.g:1256:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1256:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_0 ) )
            // InternalBlockchain.g:1257:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_0()); 
            // InternalBlockchain.g:1258:2: ( rule__Aplicacion__SmartcontractAssignment_4_0 )
            // InternalBlockchain.g:1258:3: rule__Aplicacion__SmartcontractAssignment_4_0
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
    // InternalBlockchain.g:1266:1: rule__Aplicacion__Group_4__1 : rule__Aplicacion__Group_4__1__Impl ;
    public final void rule__Aplicacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1270:1: ( rule__Aplicacion__Group_4__1__Impl )
            // InternalBlockchain.g:1271:2: rule__Aplicacion__Group_4__1__Impl
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
    // InternalBlockchain.g:1277:1: rule__Aplicacion__Group_4__1__Impl : ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) ;
    public final void rule__Aplicacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1281:1: ( ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* ) )
            // InternalBlockchain.g:1282:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1282:1: ( ( rule__Aplicacion__SmartcontractAssignment_4_1 )* )
            // InternalBlockchain.g:1283:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            {
             before(grammarAccess.getAplicacionAccess().getSmartcontractAssignment_4_1()); 
            // InternalBlockchain.g:1284:2: ( rule__Aplicacion__SmartcontractAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlockchain.g:1284:3: rule__Aplicacion__SmartcontractAssignment_4_1
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
    // InternalBlockchain.g:1293:1: rule__Aplicacion__Group_5__0 : rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 ;
    public final void rule__Aplicacion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1297:1: ( rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1 )
            // InternalBlockchain.g:1298:2: rule__Aplicacion__Group_5__0__Impl rule__Aplicacion__Group_5__1
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
    // InternalBlockchain.g:1305:1: rule__Aplicacion__Group_5__0__Impl : ( 'tipodato' ) ;
    public final void rule__Aplicacion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1309:1: ( ( 'tipodato' ) )
            // InternalBlockchain.g:1310:1: ( 'tipodato' )
            {
            // InternalBlockchain.g:1310:1: ( 'tipodato' )
            // InternalBlockchain.g:1311:2: 'tipodato'
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBlockchain.g:1320:1: rule__Aplicacion__Group_5__1 : rule__Aplicacion__Group_5__1__Impl ;
    public final void rule__Aplicacion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1324:1: ( rule__Aplicacion__Group_5__1__Impl )
            // InternalBlockchain.g:1325:2: rule__Aplicacion__Group_5__1__Impl
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
    // InternalBlockchain.g:1331:1: rule__Aplicacion__Group_5__1__Impl : ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) ;
    public final void rule__Aplicacion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1335:1: ( ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) ) )
            // InternalBlockchain.g:1336:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            {
            // InternalBlockchain.g:1336:1: ( ( rule__Aplicacion__TipodatoAssignment_5_1 ) )
            // InternalBlockchain.g:1337:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            {
             before(grammarAccess.getAplicacionAccess().getTipodatoAssignment_5_1()); 
            // InternalBlockchain.g:1338:2: ( rule__Aplicacion__TipodatoAssignment_5_1 )
            // InternalBlockchain.g:1338:3: rule__Aplicacion__TipodatoAssignment_5_1
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
    // InternalBlockchain.g:1347:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1351:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalBlockchain.g:1352:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
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
    // InternalBlockchain.g:1359:1: rule__SmartContract__Group__0__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1363:1: ( ( 'SmartContract' ) )
            // InternalBlockchain.g:1364:1: ( 'SmartContract' )
            {
            // InternalBlockchain.g:1364:1: ( 'SmartContract' )
            // InternalBlockchain.g:1365:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalBlockchain.g:1374:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1378:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalBlockchain.g:1379:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
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
    // InternalBlockchain.g:1386:1: rule__SmartContract__Group__1__Impl : ( ( rule__SmartContract__NameAssignment_1 ) ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1390:1: ( ( ( rule__SmartContract__NameAssignment_1 ) ) )
            // InternalBlockchain.g:1391:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:1391:1: ( ( rule__SmartContract__NameAssignment_1 ) )
            // InternalBlockchain.g:1392:2: ( rule__SmartContract__NameAssignment_1 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:1393:2: ( rule__SmartContract__NameAssignment_1 )
            // InternalBlockchain.g:1393:3: rule__SmartContract__NameAssignment_1
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
    // InternalBlockchain.g:1401:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1405:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalBlockchain.g:1406:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
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
    // InternalBlockchain.g:1413:1: rule__SmartContract__Group__2__Impl : ( '{' ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1417:1: ( ( '{' ) )
            // InternalBlockchain.g:1418:1: ( '{' )
            {
            // InternalBlockchain.g:1418:1: ( '{' )
            // InternalBlockchain.g:1419:2: '{'
            {
             before(grammarAccess.getSmartContractAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1428:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1432:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalBlockchain.g:1433:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
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
    // InternalBlockchain.g:1440:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )? ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1444:1: ( ( ( rule__SmartContract__Group_3__0 )? ) )
            // InternalBlockchain.g:1445:1: ( ( rule__SmartContract__Group_3__0 )? )
            {
            // InternalBlockchain.g:1445:1: ( ( rule__SmartContract__Group_3__0 )? )
            // InternalBlockchain.g:1446:2: ( rule__SmartContract__Group_3__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalBlockchain.g:1447:2: ( rule__SmartContract__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlockchain.g:1447:3: rule__SmartContract__Group_3__0
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
    // InternalBlockchain.g:1455:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1459:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalBlockchain.g:1460:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
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
    // InternalBlockchain.g:1467:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__Group_4__0 )? ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1471:1: ( ( ( rule__SmartContract__Group_4__0 )? ) )
            // InternalBlockchain.g:1472:1: ( ( rule__SmartContract__Group_4__0 )? )
            {
            // InternalBlockchain.g:1472:1: ( ( rule__SmartContract__Group_4__0 )? )
            // InternalBlockchain.g:1473:2: ( rule__SmartContract__Group_4__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_4()); 
            // InternalBlockchain.g:1474:2: ( rule__SmartContract__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlockchain.g:1474:3: rule__SmartContract__Group_4__0
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
    // InternalBlockchain.g:1482:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1486:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalBlockchain.g:1487:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
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
    // InternalBlockchain.g:1494:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__Group_5__0 )? ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1498:1: ( ( ( rule__SmartContract__Group_5__0 )? ) )
            // InternalBlockchain.g:1499:1: ( ( rule__SmartContract__Group_5__0 )? )
            {
            // InternalBlockchain.g:1499:1: ( ( rule__SmartContract__Group_5__0 )? )
            // InternalBlockchain.g:1500:2: ( rule__SmartContract__Group_5__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_5()); 
            // InternalBlockchain.g:1501:2: ( rule__SmartContract__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlockchain.g:1501:3: rule__SmartContract__Group_5__0
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
    // InternalBlockchain.g:1509:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1513:1: ( rule__SmartContract__Group__6__Impl )
            // InternalBlockchain.g:1514:2: rule__SmartContract__Group__6__Impl
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
    // InternalBlockchain.g:1520:1: rule__SmartContract__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1524:1: ( ( '}' ) )
            // InternalBlockchain.g:1525:1: ( '}' )
            {
            // InternalBlockchain.g:1525:1: ( '}' )
            // InternalBlockchain.g:1526:2: '}'
            {
             before(grammarAccess.getSmartContractAccess().getRightCurlyBracketKeyword_6()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1536:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1540:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalBlockchain.g:1541:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
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
    // InternalBlockchain.g:1548:1: rule__SmartContract__Group_3__0__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1552:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_0 ) ) )
            // InternalBlockchain.g:1553:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            {
            // InternalBlockchain.g:1553:1: ( ( rule__SmartContract__EntidadesAssignment_3_0 ) )
            // InternalBlockchain.g:1554:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_0()); 
            // InternalBlockchain.g:1555:2: ( rule__SmartContract__EntidadesAssignment_3_0 )
            // InternalBlockchain.g:1555:3: rule__SmartContract__EntidadesAssignment_3_0
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
    // InternalBlockchain.g:1563:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1567:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalBlockchain.g:1568:2: rule__SmartContract__Group_3__1__Impl
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
    // InternalBlockchain.g:1574:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1578:1: ( ( ( rule__SmartContract__EntidadesAssignment_3_1 )* ) )
            // InternalBlockchain.g:1579:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            {
            // InternalBlockchain.g:1579:1: ( ( rule__SmartContract__EntidadesAssignment_3_1 )* )
            // InternalBlockchain.g:1580:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEntidadesAssignment_3_1()); 
            // InternalBlockchain.g:1581:2: ( rule__SmartContract__EntidadesAssignment_3_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlockchain.g:1581:3: rule__SmartContract__EntidadesAssignment_3_1
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
    // InternalBlockchain.g:1590:1: rule__SmartContract__Group_4__0 : rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 ;
    public final void rule__SmartContract__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1594:1: ( rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1 )
            // InternalBlockchain.g:1595:2: rule__SmartContract__Group_4__0__Impl rule__SmartContract__Group_4__1
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
    // InternalBlockchain.g:1602:1: rule__SmartContract__Group_4__0__Impl : ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) ;
    public final void rule__SmartContract__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1606:1: ( ( ( rule__SmartContract__EstadoAssignment_4_0 ) ) )
            // InternalBlockchain.g:1607:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1607:1: ( ( rule__SmartContract__EstadoAssignment_4_0 ) )
            // InternalBlockchain.g:1608:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_0()); 
            // InternalBlockchain.g:1609:2: ( rule__SmartContract__EstadoAssignment_4_0 )
            // InternalBlockchain.g:1609:3: rule__SmartContract__EstadoAssignment_4_0
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
    // InternalBlockchain.g:1617:1: rule__SmartContract__Group_4__1 : rule__SmartContract__Group_4__1__Impl ;
    public final void rule__SmartContract__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1621:1: ( rule__SmartContract__Group_4__1__Impl )
            // InternalBlockchain.g:1622:2: rule__SmartContract__Group_4__1__Impl
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
    // InternalBlockchain.g:1628:1: rule__SmartContract__Group_4__1__Impl : ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) ;
    public final void rule__SmartContract__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1632:1: ( ( ( rule__SmartContract__EstadoAssignment_4_1 )* ) )
            // InternalBlockchain.g:1633:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1633:1: ( ( rule__SmartContract__EstadoAssignment_4_1 )* )
            // InternalBlockchain.g:1634:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getEstadoAssignment_4_1()); 
            // InternalBlockchain.g:1635:2: ( rule__SmartContract__EstadoAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBlockchain.g:1635:3: rule__SmartContract__EstadoAssignment_4_1
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
    // InternalBlockchain.g:1644:1: rule__SmartContract__Group_5__0 : rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 ;
    public final void rule__SmartContract__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1648:1: ( rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1 )
            // InternalBlockchain.g:1649:2: rule__SmartContract__Group_5__0__Impl rule__SmartContract__Group_5__1
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
    // InternalBlockchain.g:1656:1: rule__SmartContract__Group_5__0__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) ;
    public final void rule__SmartContract__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1660:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_0 ) ) )
            // InternalBlockchain.g:1661:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            {
            // InternalBlockchain.g:1661:1: ( ( rule__SmartContract__OperacionesAssignment_5_0 ) )
            // InternalBlockchain.g:1662:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_0()); 
            // InternalBlockchain.g:1663:2: ( rule__SmartContract__OperacionesAssignment_5_0 )
            // InternalBlockchain.g:1663:3: rule__SmartContract__OperacionesAssignment_5_0
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
    // InternalBlockchain.g:1671:1: rule__SmartContract__Group_5__1 : rule__SmartContract__Group_5__1__Impl ;
    public final void rule__SmartContract__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1675:1: ( rule__SmartContract__Group_5__1__Impl )
            // InternalBlockchain.g:1676:2: rule__SmartContract__Group_5__1__Impl
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
    // InternalBlockchain.g:1682:1: rule__SmartContract__Group_5__1__Impl : ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) ;
    public final void rule__SmartContract__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1686:1: ( ( ( rule__SmartContract__OperacionesAssignment_5_1 )* ) )
            // InternalBlockchain.g:1687:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            {
            // InternalBlockchain.g:1687:1: ( ( rule__SmartContract__OperacionesAssignment_5_1 )* )
            // InternalBlockchain.g:1688:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            {
             before(grammarAccess.getSmartContractAccess().getOperacionesAssignment_5_1()); 
            // InternalBlockchain.g:1689:2: ( rule__SmartContract__OperacionesAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlockchain.g:1689:3: rule__SmartContract__OperacionesAssignment_5_1
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
    // InternalBlockchain.g:1698:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1702:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalBlockchain.g:1703:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
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
    // InternalBlockchain.g:1710:1: rule__Entidad__Group__0__Impl : ( () ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1714:1: ( ( () ) )
            // InternalBlockchain.g:1715:1: ( () )
            {
            // InternalBlockchain.g:1715:1: ( () )
            // InternalBlockchain.g:1716:2: ()
            {
             before(grammarAccess.getEntidadAccess().getEntidadAction_0()); 
            // InternalBlockchain.g:1717:2: ()
            // InternalBlockchain.g:1717:3: 
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
    // InternalBlockchain.g:1725:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1729:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalBlockchain.g:1730:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
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
    // InternalBlockchain.g:1737:1: rule__Entidad__Group__1__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1741:1: ( ( 'Entidad' ) )
            // InternalBlockchain.g:1742:1: ( 'Entidad' )
            {
            // InternalBlockchain.g:1742:1: ( 'Entidad' )
            // InternalBlockchain.g:1743:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBlockchain.g:1752:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1756:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalBlockchain.g:1757:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
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
    // InternalBlockchain.g:1764:1: rule__Entidad__Group__2__Impl : ( ( rule__Entidad__NameAssignment_2 ) ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1768:1: ( ( ( rule__Entidad__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1769:1: ( ( rule__Entidad__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1769:1: ( ( rule__Entidad__NameAssignment_2 ) )
            // InternalBlockchain.g:1770:2: ( rule__Entidad__NameAssignment_2 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1771:2: ( rule__Entidad__NameAssignment_2 )
            // InternalBlockchain.g:1771:3: rule__Entidad__NameAssignment_2
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
    // InternalBlockchain.g:1779:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1783:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalBlockchain.g:1784:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
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
    // InternalBlockchain.g:1791:1: rule__Entidad__Group__3__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1795:1: ( ( '{' ) )
            // InternalBlockchain.g:1796:1: ( '{' )
            {
            // InternalBlockchain.g:1796:1: ( '{' )
            // InternalBlockchain.g:1797:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:1806:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1810:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalBlockchain.g:1811:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
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
    // InternalBlockchain.g:1818:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )? ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1822:1: ( ( ( rule__Entidad__Group_4__0 )? ) )
            // InternalBlockchain.g:1823:1: ( ( rule__Entidad__Group_4__0 )? )
            {
            // InternalBlockchain.g:1823:1: ( ( rule__Entidad__Group_4__0 )? )
            // InternalBlockchain.g:1824:2: ( rule__Entidad__Group_4__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalBlockchain.g:1825:2: ( rule__Entidad__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBlockchain.g:1825:3: rule__Entidad__Group_4__0
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
    // InternalBlockchain.g:1833:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1837:1: ( rule__Entidad__Group__5__Impl )
            // InternalBlockchain.g:1838:2: rule__Entidad__Group__5__Impl
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
    // InternalBlockchain.g:1844:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1848:1: ( ( '}' ) )
            // InternalBlockchain.g:1849:1: ( '}' )
            {
            // InternalBlockchain.g:1849:1: ( '}' )
            // InternalBlockchain.g:1850:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:1860:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1864:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalBlockchain.g:1865:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
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
    // InternalBlockchain.g:1872:1: rule__Entidad__Group_4__0__Impl : ( ( rule__Entidad__AtributosAssignment_4_0 ) ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1876:1: ( ( ( rule__Entidad__AtributosAssignment_4_0 ) ) )
            // InternalBlockchain.g:1877:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:1877:1: ( ( rule__Entidad__AtributosAssignment_4_0 ) )
            // InternalBlockchain.g:1878:2: ( rule__Entidad__AtributosAssignment_4_0 )
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_0()); 
            // InternalBlockchain.g:1879:2: ( rule__Entidad__AtributosAssignment_4_0 )
            // InternalBlockchain.g:1879:3: rule__Entidad__AtributosAssignment_4_0
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
    // InternalBlockchain.g:1887:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1891:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalBlockchain.g:1892:2: rule__Entidad__Group_4__1__Impl
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
    // InternalBlockchain.g:1898:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__AtributosAssignment_4_1 )* ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1902:1: ( ( ( rule__Entidad__AtributosAssignment_4_1 )* ) )
            // InternalBlockchain.g:1903:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            {
            // InternalBlockchain.g:1903:1: ( ( rule__Entidad__AtributosAssignment_4_1 )* )
            // InternalBlockchain.g:1904:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            {
             before(grammarAccess.getEntidadAccess().getAtributosAssignment_4_1()); 
            // InternalBlockchain.g:1905:2: ( rule__Entidad__AtributosAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlockchain.g:1905:3: rule__Entidad__AtributosAssignment_4_1
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
    // InternalBlockchain.g:1914:1: rule__Operacion__Group__0 : rule__Operacion__Group__0__Impl rule__Operacion__Group__1 ;
    public final void rule__Operacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1918:1: ( rule__Operacion__Group__0__Impl rule__Operacion__Group__1 )
            // InternalBlockchain.g:1919:2: rule__Operacion__Group__0__Impl rule__Operacion__Group__1
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
    // InternalBlockchain.g:1926:1: rule__Operacion__Group__0__Impl : ( 'Operacion' ) ;
    public final void rule__Operacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1930:1: ( ( 'Operacion' ) )
            // InternalBlockchain.g:1931:1: ( 'Operacion' )
            {
            // InternalBlockchain.g:1931:1: ( 'Operacion' )
            // InternalBlockchain.g:1932:2: 'Operacion'
            {
             before(grammarAccess.getOperacionAccess().getOperacionKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBlockchain.g:1941:1: rule__Operacion__Group__1 : rule__Operacion__Group__1__Impl rule__Operacion__Group__2 ;
    public final void rule__Operacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1945:1: ( rule__Operacion__Group__1__Impl rule__Operacion__Group__2 )
            // InternalBlockchain.g:1946:2: rule__Operacion__Group__1__Impl rule__Operacion__Group__2
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
    // InternalBlockchain.g:1953:1: rule__Operacion__Group__1__Impl : ( ( rule__Operacion__Group_1__0 )? ) ;
    public final void rule__Operacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1957:1: ( ( ( rule__Operacion__Group_1__0 )? ) )
            // InternalBlockchain.g:1958:1: ( ( rule__Operacion__Group_1__0 )? )
            {
            // InternalBlockchain.g:1958:1: ( ( rule__Operacion__Group_1__0 )? )
            // InternalBlockchain.g:1959:2: ( rule__Operacion__Group_1__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_1()); 
            // InternalBlockchain.g:1960:2: ( rule__Operacion__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBlockchain.g:1960:3: rule__Operacion__Group_1__0
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
    // InternalBlockchain.g:1968:1: rule__Operacion__Group__2 : rule__Operacion__Group__2__Impl rule__Operacion__Group__3 ;
    public final void rule__Operacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1972:1: ( rule__Operacion__Group__2__Impl rule__Operacion__Group__3 )
            // InternalBlockchain.g:1973:2: rule__Operacion__Group__2__Impl rule__Operacion__Group__3
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
    // InternalBlockchain.g:1980:1: rule__Operacion__Group__2__Impl : ( ( rule__Operacion__NameAssignment_2 ) ) ;
    public final void rule__Operacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1984:1: ( ( ( rule__Operacion__NameAssignment_2 ) ) )
            // InternalBlockchain.g:1985:1: ( ( rule__Operacion__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:1985:1: ( ( rule__Operacion__NameAssignment_2 ) )
            // InternalBlockchain.g:1986:2: ( rule__Operacion__NameAssignment_2 )
            {
             before(grammarAccess.getOperacionAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:1987:2: ( rule__Operacion__NameAssignment_2 )
            // InternalBlockchain.g:1987:3: rule__Operacion__NameAssignment_2
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
    // InternalBlockchain.g:1995:1: rule__Operacion__Group__3 : rule__Operacion__Group__3__Impl rule__Operacion__Group__4 ;
    public final void rule__Operacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:1999:1: ( rule__Operacion__Group__3__Impl rule__Operacion__Group__4 )
            // InternalBlockchain.g:2000:2: rule__Operacion__Group__3__Impl rule__Operacion__Group__4
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
    // InternalBlockchain.g:2007:1: rule__Operacion__Group__3__Impl : ( '(' ) ;
    public final void rule__Operacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2011:1: ( ( '(' ) )
            // InternalBlockchain.g:2012:1: ( '(' )
            {
            // InternalBlockchain.g:2012:1: ( '(' )
            // InternalBlockchain.g:2013:2: '('
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBlockchain.g:2022:1: rule__Operacion__Group__4 : rule__Operacion__Group__4__Impl rule__Operacion__Group__5 ;
    public final void rule__Operacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2026:1: ( rule__Operacion__Group__4__Impl rule__Operacion__Group__5 )
            // InternalBlockchain.g:2027:2: rule__Operacion__Group__4__Impl rule__Operacion__Group__5
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
    // InternalBlockchain.g:2034:1: rule__Operacion__Group__4__Impl : ( ( rule__Operacion__Group_4__0 )? ) ;
    public final void rule__Operacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2038:1: ( ( ( rule__Operacion__Group_4__0 )? ) )
            // InternalBlockchain.g:2039:1: ( ( rule__Operacion__Group_4__0 )? )
            {
            // InternalBlockchain.g:2039:1: ( ( rule__Operacion__Group_4__0 )? )
            // InternalBlockchain.g:2040:2: ( rule__Operacion__Group_4__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_4()); 
            // InternalBlockchain.g:2041:2: ( rule__Operacion__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlockchain.g:2041:3: rule__Operacion__Group_4__0
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
    // InternalBlockchain.g:2049:1: rule__Operacion__Group__5 : rule__Operacion__Group__5__Impl rule__Operacion__Group__6 ;
    public final void rule__Operacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2053:1: ( rule__Operacion__Group__5__Impl rule__Operacion__Group__6 )
            // InternalBlockchain.g:2054:2: rule__Operacion__Group__5__Impl rule__Operacion__Group__6
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
    // InternalBlockchain.g:2061:1: rule__Operacion__Group__5__Impl : ( ')' ) ;
    public final void rule__Operacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2065:1: ( ( ')' ) )
            // InternalBlockchain.g:2066:1: ( ')' )
            {
            // InternalBlockchain.g:2066:1: ( ')' )
            // InternalBlockchain.g:2067:2: ')'
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBlockchain.g:2076:1: rule__Operacion__Group__6 : rule__Operacion__Group__6__Impl rule__Operacion__Group__7 ;
    public final void rule__Operacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2080:1: ( rule__Operacion__Group__6__Impl rule__Operacion__Group__7 )
            // InternalBlockchain.g:2081:2: rule__Operacion__Group__6__Impl rule__Operacion__Group__7
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
    // InternalBlockchain.g:2088:1: rule__Operacion__Group__6__Impl : ( ( rule__Operacion__Group_6__0 )? ) ;
    public final void rule__Operacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2092:1: ( ( ( rule__Operacion__Group_6__0 )? ) )
            // InternalBlockchain.g:2093:1: ( ( rule__Operacion__Group_6__0 )? )
            {
            // InternalBlockchain.g:2093:1: ( ( rule__Operacion__Group_6__0 )? )
            // InternalBlockchain.g:2094:2: ( rule__Operacion__Group_6__0 )?
            {
             before(grammarAccess.getOperacionAccess().getGroup_6()); 
            // InternalBlockchain.g:2095:2: ( rule__Operacion__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlockchain.g:2095:3: rule__Operacion__Group_6__0
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
    // InternalBlockchain.g:2103:1: rule__Operacion__Group__7 : rule__Operacion__Group__7__Impl rule__Operacion__Group__8 ;
    public final void rule__Operacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2107:1: ( rule__Operacion__Group__7__Impl rule__Operacion__Group__8 )
            // InternalBlockchain.g:2108:2: rule__Operacion__Group__7__Impl rule__Operacion__Group__8
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
    // InternalBlockchain.g:2115:1: rule__Operacion__Group__7__Impl : ( '{' ) ;
    public final void rule__Operacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2119:1: ( ( '{' ) )
            // InternalBlockchain.g:2120:1: ( '{' )
            {
            // InternalBlockchain.g:2120:1: ( '{' )
            // InternalBlockchain.g:2121:2: '{'
            {
             before(grammarAccess.getOperacionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:2130:1: rule__Operacion__Group__8 : rule__Operacion__Group__8__Impl rule__Operacion__Group__9 ;
    public final void rule__Operacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2134:1: ( rule__Operacion__Group__8__Impl rule__Operacion__Group__9 )
            // InternalBlockchain.g:2135:2: rule__Operacion__Group__8__Impl rule__Operacion__Group__9
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
    // InternalBlockchain.g:2142:1: rule__Operacion__Group__8__Impl : ( ( 'return' )? ) ;
    public final void rule__Operacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2146:1: ( ( ( 'return' )? ) )
            // InternalBlockchain.g:2147:1: ( ( 'return' )? )
            {
            // InternalBlockchain.g:2147:1: ( ( 'return' )? )
            // InternalBlockchain.g:2148:2: ( 'return' )?
            {
             before(grammarAccess.getOperacionAccess().getReturnKeyword_8()); 
            // InternalBlockchain.g:2149:2: ( 'return' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlockchain.g:2149:3: 'return'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperacionAccess().getReturnKeyword_8()); 

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
    // InternalBlockchain.g:2157:1: rule__Operacion__Group__9 : rule__Operacion__Group__9__Impl rule__Operacion__Group__10 ;
    public final void rule__Operacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2161:1: ( rule__Operacion__Group__9__Impl rule__Operacion__Group__10 )
            // InternalBlockchain.g:2162:2: rule__Operacion__Group__9__Impl rule__Operacion__Group__10
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
    // InternalBlockchain.g:2169:1: rule__Operacion__Group__9__Impl : ( ( '(' )* ) ;
    public final void rule__Operacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2173:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2174:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2174:1: ( ( '(' )* )
            // InternalBlockchain.g:2175:2: ( '(' )*
            {
             before(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_9()); 
            // InternalBlockchain.g:2176:2: ( '(' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlockchain.g:2176:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLeftParenthesisKeyword_9()); 

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
    // InternalBlockchain.g:2184:1: rule__Operacion__Group__10 : rule__Operacion__Group__10__Impl rule__Operacion__Group__11 ;
    public final void rule__Operacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2188:1: ( rule__Operacion__Group__10__Impl rule__Operacion__Group__11 )
            // InternalBlockchain.g:2189:2: rule__Operacion__Group__10__Impl rule__Operacion__Group__11
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
    // InternalBlockchain.g:2196:1: rule__Operacion__Group__10__Impl : ( ( rule__Operacion__LineasAssignment_10 )* ) ;
    public final void rule__Operacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2200:1: ( ( ( rule__Operacion__LineasAssignment_10 )* ) )
            // InternalBlockchain.g:2201:1: ( ( rule__Operacion__LineasAssignment_10 )* )
            {
            // InternalBlockchain.g:2201:1: ( ( rule__Operacion__LineasAssignment_10 )* )
            // InternalBlockchain.g:2202:2: ( rule__Operacion__LineasAssignment_10 )*
            {
             before(grammarAccess.getOperacionAccess().getLineasAssignment_10()); 
            // InternalBlockchain.g:2203:2: ( rule__Operacion__LineasAssignment_10 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=49 && LA26_0<=56)||LA26_0==58) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalBlockchain.g:2203:3: rule__Operacion__LineasAssignment_10
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Operacion__LineasAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getLineasAssignment_10()); 

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
    // InternalBlockchain.g:2211:1: rule__Operacion__Group__11 : rule__Operacion__Group__11__Impl rule__Operacion__Group__12 ;
    public final void rule__Operacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2215:1: ( rule__Operacion__Group__11__Impl rule__Operacion__Group__12 )
            // InternalBlockchain.g:2216:2: rule__Operacion__Group__11__Impl rule__Operacion__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Operacion__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacion__Group__12();

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
    // InternalBlockchain.g:2223:1: rule__Operacion__Group__11__Impl : ( ( ')' )* ) ;
    public final void rule__Operacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2227:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2228:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2228:1: ( ( ')' )* )
            // InternalBlockchain.g:2229:2: ( ')' )*
            {
             before(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_11()); 
            // InternalBlockchain.g:2230:2: ( ')' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlockchain.g:2230:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getOperacionAccess().getRightParenthesisKeyword_11()); 

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


    // $ANTLR start "rule__Operacion__Group__12"
    // InternalBlockchain.g:2238:1: rule__Operacion__Group__12 : rule__Operacion__Group__12__Impl ;
    public final void rule__Operacion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2242:1: ( rule__Operacion__Group__12__Impl )
            // InternalBlockchain.g:2243:2: rule__Operacion__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacion__Group__12__Impl();

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
    // $ANTLR end "rule__Operacion__Group__12"


    // $ANTLR start "rule__Operacion__Group__12__Impl"
    // InternalBlockchain.g:2249:1: rule__Operacion__Group__12__Impl : ( '}' ) ;
    public final void rule__Operacion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2253:1: ( ( '}' ) )
            // InternalBlockchain.g:2254:1: ( '}' )
            {
            // InternalBlockchain.g:2254:1: ( '}' )
            // InternalBlockchain.g:2255:2: '}'
            {
             before(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOperacionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Operacion__Group__12__Impl"


    // $ANTLR start "rule__Operacion__Group_1__0"
    // InternalBlockchain.g:2265:1: rule__Operacion__Group_1__0 : rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 ;
    public final void rule__Operacion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2269:1: ( rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1 )
            // InternalBlockchain.g:2270:2: rule__Operacion__Group_1__0__Impl rule__Operacion__Group_1__1
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
    // InternalBlockchain.g:2277:1: rule__Operacion__Group_1__0__Impl : ( 'isUd=' ) ;
    public final void rule__Operacion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2281:1: ( ( 'isUd=' ) )
            // InternalBlockchain.g:2282:1: ( 'isUd=' )
            {
            // InternalBlockchain.g:2282:1: ( 'isUd=' )
            // InternalBlockchain.g:2283:2: 'isUd='
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
    // InternalBlockchain.g:2292:1: rule__Operacion__Group_1__1 : rule__Operacion__Group_1__1__Impl ;
    public final void rule__Operacion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2296:1: ( rule__Operacion__Group_1__1__Impl )
            // InternalBlockchain.g:2297:2: rule__Operacion__Group_1__1__Impl
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
    // InternalBlockchain.g:2303:1: rule__Operacion__Group_1__1__Impl : ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) ;
    public final void rule__Operacion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2307:1: ( ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) ) )
            // InternalBlockchain.g:2308:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            {
            // InternalBlockchain.g:2308:1: ( ( rule__Operacion__EsUserDefinedAssignment_1_1 ) )
            // InternalBlockchain.g:2309:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getEsUserDefinedAssignment_1_1()); 
            // InternalBlockchain.g:2310:2: ( rule__Operacion__EsUserDefinedAssignment_1_1 )
            // InternalBlockchain.g:2310:3: rule__Operacion__EsUserDefinedAssignment_1_1
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
    // InternalBlockchain.g:2319:1: rule__Operacion__Group_4__0 : rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 ;
    public final void rule__Operacion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2323:1: ( rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1 )
            // InternalBlockchain.g:2324:2: rule__Operacion__Group_4__0__Impl rule__Operacion__Group_4__1
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
    // InternalBlockchain.g:2331:1: rule__Operacion__Group_4__0__Impl : ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) ;
    public final void rule__Operacion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2335:1: ( ( ( rule__Operacion__ParametrosAssignment_4_0 ) ) )
            // InternalBlockchain.g:2336:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            {
            // InternalBlockchain.g:2336:1: ( ( rule__Operacion__ParametrosAssignment_4_0 ) )
            // InternalBlockchain.g:2337:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_0()); 
            // InternalBlockchain.g:2338:2: ( rule__Operacion__ParametrosAssignment_4_0 )
            // InternalBlockchain.g:2338:3: rule__Operacion__ParametrosAssignment_4_0
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
    // InternalBlockchain.g:2346:1: rule__Operacion__Group_4__1 : rule__Operacion__Group_4__1__Impl ;
    public final void rule__Operacion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2350:1: ( rule__Operacion__Group_4__1__Impl )
            // InternalBlockchain.g:2351:2: rule__Operacion__Group_4__1__Impl
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
    // InternalBlockchain.g:2357:1: rule__Operacion__Group_4__1__Impl : ( ( rule__Operacion__Group_4_1__0 )* ) ;
    public final void rule__Operacion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2361:1: ( ( ( rule__Operacion__Group_4_1__0 )* ) )
            // InternalBlockchain.g:2362:1: ( ( rule__Operacion__Group_4_1__0 )* )
            {
            // InternalBlockchain.g:2362:1: ( ( rule__Operacion__Group_4_1__0 )* )
            // InternalBlockchain.g:2363:2: ( rule__Operacion__Group_4_1__0 )*
            {
             before(grammarAccess.getOperacionAccess().getGroup_4_1()); 
            // InternalBlockchain.g:2364:2: ( rule__Operacion__Group_4_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlockchain.g:2364:3: rule__Operacion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Operacion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalBlockchain.g:2373:1: rule__Operacion__Group_4_1__0 : rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 ;
    public final void rule__Operacion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2377:1: ( rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1 )
            // InternalBlockchain.g:2378:2: rule__Operacion__Group_4_1__0__Impl rule__Operacion__Group_4_1__1
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
    // InternalBlockchain.g:2385:1: rule__Operacion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Operacion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2389:1: ( ( ',' ) )
            // InternalBlockchain.g:2390:1: ( ',' )
            {
            // InternalBlockchain.g:2390:1: ( ',' )
            // InternalBlockchain.g:2391:2: ','
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
    // InternalBlockchain.g:2400:1: rule__Operacion__Group_4_1__1 : rule__Operacion__Group_4_1__1__Impl ;
    public final void rule__Operacion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2404:1: ( rule__Operacion__Group_4_1__1__Impl )
            // InternalBlockchain.g:2405:2: rule__Operacion__Group_4_1__1__Impl
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
    // InternalBlockchain.g:2411:1: rule__Operacion__Group_4_1__1__Impl : ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) ;
    public final void rule__Operacion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2415:1: ( ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) ) )
            // InternalBlockchain.g:2416:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            {
            // InternalBlockchain.g:2416:1: ( ( rule__Operacion__ParametrosAssignment_4_1_1 ) )
            // InternalBlockchain.g:2417:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            {
             before(grammarAccess.getOperacionAccess().getParametrosAssignment_4_1_1()); 
            // InternalBlockchain.g:2418:2: ( rule__Operacion__ParametrosAssignment_4_1_1 )
            // InternalBlockchain.g:2418:3: rule__Operacion__ParametrosAssignment_4_1_1
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
    // InternalBlockchain.g:2427:1: rule__Operacion__Group_6__0 : rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 ;
    public final void rule__Operacion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2431:1: ( rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1 )
            // InternalBlockchain.g:2432:2: rule__Operacion__Group_6__0__Impl rule__Operacion__Group_6__1
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
    // InternalBlockchain.g:2439:1: rule__Operacion__Group_6__0__Impl : ( ':' ) ;
    public final void rule__Operacion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2443:1: ( ( ':' ) )
            // InternalBlockchain.g:2444:1: ( ':' )
            {
            // InternalBlockchain.g:2444:1: ( ':' )
            // InternalBlockchain.g:2445:2: ':'
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
    // InternalBlockchain.g:2454:1: rule__Operacion__Group_6__1 : rule__Operacion__Group_6__1__Impl ;
    public final void rule__Operacion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2458:1: ( rule__Operacion__Group_6__1__Impl )
            // InternalBlockchain.g:2459:2: rule__Operacion__Group_6__1__Impl
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
    // InternalBlockchain.g:2465:1: rule__Operacion__Group_6__1__Impl : ( ( rule__Operacion__RetornoAssignment_6_1 ) ) ;
    public final void rule__Operacion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2469:1: ( ( ( rule__Operacion__RetornoAssignment_6_1 ) ) )
            // InternalBlockchain.g:2470:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            {
            // InternalBlockchain.g:2470:1: ( ( rule__Operacion__RetornoAssignment_6_1 ) )
            // InternalBlockchain.g:2471:2: ( rule__Operacion__RetornoAssignment_6_1 )
            {
             before(grammarAccess.getOperacionAccess().getRetornoAssignment_6_1()); 
            // InternalBlockchain.g:2472:2: ( rule__Operacion__RetornoAssignment_6_1 )
            // InternalBlockchain.g:2472:3: rule__Operacion__RetornoAssignment_6_1
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
    // InternalBlockchain.g:2481:1: rule__Estado__Group__0 : rule__Estado__Group__0__Impl rule__Estado__Group__1 ;
    public final void rule__Estado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2485:1: ( rule__Estado__Group__0__Impl rule__Estado__Group__1 )
            // InternalBlockchain.g:2486:2: rule__Estado__Group__0__Impl rule__Estado__Group__1
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
    // InternalBlockchain.g:2493:1: rule__Estado__Group__0__Impl : ( 'Estado' ) ;
    public final void rule__Estado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2497:1: ( ( 'Estado' ) )
            // InternalBlockchain.g:2498:1: ( 'Estado' )
            {
            // InternalBlockchain.g:2498:1: ( 'Estado' )
            // InternalBlockchain.g:2499:2: 'Estado'
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
    // InternalBlockchain.g:2508:1: rule__Estado__Group__1 : rule__Estado__Group__1__Impl rule__Estado__Group__2 ;
    public final void rule__Estado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2512:1: ( rule__Estado__Group__1__Impl rule__Estado__Group__2 )
            // InternalBlockchain.g:2513:2: rule__Estado__Group__1__Impl rule__Estado__Group__2
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
    // InternalBlockchain.g:2520:1: rule__Estado__Group__1__Impl : ( ( rule__Estado__TipodatoAssignment_1 ) ) ;
    public final void rule__Estado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2524:1: ( ( ( rule__Estado__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:2525:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:2525:1: ( ( rule__Estado__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:2526:2: ( rule__Estado__TipodatoAssignment_1 )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:2527:2: ( rule__Estado__TipodatoAssignment_1 )
            // InternalBlockchain.g:2527:3: rule__Estado__TipodatoAssignment_1
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
    // InternalBlockchain.g:2535:1: rule__Estado__Group__2 : rule__Estado__Group__2__Impl ;
    public final void rule__Estado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2539:1: ( rule__Estado__Group__2__Impl )
            // InternalBlockchain.g:2540:2: rule__Estado__Group__2__Impl
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
    // InternalBlockchain.g:2546:1: rule__Estado__Group__2__Impl : ( ( rule__Estado__NameAssignment_2 ) ) ;
    public final void rule__Estado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2550:1: ( ( ( rule__Estado__NameAssignment_2 ) ) )
            // InternalBlockchain.g:2551:1: ( ( rule__Estado__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:2551:1: ( ( rule__Estado__NameAssignment_2 ) )
            // InternalBlockchain.g:2552:2: ( rule__Estado__NameAssignment_2 )
            {
             before(grammarAccess.getEstadoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:2553:2: ( rule__Estado__NameAssignment_2 )
            // InternalBlockchain.g:2553:3: rule__Estado__NameAssignment_2
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
    // InternalBlockchain.g:2562:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2566:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalBlockchain.g:2567:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBlockchain.g:2574:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__TipodatoAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2578:1: ( ( ( rule__Atributo__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2579:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2579:1: ( ( rule__Atributo__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2580:2: ( rule__Atributo__TipodatoAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2581:2: ( rule__Atributo__TipodatoAssignment_0 )
            // InternalBlockchain.g:2581:3: rule__Atributo__TipodatoAssignment_0
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
    // InternalBlockchain.g:2589:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2593:1: ( rule__Atributo__Group__1__Impl )
            // InternalBlockchain.g:2594:2: rule__Atributo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1__Impl();

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
    // InternalBlockchain.g:2600:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__NameAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2604:1: ( ( ( rule__Atributo__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2605:1: ( ( rule__Atributo__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2605:1: ( ( rule__Atributo__NameAssignment_1 ) )
            // InternalBlockchain.g:2606:2: ( rule__Atributo__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2607:2: ( rule__Atributo__NameAssignment_1 )
            // InternalBlockchain.g:2607:3: rule__Atributo__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalBlockchain.g:2616:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2620:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalBlockchain.g:2621:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
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
    // InternalBlockchain.g:2628:1: rule__Parametro__Group__0__Impl : ( ( rule__Parametro__TipodatoAssignment_0 ) ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2632:1: ( ( ( rule__Parametro__TipodatoAssignment_0 ) ) )
            // InternalBlockchain.g:2633:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            {
            // InternalBlockchain.g:2633:1: ( ( rule__Parametro__TipodatoAssignment_0 ) )
            // InternalBlockchain.g:2634:2: ( rule__Parametro__TipodatoAssignment_0 )
            {
             before(grammarAccess.getParametroAccess().getTipodatoAssignment_0()); 
            // InternalBlockchain.g:2635:2: ( rule__Parametro__TipodatoAssignment_0 )
            // InternalBlockchain.g:2635:3: rule__Parametro__TipodatoAssignment_0
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
    // InternalBlockchain.g:2643:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2647:1: ( rule__Parametro__Group__1__Impl )
            // InternalBlockchain.g:2648:2: rule__Parametro__Group__1__Impl
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
    // InternalBlockchain.g:2654:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__NameAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2658:1: ( ( ( rule__Parametro__NameAssignment_1 ) ) )
            // InternalBlockchain.g:2659:1: ( ( rule__Parametro__NameAssignment_1 ) )
            {
            // InternalBlockchain.g:2659:1: ( ( rule__Parametro__NameAssignment_1 ) )
            // InternalBlockchain.g:2660:2: ( rule__Parametro__NameAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getNameAssignment_1()); 
            // InternalBlockchain.g:2661:2: ( rule__Parametro__NameAssignment_1 )
            // InternalBlockchain.g:2661:3: rule__Parametro__NameAssignment_1
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
    // InternalBlockchain.g:2670:1: rule__ExpresionLogica__Group__0 : rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 ;
    public final void rule__ExpresionLogica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2674:1: ( rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1 )
            // InternalBlockchain.g:2675:2: rule__ExpresionLogica__Group__0__Impl rule__ExpresionLogica__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2682:1: rule__ExpresionLogica__Group__0__Impl : ( 'ExpLog' ) ;
    public final void rule__ExpresionLogica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2686:1: ( ( 'ExpLog' ) )
            // InternalBlockchain.g:2687:1: ( 'ExpLog' )
            {
            // InternalBlockchain.g:2687:1: ( 'ExpLog' )
            // InternalBlockchain.g:2688:2: 'ExpLog'
            {
             before(grammarAccess.getExpresionLogicaAccess().getExpLogKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBlockchain.g:2697:1: rule__ExpresionLogica__Group__1 : rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 ;
    public final void rule__ExpresionLogica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2701:1: ( rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2 )
            // InternalBlockchain.g:2702:2: rule__ExpresionLogica__Group__1__Impl rule__ExpresionLogica__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2709:1: rule__ExpresionLogica__Group__1__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2713:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2714:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2714:1: ( ( '(' )* )
            // InternalBlockchain.g:2715:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_1()); 
            // InternalBlockchain.g:2716:2: ( '(' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlockchain.g:2716:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

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
    // InternalBlockchain.g:2724:1: rule__ExpresionLogica__Group__2 : rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 ;
    public final void rule__ExpresionLogica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2728:1: ( rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3 )
            // InternalBlockchain.g:2729:2: rule__ExpresionLogica__Group__2__Impl rule__ExpresionLogica__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2736:1: rule__ExpresionLogica__Group__2__Impl : ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) ;
    public final void rule__ExpresionLogica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2740:1: ( ( ( rule__ExpresionLogica__IzqAssignment_2 ) ) )
            // InternalBlockchain.g:2741:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            {
            // InternalBlockchain.g:2741:1: ( ( rule__ExpresionLogica__IzqAssignment_2 ) )
            // InternalBlockchain.g:2742:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getIzqAssignment_2()); 
            // InternalBlockchain.g:2743:2: ( rule__ExpresionLogica__IzqAssignment_2 )
            // InternalBlockchain.g:2743:3: rule__ExpresionLogica__IzqAssignment_2
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
    // InternalBlockchain.g:2751:1: rule__ExpresionLogica__Group__3 : rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 ;
    public final void rule__ExpresionLogica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2755:1: ( rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4 )
            // InternalBlockchain.g:2756:2: rule__ExpresionLogica__Group__3__Impl rule__ExpresionLogica__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2763:1: rule__ExpresionLogica__Group__3__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2767:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2768:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2768:1: ( ( ')' )* )
            // InternalBlockchain.g:2769:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_3()); 
            // InternalBlockchain.g:2770:2: ( ')' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==43) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBlockchain.g:2770:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

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
    // InternalBlockchain.g:2778:1: rule__ExpresionLogica__Group__4 : rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 ;
    public final void rule__ExpresionLogica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2782:1: ( rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5 )
            // InternalBlockchain.g:2783:2: rule__ExpresionLogica__Group__4__Impl rule__ExpresionLogica__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2790:1: rule__ExpresionLogica__Group__4__Impl : ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) ;
    public final void rule__ExpresionLogica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2794:1: ( ( ( rule__ExpresionLogica__OperadorAssignment_4 )? ) )
            // InternalBlockchain.g:2795:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            {
            // InternalBlockchain.g:2795:1: ( ( rule__ExpresionLogica__OperadorAssignment_4 )? )
            // InternalBlockchain.g:2796:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            {
             before(grammarAccess.getExpresionLogicaAccess().getOperadorAssignment_4()); 
            // InternalBlockchain.g:2797:2: ( rule__ExpresionLogica__OperadorAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=16 && LA31_0<=23)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBlockchain.g:2797:3: rule__ExpresionLogica__OperadorAssignment_4
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
    // InternalBlockchain.g:2805:1: rule__ExpresionLogica__Group__5 : rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 ;
    public final void rule__ExpresionLogica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2809:1: ( rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6 )
            // InternalBlockchain.g:2810:2: rule__ExpresionLogica__Group__5__Impl rule__ExpresionLogica__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalBlockchain.g:2817:1: rule__ExpresionLogica__Group__5__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionLogica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2821:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2822:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2822:1: ( ( '(' )* )
            // InternalBlockchain.g:2823:2: ( '(' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getLeftParenthesisKeyword_5()); 
            // InternalBlockchain.g:2824:2: ( '(' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBlockchain.g:2824:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

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
    // InternalBlockchain.g:2832:1: rule__ExpresionLogica__Group__6 : rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 ;
    public final void rule__ExpresionLogica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2836:1: ( rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7 )
            // InternalBlockchain.g:2837:2: rule__ExpresionLogica__Group__6__Impl rule__ExpresionLogica__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalBlockchain.g:2844:1: rule__ExpresionLogica__Group__6__Impl : ( ( rule__ExpresionLogica__DerAssignment_6 ) ) ;
    public final void rule__ExpresionLogica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2848:1: ( ( ( rule__ExpresionLogica__DerAssignment_6 ) ) )
            // InternalBlockchain.g:2849:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            {
            // InternalBlockchain.g:2849:1: ( ( rule__ExpresionLogica__DerAssignment_6 ) )
            // InternalBlockchain.g:2850:2: ( rule__ExpresionLogica__DerAssignment_6 )
            {
             before(grammarAccess.getExpresionLogicaAccess().getDerAssignment_6()); 
            // InternalBlockchain.g:2851:2: ( rule__ExpresionLogica__DerAssignment_6 )
            // InternalBlockchain.g:2851:3: rule__ExpresionLogica__DerAssignment_6
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
    // InternalBlockchain.g:2859:1: rule__ExpresionLogica__Group__7 : rule__ExpresionLogica__Group__7__Impl ;
    public final void rule__ExpresionLogica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2863:1: ( rule__ExpresionLogica__Group__7__Impl )
            // InternalBlockchain.g:2864:2: rule__ExpresionLogica__Group__7__Impl
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
    // InternalBlockchain.g:2870:1: rule__ExpresionLogica__Group__7__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionLogica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2874:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:2875:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:2875:1: ( ( ')' )* )
            // InternalBlockchain.g:2876:2: ( ')' )*
            {
             before(grammarAccess.getExpresionLogicaAccess().getRightParenthesisKeyword_7()); 
            // InternalBlockchain.g:2877:2: ( ')' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBlockchain.g:2877:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

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
    // InternalBlockchain.g:2886:1: rule__ExpresionAritmetica__Group__0 : rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 ;
    public final void rule__ExpresionAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2890:1: ( rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1 )
            // InternalBlockchain.g:2891:2: rule__ExpresionAritmetica__Group__0__Impl rule__ExpresionAritmetica__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBlockchain.g:2898:1: rule__ExpresionAritmetica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2902:1: ( ( () ) )
            // InternalBlockchain.g:2903:1: ( () )
            {
            // InternalBlockchain.g:2903:1: ( () )
            // InternalBlockchain.g:2904:2: ()
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpresionAritmeticaAction_0()); 
            // InternalBlockchain.g:2905:2: ()
            // InternalBlockchain.g:2905:3: 
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
    // InternalBlockchain.g:2913:1: rule__ExpresionAritmetica__Group__1 : rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 ;
    public final void rule__ExpresionAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2917:1: ( rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2 )
            // InternalBlockchain.g:2918:2: rule__ExpresionAritmetica__Group__1__Impl rule__ExpresionAritmetica__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2925:1: rule__ExpresionAritmetica__Group__1__Impl : ( 'ExpArit' ) ;
    public final void rule__ExpresionAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2929:1: ( ( 'ExpArit' ) )
            // InternalBlockchain.g:2930:1: ( 'ExpArit' )
            {
            // InternalBlockchain.g:2930:1: ( 'ExpArit' )
            // InternalBlockchain.g:2931:2: 'ExpArit'
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getExpAritKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBlockchain.g:2940:1: rule__ExpresionAritmetica__Group__2 : rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 ;
    public final void rule__ExpresionAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2944:1: ( rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3 )
            // InternalBlockchain.g:2945:2: rule__ExpresionAritmetica__Group__2__Impl rule__ExpresionAritmetica__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBlockchain.g:2952:1: rule__ExpresionAritmetica__Group__2__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2956:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:2957:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:2957:1: ( ( '(' )* )
            // InternalBlockchain.g:2958:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_2()); 
            // InternalBlockchain.g:2959:2: ( '(' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==42) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalBlockchain.g:2959:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

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
    // InternalBlockchain.g:2967:1: rule__ExpresionAritmetica__Group__3 : rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 ;
    public final void rule__ExpresionAritmetica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2971:1: ( rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4 )
            // InternalBlockchain.g:2972:2: rule__ExpresionAritmetica__Group__3__Impl rule__ExpresionAritmetica__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalBlockchain.g:2979:1: rule__ExpresionAritmetica__Group__3__Impl : ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) ;
    public final void rule__ExpresionAritmetica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2983:1: ( ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) ) )
            // InternalBlockchain.g:2984:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            {
            // InternalBlockchain.g:2984:1: ( ( rule__ExpresionAritmetica__IzqAssignment_3 ) )
            // InternalBlockchain.g:2985:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getIzqAssignment_3()); 
            // InternalBlockchain.g:2986:2: ( rule__ExpresionAritmetica__IzqAssignment_3 )
            // InternalBlockchain.g:2986:3: rule__ExpresionAritmetica__IzqAssignment_3
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
    // InternalBlockchain.g:2994:1: rule__ExpresionAritmetica__Group__4 : rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 ;
    public final void rule__ExpresionAritmetica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:2998:1: ( rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5 )
            // InternalBlockchain.g:2999:2: rule__ExpresionAritmetica__Group__4__Impl rule__ExpresionAritmetica__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalBlockchain.g:3006:1: rule__ExpresionAritmetica__Group__4__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3010:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3011:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3011:1: ( ( ')' )* )
            // InternalBlockchain.g:3012:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_4()); 
            // InternalBlockchain.g:3013:2: ( ')' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==43) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalBlockchain.g:3013:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

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
    // InternalBlockchain.g:3021:1: rule__ExpresionAritmetica__Group__5 : rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 ;
    public final void rule__ExpresionAritmetica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3025:1: ( rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6 )
            // InternalBlockchain.g:3026:2: rule__ExpresionAritmetica__Group__5__Impl rule__ExpresionAritmetica__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalBlockchain.g:3033:1: rule__ExpresionAritmetica__Group__5__Impl : ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) ;
    public final void rule__ExpresionAritmetica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3037:1: ( ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? ) )
            // InternalBlockchain.g:3038:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            {
            // InternalBlockchain.g:3038:1: ( ( rule__ExpresionAritmetica__OperadorAssignment_5 )? )
            // InternalBlockchain.g:3039:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getOperadorAssignment_5()); 
            // InternalBlockchain.g:3040:2: ( rule__ExpresionAritmetica__OperadorAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=24 && LA36_0<=30)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBlockchain.g:3040:3: rule__ExpresionAritmetica__OperadorAssignment_5
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
    // InternalBlockchain.g:3048:1: rule__ExpresionAritmetica__Group__6 : rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 ;
    public final void rule__ExpresionAritmetica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3052:1: ( rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7 )
            // InternalBlockchain.g:3053:2: rule__ExpresionAritmetica__Group__6__Impl rule__ExpresionAritmetica__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalBlockchain.g:3060:1: rule__ExpresionAritmetica__Group__6__Impl : ( ( '(' )* ) ;
    public final void rule__ExpresionAritmetica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3064:1: ( ( ( '(' )* ) )
            // InternalBlockchain.g:3065:1: ( ( '(' )* )
            {
            // InternalBlockchain.g:3065:1: ( ( '(' )* )
            // InternalBlockchain.g:3066:2: ( '(' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getLeftParenthesisKeyword_6()); 
            // InternalBlockchain.g:3067:2: ( '(' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==42) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalBlockchain.g:3067:3: '('
            	    {
            	    match(input,42,FOLLOW_25); 

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
    // InternalBlockchain.g:3075:1: rule__ExpresionAritmetica__Group__7 : rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 ;
    public final void rule__ExpresionAritmetica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3079:1: ( rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8 )
            // InternalBlockchain.g:3080:2: rule__ExpresionAritmetica__Group__7__Impl rule__ExpresionAritmetica__Group__8
            {
            pushFollow(FOLLOW_33);
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
    // InternalBlockchain.g:3087:1: rule__ExpresionAritmetica__Group__7__Impl : ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) ;
    public final void rule__ExpresionAritmetica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3091:1: ( ( ( rule__ExpresionAritmetica__DerAssignment_7 ) ) )
            // InternalBlockchain.g:3092:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            {
            // InternalBlockchain.g:3092:1: ( ( rule__ExpresionAritmetica__DerAssignment_7 ) )
            // InternalBlockchain.g:3093:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getDerAssignment_7()); 
            // InternalBlockchain.g:3094:2: ( rule__ExpresionAritmetica__DerAssignment_7 )
            // InternalBlockchain.g:3094:3: rule__ExpresionAritmetica__DerAssignment_7
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
    // InternalBlockchain.g:3102:1: rule__ExpresionAritmetica__Group__8 : rule__ExpresionAritmetica__Group__8__Impl ;
    public final void rule__ExpresionAritmetica__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3106:1: ( rule__ExpresionAritmetica__Group__8__Impl )
            // InternalBlockchain.g:3107:2: rule__ExpresionAritmetica__Group__8__Impl
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
    // InternalBlockchain.g:3113:1: rule__ExpresionAritmetica__Group__8__Impl : ( ( ')' )* ) ;
    public final void rule__ExpresionAritmetica__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3117:1: ( ( ( ')' )* ) )
            // InternalBlockchain.g:3118:1: ( ( ')' )* )
            {
            // InternalBlockchain.g:3118:1: ( ( ')' )* )
            // InternalBlockchain.g:3119:2: ( ')' )*
            {
             before(grammarAccess.getExpresionAritmeticaAccess().getRightParenthesisKeyword_8()); 
            // InternalBlockchain.g:3120:2: ( ')' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==43) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalBlockchain.g:3120:3: ')'
            	    {
            	    match(input,43,FOLLOW_27); 

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
    // InternalBlockchain.g:3129:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3133:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalBlockchain.g:3134:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalBlockchain.g:3141:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3145:1: ( ( 'var' ) )
            // InternalBlockchain.g:3146:1: ( 'var' )
            {
            // InternalBlockchain.g:3146:1: ( 'var' )
            // InternalBlockchain.g:3147:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBlockchain.g:3156:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3160:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalBlockchain.g:3161:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalBlockchain.g:3168:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__TipodatoAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3172:1: ( ( ( rule__Variable__TipodatoAssignment_1 ) ) )
            // InternalBlockchain.g:3173:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            {
            // InternalBlockchain.g:3173:1: ( ( rule__Variable__TipodatoAssignment_1 ) )
            // InternalBlockchain.g:3174:2: ( rule__Variable__TipodatoAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getTipodatoAssignment_1()); 
            // InternalBlockchain.g:3175:2: ( rule__Variable__TipodatoAssignment_1 )
            // InternalBlockchain.g:3175:3: rule__Variable__TipodatoAssignment_1
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
    // InternalBlockchain.g:3183:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3187:1: ( rule__Variable__Group__2__Impl )
            // InternalBlockchain.g:3188:2: rule__Variable__Group__2__Impl
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
    // InternalBlockchain.g:3194:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__NameAssignment_2 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3198:1: ( ( ( rule__Variable__NameAssignment_2 )? ) )
            // InternalBlockchain.g:3199:1: ( ( rule__Variable__NameAssignment_2 )? )
            {
            // InternalBlockchain.g:3199:1: ( ( rule__Variable__NameAssignment_2 )? )
            // InternalBlockchain.g:3200:2: ( rule__Variable__NameAssignment_2 )?
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:3201:2: ( rule__Variable__NameAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBlockchain.g:3201:3: rule__Variable__NameAssignment_2
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
    // InternalBlockchain.g:3210:1: rule__Condicional__Group__0 : rule__Condicional__Group__0__Impl rule__Condicional__Group__1 ;
    public final void rule__Condicional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3214:1: ( rule__Condicional__Group__0__Impl rule__Condicional__Group__1 )
            // InternalBlockchain.g:3215:2: rule__Condicional__Group__0__Impl rule__Condicional__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBlockchain.g:3222:1: rule__Condicional__Group__0__Impl : ( () ) ;
    public final void rule__Condicional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3226:1: ( ( () ) )
            // InternalBlockchain.g:3227:1: ( () )
            {
            // InternalBlockchain.g:3227:1: ( () )
            // InternalBlockchain.g:3228:2: ()
            {
             before(grammarAccess.getCondicionalAccess().getCondicionalAction_0()); 
            // InternalBlockchain.g:3229:2: ()
            // InternalBlockchain.g:3229:3: 
            {
            }

             after(grammarAccess.getCondicionalAccess().getCondicionalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicional__Group__0__Impl"


    // $ANTLR start "rule__Condicional__Group__1"
    // InternalBlockchain.g:3237:1: rule__Condicional__Group__1 : rule__Condicional__Group__1__Impl rule__Condicional__Group__2 ;
    public final void rule__Condicional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3241:1: ( rule__Condicional__Group__1__Impl rule__Condicional__Group__2 )
            // InternalBlockchain.g:3242:2: rule__Condicional__Group__1__Impl rule__Condicional__Group__2
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
    // InternalBlockchain.g:3249:1: rule__Condicional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Condicional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3253:1: ( ( 'if' ) )
            // InternalBlockchain.g:3254:1: ( 'if' )
            {
            // InternalBlockchain.g:3254:1: ( 'if' )
            // InternalBlockchain.g:3255:2: 'if'
            {
             before(grammarAccess.getCondicionalAccess().getIfKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getIfKeyword_1()); 

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
    // InternalBlockchain.g:3264:1: rule__Condicional__Group__2 : rule__Condicional__Group__2__Impl rule__Condicional__Group__3 ;
    public final void rule__Condicional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3268:1: ( rule__Condicional__Group__2__Impl rule__Condicional__Group__3 )
            // InternalBlockchain.g:3269:2: rule__Condicional__Group__2__Impl rule__Condicional__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBlockchain.g:3276:1: rule__Condicional__Group__2__Impl : ( ( rule__Condicional__ExpresionlogicaAssignment_2 )? ) ;
    public final void rule__Condicional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3280:1: ( ( ( rule__Condicional__ExpresionlogicaAssignment_2 )? ) )
            // InternalBlockchain.g:3281:1: ( ( rule__Condicional__ExpresionlogicaAssignment_2 )? )
            {
            // InternalBlockchain.g:3281:1: ( ( rule__Condicional__ExpresionlogicaAssignment_2 )? )
            // InternalBlockchain.g:3282:2: ( rule__Condicional__ExpresionlogicaAssignment_2 )?
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_2()); 
            // InternalBlockchain.g:3283:2: ( rule__Condicional__ExpresionlogicaAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBlockchain.g:3283:3: rule__Condicional__ExpresionlogicaAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condicional__ExpresionlogicaAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaAssignment_2()); 

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
    // InternalBlockchain.g:3291:1: rule__Condicional__Group__3 : rule__Condicional__Group__3__Impl rule__Condicional__Group__4 ;
    public final void rule__Condicional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3295:1: ( rule__Condicional__Group__3__Impl rule__Condicional__Group__4 )
            // InternalBlockchain.g:3296:2: rule__Condicional__Group__3__Impl rule__Condicional__Group__4
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
    // InternalBlockchain.g:3303:1: rule__Condicional__Group__3__Impl : ( '{' ) ;
    public final void rule__Condicional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3307:1: ( ( '{' ) )
            // InternalBlockchain.g:3308:1: ( '{' )
            {
            // InternalBlockchain.g:3308:1: ( '{' )
            // InternalBlockchain.g:3309:2: '{'
            {
             before(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalBlockchain.g:3318:1: rule__Condicional__Group__4 : rule__Condicional__Group__4__Impl rule__Condicional__Group__5 ;
    public final void rule__Condicional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3322:1: ( rule__Condicional__Group__4__Impl rule__Condicional__Group__5 )
            // InternalBlockchain.g:3323:2: rule__Condicional__Group__4__Impl rule__Condicional__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBlockchain.g:3330:1: rule__Condicional__Group__4__Impl : ( ( rule__Condicional__ValidadorAssignment_4 )* ) ;
    public final void rule__Condicional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3334:1: ( ( ( rule__Condicional__ValidadorAssignment_4 )* ) )
            // InternalBlockchain.g:3335:1: ( ( rule__Condicional__ValidadorAssignment_4 )* )
            {
            // InternalBlockchain.g:3335:1: ( ( rule__Condicional__ValidadorAssignment_4 )* )
            // InternalBlockchain.g:3336:2: ( rule__Condicional__ValidadorAssignment_4 )*
            {
             before(grammarAccess.getCondicionalAccess().getValidadorAssignment_4()); 
            // InternalBlockchain.g:3337:2: ( rule__Condicional__ValidadorAssignment_4 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=49 && LA41_0<=56)||LA41_0==58) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBlockchain.g:3337:3: rule__Condicional__ValidadorAssignment_4
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Condicional__ValidadorAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getCondicionalAccess().getValidadorAssignment_4()); 

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
    // InternalBlockchain.g:3345:1: rule__Condicional__Group__5 : rule__Condicional__Group__5__Impl ;
    public final void rule__Condicional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3349:1: ( rule__Condicional__Group__5__Impl )
            // InternalBlockchain.g:3350:2: rule__Condicional__Group__5__Impl
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
    // InternalBlockchain.g:3356:1: rule__Condicional__Group__5__Impl : ( '}' ) ;
    public final void rule__Condicional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3360:1: ( ( '}' ) )
            // InternalBlockchain.g:3361:1: ( '}' )
            {
            // InternalBlockchain.g:3361:1: ( '}' )
            // InternalBlockchain.g:3362:2: '}'
            {
             before(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCondicionalAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__ExpresionNumerica__Group__0"
    // InternalBlockchain.g:3372:1: rule__ExpresionNumerica__Group__0 : rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 ;
    public final void rule__ExpresionNumerica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3376:1: ( rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1 )
            // InternalBlockchain.g:3377:2: rule__ExpresionNumerica__Group__0__Impl rule__ExpresionNumerica__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBlockchain.g:3384:1: rule__ExpresionNumerica__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionNumerica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3388:1: ( ( () ) )
            // InternalBlockchain.g:3389:1: ( () )
            {
            // InternalBlockchain.g:3389:1: ( () )
            // InternalBlockchain.g:3390:2: ()
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpresionNumericaAction_0()); 
            // InternalBlockchain.g:3391:2: ()
            // InternalBlockchain.g:3391:3: 
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
    // InternalBlockchain.g:3399:1: rule__ExpresionNumerica__Group__1 : rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 ;
    public final void rule__ExpresionNumerica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3403:1: ( rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2 )
            // InternalBlockchain.g:3404:2: rule__ExpresionNumerica__Group__1__Impl rule__ExpresionNumerica__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:3411:1: rule__ExpresionNumerica__Group__1__Impl : ( 'ExpNum' ) ;
    public final void rule__ExpresionNumerica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3415:1: ( ( 'ExpNum' ) )
            // InternalBlockchain.g:3416:1: ( 'ExpNum' )
            {
            // InternalBlockchain.g:3416:1: ( 'ExpNum' )
            // InternalBlockchain.g:3417:2: 'ExpNum'
            {
             before(grammarAccess.getExpresionNumericaAccess().getExpNumKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBlockchain.g:3426:1: rule__ExpresionNumerica__Group__2 : rule__ExpresionNumerica__Group__2__Impl ;
    public final void rule__ExpresionNumerica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3430:1: ( rule__ExpresionNumerica__Group__2__Impl )
            // InternalBlockchain.g:3431:2: rule__ExpresionNumerica__Group__2__Impl
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
    // InternalBlockchain.g:3437:1: rule__ExpresionNumerica__Group__2__Impl : ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionNumerica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3441:1: ( ( ( rule__ExpresionNumerica__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3442:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3442:1: ( ( rule__ExpresionNumerica__ValueAssignment_2 )? )
            // InternalBlockchain.g:3443:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionNumericaAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3444:2: ( rule__ExpresionNumerica__ValueAssignment_2 )?
            int alt42=2;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==RULE_INT||LA42_1==11) ) {
                        alt42=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt42=1;
                    }
                    break;
                case 11:
                    {
                    int LA42_3 = input.LA(2);

                    if ( (LA42_3==RULE_INT) ) {
                        alt42=1;
                    }
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // InternalBlockchain.g:3444:3: rule__ExpresionNumerica__ValueAssignment_2
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
    // InternalBlockchain.g:3453:1: rule__ExpresionTexto__Group__0 : rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 ;
    public final void rule__ExpresionTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3457:1: ( rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1 )
            // InternalBlockchain.g:3458:2: rule__ExpresionTexto__Group__0__Impl rule__ExpresionTexto__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalBlockchain.g:3465:1: rule__ExpresionTexto__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3469:1: ( ( () ) )
            // InternalBlockchain.g:3470:1: ( () )
            {
            // InternalBlockchain.g:3470:1: ( () )
            // InternalBlockchain.g:3471:2: ()
            {
             before(grammarAccess.getExpresionTextoAccess().getExpresionTextoAction_0()); 
            // InternalBlockchain.g:3472:2: ()
            // InternalBlockchain.g:3472:3: 
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
    // InternalBlockchain.g:3480:1: rule__ExpresionTexto__Group__1 : rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 ;
    public final void rule__ExpresionTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3484:1: ( rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2 )
            // InternalBlockchain.g:3485:2: rule__ExpresionTexto__Group__1__Impl rule__ExpresionTexto__Group__2
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
    // InternalBlockchain.g:3492:1: rule__ExpresionTexto__Group__1__Impl : ( 'ExpTex' ) ;
    public final void rule__ExpresionTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3496:1: ( ( 'ExpTex' ) )
            // InternalBlockchain.g:3497:1: ( 'ExpTex' )
            {
            // InternalBlockchain.g:3497:1: ( 'ExpTex' )
            // InternalBlockchain.g:3498:2: 'ExpTex'
            {
             before(grammarAccess.getExpresionTextoAccess().getExpTexKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBlockchain.g:3507:1: rule__ExpresionTexto__Group__2 : rule__ExpresionTexto__Group__2__Impl ;
    public final void rule__ExpresionTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3511:1: ( rule__ExpresionTexto__Group__2__Impl )
            // InternalBlockchain.g:3512:2: rule__ExpresionTexto__Group__2__Impl
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
    // InternalBlockchain.g:3518:1: rule__ExpresionTexto__Group__2__Impl : ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3522:1: ( ( ( rule__ExpresionTexto__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3523:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3523:1: ( ( rule__ExpresionTexto__ValueAssignment_2 )? )
            // InternalBlockchain.g:3524:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionTextoAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3525:2: ( rule__ExpresionTexto__ValueAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBlockchain.g:3525:3: rule__ExpresionTexto__ValueAssignment_2
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
    // InternalBlockchain.g:3534:1: rule__ExpresionBoolean__Group__0 : rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 ;
    public final void rule__ExpresionBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3538:1: ( rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1 )
            // InternalBlockchain.g:3539:2: rule__ExpresionBoolean__Group__0__Impl rule__ExpresionBoolean__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalBlockchain.g:3546:1: rule__ExpresionBoolean__Group__0__Impl : ( () ) ;
    public final void rule__ExpresionBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3550:1: ( ( () ) )
            // InternalBlockchain.g:3551:1: ( () )
            {
            // InternalBlockchain.g:3551:1: ( () )
            // InternalBlockchain.g:3552:2: ()
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpresionBooleanAction_0()); 
            // InternalBlockchain.g:3553:2: ()
            // InternalBlockchain.g:3553:3: 
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
    // InternalBlockchain.g:3561:1: rule__ExpresionBoolean__Group__1 : rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 ;
    public final void rule__ExpresionBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3565:1: ( rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2 )
            // InternalBlockchain.g:3566:2: rule__ExpresionBoolean__Group__1__Impl rule__ExpresionBoolean__Group__2
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
    // InternalBlockchain.g:3573:1: rule__ExpresionBoolean__Group__1__Impl : ( 'ExpBool' ) ;
    public final void rule__ExpresionBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3577:1: ( ( 'ExpBool' ) )
            // InternalBlockchain.g:3578:1: ( 'ExpBool' )
            {
            // InternalBlockchain.g:3578:1: ( 'ExpBool' )
            // InternalBlockchain.g:3579:2: 'ExpBool'
            {
             before(grammarAccess.getExpresionBooleanAccess().getExpBoolKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBlockchain.g:3588:1: rule__ExpresionBoolean__Group__2 : rule__ExpresionBoolean__Group__2__Impl ;
    public final void rule__ExpresionBoolean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3592:1: ( rule__ExpresionBoolean__Group__2__Impl )
            // InternalBlockchain.g:3593:2: rule__ExpresionBoolean__Group__2__Impl
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
    // InternalBlockchain.g:3599:1: rule__ExpresionBoolean__Group__2__Impl : ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) ;
    public final void rule__ExpresionBoolean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3603:1: ( ( ( rule__ExpresionBoolean__ValueAssignment_2 )? ) )
            // InternalBlockchain.g:3604:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            {
            // InternalBlockchain.g:3604:1: ( ( rule__ExpresionBoolean__ValueAssignment_2 )? )
            // InternalBlockchain.g:3605:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            {
             before(grammarAccess.getExpresionBooleanAccess().getValueAssignment_2()); 
            // InternalBlockchain.g:3606:2: ( rule__ExpresionBoolean__ValueAssignment_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=12 && LA44_0<=13)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBlockchain.g:3606:3: rule__ExpresionBoolean__ValueAssignment_2
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
    // InternalBlockchain.g:3615:1: rule__ExpresionReferenciada__Group__0 : rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 ;
    public final void rule__ExpresionReferenciada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3619:1: ( rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1 )
            // InternalBlockchain.g:3620:2: rule__ExpresionReferenciada__Group__0__Impl rule__ExpresionReferenciada__Group__1
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
    // InternalBlockchain.g:3627:1: rule__ExpresionReferenciada__Group__0__Impl : ( 'ExpRef' ) ;
    public final void rule__ExpresionReferenciada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3631:1: ( ( 'ExpRef' ) )
            // InternalBlockchain.g:3632:1: ( 'ExpRef' )
            {
            // InternalBlockchain.g:3632:1: ( 'ExpRef' )
            // InternalBlockchain.g:3633:2: 'ExpRef'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getExpRefKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBlockchain.g:3642:1: rule__ExpresionReferenciada__Group__1 : rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 ;
    public final void rule__ExpresionReferenciada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3646:1: ( rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2 )
            // InternalBlockchain.g:3647:2: rule__ExpresionReferenciada__Group__1__Impl rule__ExpresionReferenciada__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalBlockchain.g:3654:1: rule__ExpresionReferenciada__Group__1__Impl : ( '{' ) ;
    public final void rule__ExpresionReferenciada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3658:1: ( ( '{' ) )
            // InternalBlockchain.g:3659:1: ( '{' )
            {
            // InternalBlockchain.g:3659:1: ( '{' )
            // InternalBlockchain.g:3660:2: '{'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBlockchain.g:3669:1: rule__ExpresionReferenciada__Group__2 : rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 ;
    public final void rule__ExpresionReferenciada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3673:1: ( rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3 )
            // InternalBlockchain.g:3674:2: rule__ExpresionReferenciada__Group__2__Impl rule__ExpresionReferenciada__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalBlockchain.g:3681:1: rule__ExpresionReferenciada__Group__2__Impl : ( ( rule__ExpresionReferenciada__Group_2__0 )? ) ;
    public final void rule__ExpresionReferenciada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3685:1: ( ( ( rule__ExpresionReferenciada__Group_2__0 )? ) )
            // InternalBlockchain.g:3686:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            {
            // InternalBlockchain.g:3686:1: ( ( rule__ExpresionReferenciada__Group_2__0 )? )
            // InternalBlockchain.g:3687:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getGroup_2()); 
            // InternalBlockchain.g:3688:2: ( rule__ExpresionReferenciada__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBlockchain.g:3688:3: rule__ExpresionReferenciada__Group_2__0
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
    // InternalBlockchain.g:3696:1: rule__ExpresionReferenciada__Group__3 : rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 ;
    public final void rule__ExpresionReferenciada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3700:1: ( rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4 )
            // InternalBlockchain.g:3701:2: rule__ExpresionReferenciada__Group__3__Impl rule__ExpresionReferenciada__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalBlockchain.g:3708:1: rule__ExpresionReferenciada__Group__3__Impl : ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) ;
    public final void rule__ExpresionReferenciada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3712:1: ( ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) ) )
            // InternalBlockchain.g:3713:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            {
            // InternalBlockchain.g:3713:1: ( ( rule__ExpresionReferenciada__ReferenciaAssignment_3 ) )
            // InternalBlockchain.g:3714:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaAssignment_3()); 
            // InternalBlockchain.g:3715:2: ( rule__ExpresionReferenciada__ReferenciaAssignment_3 )
            // InternalBlockchain.g:3715:3: rule__ExpresionReferenciada__ReferenciaAssignment_3
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
    // InternalBlockchain.g:3723:1: rule__ExpresionReferenciada__Group__4 : rule__ExpresionReferenciada__Group__4__Impl ;
    public final void rule__ExpresionReferenciada__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3727:1: ( rule__ExpresionReferenciada__Group__4__Impl )
            // InternalBlockchain.g:3728:2: rule__ExpresionReferenciada__Group__4__Impl
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
    // InternalBlockchain.g:3734:1: rule__ExpresionReferenciada__Group__4__Impl : ( '}' ) ;
    public final void rule__ExpresionReferenciada__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3738:1: ( ( '}' ) )
            // InternalBlockchain.g:3739:1: ( '}' )
            {
            // InternalBlockchain.g:3739:1: ( '}' )
            // InternalBlockchain.g:3740:2: '}'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBlockchain.g:3750:1: rule__ExpresionReferenciada__Group_2__0 : rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 ;
    public final void rule__ExpresionReferenciada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3754:1: ( rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1 )
            // InternalBlockchain.g:3755:2: rule__ExpresionReferenciada__Group_2__0__Impl rule__ExpresionReferenciada__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:3762:1: rule__ExpresionReferenciada__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__ExpresionReferenciada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3766:1: ( ( 'id' ) )
            // InternalBlockchain.g:3767:1: ( 'id' )
            {
            // InternalBlockchain.g:3767:1: ( 'id' )
            // InternalBlockchain.g:3768:2: 'id'
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBlockchain.g:3777:1: rule__ExpresionReferenciada__Group_2__1 : rule__ExpresionReferenciada__Group_2__1__Impl ;
    public final void rule__ExpresionReferenciada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3781:1: ( rule__ExpresionReferenciada__Group_2__1__Impl )
            // InternalBlockchain.g:3782:2: rule__ExpresionReferenciada__Group_2__1__Impl
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
    // InternalBlockchain.g:3788:1: rule__ExpresionReferenciada__Group_2__1__Impl : ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) ;
    public final void rule__ExpresionReferenciada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3792:1: ( ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) ) )
            // InternalBlockchain.g:3793:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            {
            // InternalBlockchain.g:3793:1: ( ( rule__ExpresionReferenciada__IdAssignment_2_1 ) )
            // InternalBlockchain.g:3794:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getIdAssignment_2_1()); 
            // InternalBlockchain.g:3795:2: ( rule__ExpresionReferenciada__IdAssignment_2_1 )
            // InternalBlockchain.g:3795:3: rule__ExpresionReferenciada__IdAssignment_2_1
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
    // InternalBlockchain.g:3804:1: rule__ExpresionRelacional__Group__0 : rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 ;
    public final void rule__ExpresionRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3808:1: ( rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1 )
            // InternalBlockchain.g:3809:2: rule__ExpresionRelacional__Group__0__Impl rule__ExpresionRelacional__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBlockchain.g:3816:1: rule__ExpresionRelacional__Group__0__Impl : ( 'ExpRel' ) ;
    public final void rule__ExpresionRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3820:1: ( ( 'ExpRel' ) )
            // InternalBlockchain.g:3821:1: ( 'ExpRel' )
            {
            // InternalBlockchain.g:3821:1: ( 'ExpRel' )
            // InternalBlockchain.g:3822:2: 'ExpRel'
            {
             before(grammarAccess.getExpresionRelacionalAccess().getExpRelKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBlockchain.g:3831:1: rule__ExpresionRelacional__Group__1 : rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 ;
    public final void rule__ExpresionRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3835:1: ( rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2 )
            // InternalBlockchain.g:3836:2: rule__ExpresionRelacional__Group__1__Impl rule__ExpresionRelacional__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalBlockchain.g:3843:1: rule__ExpresionRelacional__Group__1__Impl : ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) ;
    public final void rule__ExpresionRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3847:1: ( ( ( rule__ExpresionRelacional__IzqAssignment_1 ) ) )
            // InternalBlockchain.g:3848:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            {
            // InternalBlockchain.g:3848:1: ( ( rule__ExpresionRelacional__IzqAssignment_1 ) )
            // InternalBlockchain.g:3849:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getIzqAssignment_1()); 
            // InternalBlockchain.g:3850:2: ( rule__ExpresionRelacional__IzqAssignment_1 )
            // InternalBlockchain.g:3850:3: rule__ExpresionRelacional__IzqAssignment_1
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
    // InternalBlockchain.g:3858:1: rule__ExpresionRelacional__Group__2 : rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 ;
    public final void rule__ExpresionRelacional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3862:1: ( rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3 )
            // InternalBlockchain.g:3863:2: rule__ExpresionRelacional__Group__2__Impl rule__ExpresionRelacional__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalBlockchain.g:3870:1: rule__ExpresionRelacional__Group__2__Impl : ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) ;
    public final void rule__ExpresionRelacional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3874:1: ( ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? ) )
            // InternalBlockchain.g:3875:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            {
            // InternalBlockchain.g:3875:1: ( ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )? )
            // InternalBlockchain.g:3876:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            {
             before(grammarAccess.getExpresionRelacionalAccess().getOperadorRelacionalAssignment_2()); 
            // InternalBlockchain.g:3877:2: ( rule__ExpresionRelacional__OperadorRelacionalAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==11) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBlockchain.g:3877:3: rule__ExpresionRelacional__OperadorRelacionalAssignment_2
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
    // InternalBlockchain.g:3885:1: rule__ExpresionRelacional__Group__3 : rule__ExpresionRelacional__Group__3__Impl ;
    public final void rule__ExpresionRelacional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3889:1: ( rule__ExpresionRelacional__Group__3__Impl )
            // InternalBlockchain.g:3890:2: rule__ExpresionRelacional__Group__3__Impl
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
    // InternalBlockchain.g:3896:1: rule__ExpresionRelacional__Group__3__Impl : ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) ;
    public final void rule__ExpresionRelacional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3900:1: ( ( ( rule__ExpresionRelacional__DerAssignment_3 ) ) )
            // InternalBlockchain.g:3901:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            {
            // InternalBlockchain.g:3901:1: ( ( rule__ExpresionRelacional__DerAssignment_3 ) )
            // InternalBlockchain.g:3902:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            {
             before(grammarAccess.getExpresionRelacionalAccess().getDerAssignment_3()); 
            // InternalBlockchain.g:3903:2: ( rule__ExpresionRelacional__DerAssignment_3 )
            // InternalBlockchain.g:3903:3: rule__ExpresionRelacional__DerAssignment_3
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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalBlockchain.g:3912:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3916:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBlockchain.g:3917:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:3924:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3928:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:3929:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:3929:1: ( ( '-' )? )
            // InternalBlockchain.g:3930:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:3931:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBlockchain.g:3931:3: '-'
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
    // InternalBlockchain.g:3939:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3943:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBlockchain.g:3944:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalBlockchain.g:3951:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3955:1: ( ( ( RULE_INT )? ) )
            // InternalBlockchain.g:3956:1: ( ( RULE_INT )? )
            {
            // InternalBlockchain.g:3956:1: ( ( RULE_INT )? )
            // InternalBlockchain.g:3957:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBlockchain.g:3958:2: ( RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBlockchain.g:3958:3: RULE_INT
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
    // InternalBlockchain.g:3966:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3970:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBlockchain.g:3971:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalBlockchain.g:3978:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3982:1: ( ( '.' ) )
            // InternalBlockchain.g:3983:1: ( '.' )
            {
            // InternalBlockchain.g:3983:1: ( '.' )
            // InternalBlockchain.g:3984:2: '.'
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
    // InternalBlockchain.g:3993:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:3997:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBlockchain.g:3998:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalBlockchain.g:4005:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4009:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4010:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4010:1: ( RULE_INT )
            // InternalBlockchain.g:4011:2: RULE_INT
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
    // InternalBlockchain.g:4020:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4024:1: ( rule__EDouble__Group__4__Impl )
            // InternalBlockchain.g:4025:2: rule__EDouble__Group__4__Impl
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
    // InternalBlockchain.g:4031:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4035:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBlockchain.g:4036:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBlockchain.g:4036:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBlockchain.g:4037:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBlockchain.g:4038:2: ( rule__EDouble__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=14 && LA49_0<=15)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBlockchain.g:4038:3: rule__EDouble__Group_4__0
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
    // InternalBlockchain.g:4047:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4051:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBlockchain.g:4052:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4059:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4063:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBlockchain.g:4064:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBlockchain.g:4064:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBlockchain.g:4065:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBlockchain.g:4066:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBlockchain.g:4066:3: rule__EDouble__Alternatives_4_0
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
    // InternalBlockchain.g:4074:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4078:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBlockchain.g:4079:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4086:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4090:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4091:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4091:1: ( ( '-' )? )
            // InternalBlockchain.g:4092:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBlockchain.g:4093:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==25) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBlockchain.g:4093:3: '-'
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
    // InternalBlockchain.g:4101:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4105:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBlockchain.g:4106:2: rule__EDouble__Group_4__2__Impl
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
    // InternalBlockchain.g:4112:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4116:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4117:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4117:1: ( RULE_INT )
            // InternalBlockchain.g:4118:2: RULE_INT
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
    // InternalBlockchain.g:4128:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4132:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBlockchain.g:4133:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalBlockchain.g:4140:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4144:1: ( ( ( '-' )? ) )
            // InternalBlockchain.g:4145:1: ( ( '-' )? )
            {
            // InternalBlockchain.g:4145:1: ( ( '-' )? )
            // InternalBlockchain.g:4146:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBlockchain.g:4147:2: ( '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBlockchain.g:4147:3: '-'
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
    // InternalBlockchain.g:4155:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4159:1: ( rule__EInt__Group__1__Impl )
            // InternalBlockchain.g:4160:2: rule__EInt__Group__1__Impl
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
    // InternalBlockchain.g:4166:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4170:1: ( ( RULE_INT ) )
            // InternalBlockchain.g:4171:1: ( RULE_INT )
            {
            // InternalBlockchain.g:4171:1: ( RULE_INT )
            // InternalBlockchain.g:4172:2: RULE_INT
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
    // InternalBlockchain.g:4182:1: rule__Primitivo__Group__0 : rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 ;
    public final void rule__Primitivo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4186:1: ( rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1 )
            // InternalBlockchain.g:4187:2: rule__Primitivo__Group__0__Impl rule__Primitivo__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalBlockchain.g:4194:1: rule__Primitivo__Group__0__Impl : ( () ) ;
    public final void rule__Primitivo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4198:1: ( ( () ) )
            // InternalBlockchain.g:4199:1: ( () )
            {
            // InternalBlockchain.g:4199:1: ( () )
            // InternalBlockchain.g:4200:2: ()
            {
             before(grammarAccess.getPrimitivoAccess().getPrimitivoAction_0()); 
            // InternalBlockchain.g:4201:2: ()
            // InternalBlockchain.g:4201:3: 
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
    // InternalBlockchain.g:4209:1: rule__Primitivo__Group__1 : rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 ;
    public final void rule__Primitivo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4213:1: ( rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2 )
            // InternalBlockchain.g:4214:2: rule__Primitivo__Group__1__Impl rule__Primitivo__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalBlockchain.g:4221:1: rule__Primitivo__Group__1__Impl : ( ( rule__Primitivo__TipoAssignment_1 )? ) ;
    public final void rule__Primitivo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4225:1: ( ( ( rule__Primitivo__TipoAssignment_1 )? ) )
            // InternalBlockchain.g:4226:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            {
            // InternalBlockchain.g:4226:1: ( ( rule__Primitivo__TipoAssignment_1 )? )
            // InternalBlockchain.g:4227:2: ( rule__Primitivo__TipoAssignment_1 )?
            {
             before(grammarAccess.getPrimitivoAccess().getTipoAssignment_1()); 
            // InternalBlockchain.g:4228:2: ( rule__Primitivo__TipoAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=31 && LA52_0<=34)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBlockchain.g:4228:3: rule__Primitivo__TipoAssignment_1
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
    // InternalBlockchain.g:4236:1: rule__Primitivo__Group__2 : rule__Primitivo__Group__2__Impl ;
    public final void rule__Primitivo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4240:1: ( rule__Primitivo__Group__2__Impl )
            // InternalBlockchain.g:4241:2: rule__Primitivo__Group__2__Impl
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
    // InternalBlockchain.g:4247:1: rule__Primitivo__Group__2__Impl : ( ( rule__Primitivo__NameAssignment_2 ) ) ;
    public final void rule__Primitivo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4251:1: ( ( ( rule__Primitivo__NameAssignment_2 ) ) )
            // InternalBlockchain.g:4252:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            {
            // InternalBlockchain.g:4252:1: ( ( rule__Primitivo__NameAssignment_2 ) )
            // InternalBlockchain.g:4253:2: ( rule__Primitivo__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitivoAccess().getNameAssignment_2()); 
            // InternalBlockchain.g:4254:2: ( rule__Primitivo__NameAssignment_2 )
            // InternalBlockchain.g:4254:3: rule__Primitivo__NameAssignment_2
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
    // InternalBlockchain.g:4263:1: rule__Mapa__Group__0 : rule__Mapa__Group__0__Impl rule__Mapa__Group__1 ;
    public final void rule__Mapa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4267:1: ( rule__Mapa__Group__0__Impl rule__Mapa__Group__1 )
            // InternalBlockchain.g:4268:2: rule__Mapa__Group__0__Impl rule__Mapa__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalBlockchain.g:4275:1: rule__Mapa__Group__0__Impl : ( 'Map' ) ;
    public final void rule__Mapa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4279:1: ( ( 'Map' ) )
            // InternalBlockchain.g:4280:1: ( 'Map' )
            {
            // InternalBlockchain.g:4280:1: ( 'Map' )
            // InternalBlockchain.g:4281:2: 'Map'
            {
             before(grammarAccess.getMapaAccess().getMapKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalBlockchain.g:4290:1: rule__Mapa__Group__1 : rule__Mapa__Group__1__Impl rule__Mapa__Group__2 ;
    public final void rule__Mapa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4294:1: ( rule__Mapa__Group__1__Impl rule__Mapa__Group__2 )
            // InternalBlockchain.g:4295:2: rule__Mapa__Group__1__Impl rule__Mapa__Group__2
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
    // InternalBlockchain.g:4302:1: rule__Mapa__Group__1__Impl : ( '<' ) ;
    public final void rule__Mapa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4306:1: ( ( '<' ) )
            // InternalBlockchain.g:4307:1: ( '<' )
            {
            // InternalBlockchain.g:4307:1: ( '<' )
            // InternalBlockchain.g:4308:2: '<'
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
    // InternalBlockchain.g:4317:1: rule__Mapa__Group__2 : rule__Mapa__Group__2__Impl rule__Mapa__Group__3 ;
    public final void rule__Mapa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4321:1: ( rule__Mapa__Group__2__Impl rule__Mapa__Group__3 )
            // InternalBlockchain.g:4322:2: rule__Mapa__Group__2__Impl rule__Mapa__Group__3
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
    // InternalBlockchain.g:4329:1: rule__Mapa__Group__2__Impl : ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) ;
    public final void rule__Mapa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4333:1: ( ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) ) )
            // InternalBlockchain.g:4334:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            {
            // InternalBlockchain.g:4334:1: ( ( rule__Mapa__TipoDatoKeyAssignment_2 ) )
            // InternalBlockchain.g:4335:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyAssignment_2()); 
            // InternalBlockchain.g:4336:2: ( rule__Mapa__TipoDatoKeyAssignment_2 )
            // InternalBlockchain.g:4336:3: rule__Mapa__TipoDatoKeyAssignment_2
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
    // InternalBlockchain.g:4344:1: rule__Mapa__Group__3 : rule__Mapa__Group__3__Impl rule__Mapa__Group__4 ;
    public final void rule__Mapa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4348:1: ( rule__Mapa__Group__3__Impl rule__Mapa__Group__4 )
            // InternalBlockchain.g:4349:2: rule__Mapa__Group__3__Impl rule__Mapa__Group__4
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
    // InternalBlockchain.g:4356:1: rule__Mapa__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4360:1: ( ( ',' ) )
            // InternalBlockchain.g:4361:1: ( ',' )
            {
            // InternalBlockchain.g:4361:1: ( ',' )
            // InternalBlockchain.g:4362:2: ','
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
    // InternalBlockchain.g:4371:1: rule__Mapa__Group__4 : rule__Mapa__Group__4__Impl rule__Mapa__Group__5 ;
    public final void rule__Mapa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4375:1: ( rule__Mapa__Group__4__Impl rule__Mapa__Group__5 )
            // InternalBlockchain.g:4376:2: rule__Mapa__Group__4__Impl rule__Mapa__Group__5
            {
            pushFollow(FOLLOW_52);
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
    // InternalBlockchain.g:4383:1: rule__Mapa__Group__4__Impl : ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) ;
    public final void rule__Mapa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4387:1: ( ( ( rule__Mapa__TipoDatoValueAssignment_4 ) ) )
            // InternalBlockchain.g:4388:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            {
            // InternalBlockchain.g:4388:1: ( ( rule__Mapa__TipoDatoValueAssignment_4 ) )
            // InternalBlockchain.g:4389:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueAssignment_4()); 
            // InternalBlockchain.g:4390:2: ( rule__Mapa__TipoDatoValueAssignment_4 )
            // InternalBlockchain.g:4390:3: rule__Mapa__TipoDatoValueAssignment_4
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
    // InternalBlockchain.g:4398:1: rule__Mapa__Group__5 : rule__Mapa__Group__5__Impl rule__Mapa__Group__6 ;
    public final void rule__Mapa__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4402:1: ( rule__Mapa__Group__5__Impl rule__Mapa__Group__6 )
            // InternalBlockchain.g:4403:2: rule__Mapa__Group__5__Impl rule__Mapa__Group__6
            {
            pushFollow(FOLLOW_53);
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
    // InternalBlockchain.g:4410:1: rule__Mapa__Group__5__Impl : ( '>' ) ;
    public final void rule__Mapa__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4414:1: ( ( '>' ) )
            // InternalBlockchain.g:4415:1: ( '>' )
            {
            // InternalBlockchain.g:4415:1: ( '>' )
            // InternalBlockchain.g:4416:2: '>'
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
    // InternalBlockchain.g:4425:1: rule__Mapa__Group__6 : rule__Mapa__Group__6__Impl rule__Mapa__Group__7 ;
    public final void rule__Mapa__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4429:1: ( rule__Mapa__Group__6__Impl rule__Mapa__Group__7 )
            // InternalBlockchain.g:4430:2: rule__Mapa__Group__6__Impl rule__Mapa__Group__7
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
    // InternalBlockchain.g:4437:1: rule__Mapa__Group__6__Impl : ( ':' ) ;
    public final void rule__Mapa__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4441:1: ( ( ':' ) )
            // InternalBlockchain.g:4442:1: ( ':' )
            {
            // InternalBlockchain.g:4442:1: ( ':' )
            // InternalBlockchain.g:4443:2: ':'
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
    // InternalBlockchain.g:4452:1: rule__Mapa__Group__7 : rule__Mapa__Group__7__Impl ;
    public final void rule__Mapa__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4456:1: ( rule__Mapa__Group__7__Impl )
            // InternalBlockchain.g:4457:2: rule__Mapa__Group__7__Impl
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
    // InternalBlockchain.g:4463:1: rule__Mapa__Group__7__Impl : ( ( rule__Mapa__NameAssignment_7 ) ) ;
    public final void rule__Mapa__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4467:1: ( ( ( rule__Mapa__NameAssignment_7 ) ) )
            // InternalBlockchain.g:4468:1: ( ( rule__Mapa__NameAssignment_7 ) )
            {
            // InternalBlockchain.g:4468:1: ( ( rule__Mapa__NameAssignment_7 ) )
            // InternalBlockchain.g:4469:2: ( rule__Mapa__NameAssignment_7 )
            {
             before(grammarAccess.getMapaAccess().getNameAssignment_7()); 
            // InternalBlockchain.g:4470:2: ( rule__Mapa__NameAssignment_7 )
            // InternalBlockchain.g:4470:3: rule__Mapa__NameAssignment_7
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
    // InternalBlockchain.g:4479:1: rule__Aplicacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Aplicacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4483:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4484:2: ( ruleEString )
            {
            // InternalBlockchain.g:4484:2: ( ruleEString )
            // InternalBlockchain.g:4485:3: ruleEString
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
    // InternalBlockchain.g:4494:1: rule__Aplicacion__SmartcontractAssignment_4_0 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4498:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4499:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4499:2: ( ruleSmartContract )
            // InternalBlockchain.g:4500:3: ruleSmartContract
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
    // InternalBlockchain.g:4509:1: rule__Aplicacion__SmartcontractAssignment_4_1 : ( ruleSmartContract ) ;
    public final void rule__Aplicacion__SmartcontractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4513:1: ( ( ruleSmartContract ) )
            // InternalBlockchain.g:4514:2: ( ruleSmartContract )
            {
            // InternalBlockchain.g:4514:2: ( ruleSmartContract )
            // InternalBlockchain.g:4515:3: ruleSmartContract
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
    // InternalBlockchain.g:4524:1: rule__Aplicacion__TipodatoAssignment_5_1 : ( ruleTipoDato ) ;
    public final void rule__Aplicacion__TipodatoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4528:1: ( ( ruleTipoDato ) )
            // InternalBlockchain.g:4529:2: ( ruleTipoDato )
            {
            // InternalBlockchain.g:4529:2: ( ruleTipoDato )
            // InternalBlockchain.g:4530:3: ruleTipoDato
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
    // InternalBlockchain.g:4539:1: rule__SmartContract__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4543:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4544:2: ( ruleEString )
            {
            // InternalBlockchain.g:4544:2: ( ruleEString )
            // InternalBlockchain.g:4545:3: ruleEString
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
    // InternalBlockchain.g:4554:1: rule__SmartContract__EntidadesAssignment_3_0 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4558:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4559:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4559:2: ( ruleEntidad )
            // InternalBlockchain.g:4560:3: ruleEntidad
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
    // InternalBlockchain.g:4569:1: rule__SmartContract__EntidadesAssignment_3_1 : ( ruleEntidad ) ;
    public final void rule__SmartContract__EntidadesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4573:1: ( ( ruleEntidad ) )
            // InternalBlockchain.g:4574:2: ( ruleEntidad )
            {
            // InternalBlockchain.g:4574:2: ( ruleEntidad )
            // InternalBlockchain.g:4575:3: ruleEntidad
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
    // InternalBlockchain.g:4584:1: rule__SmartContract__EstadoAssignment_4_0 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4588:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4589:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4589:2: ( ruleEstado )
            // InternalBlockchain.g:4590:3: ruleEstado
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
    // InternalBlockchain.g:4599:1: rule__SmartContract__EstadoAssignment_4_1 : ( ruleEstado ) ;
    public final void rule__SmartContract__EstadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4603:1: ( ( ruleEstado ) )
            // InternalBlockchain.g:4604:2: ( ruleEstado )
            {
            // InternalBlockchain.g:4604:2: ( ruleEstado )
            // InternalBlockchain.g:4605:3: ruleEstado
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
    // InternalBlockchain.g:4614:1: rule__SmartContract__OperacionesAssignment_5_0 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4618:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4619:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4619:2: ( ruleOperacion )
            // InternalBlockchain.g:4620:3: ruleOperacion
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
    // InternalBlockchain.g:4629:1: rule__SmartContract__OperacionesAssignment_5_1 : ( ruleOperacion ) ;
    public final void rule__SmartContract__OperacionesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4633:1: ( ( ruleOperacion ) )
            // InternalBlockchain.g:4634:2: ( ruleOperacion )
            {
            // InternalBlockchain.g:4634:2: ( ruleOperacion )
            // InternalBlockchain.g:4635:3: ruleOperacion
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
    // InternalBlockchain.g:4644:1: rule__Entidad__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4648:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4649:2: ( ruleEString )
            {
            // InternalBlockchain.g:4649:2: ( ruleEString )
            // InternalBlockchain.g:4650:3: ruleEString
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
    // InternalBlockchain.g:4659:1: rule__Entidad__AtributosAssignment_4_0 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4663:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4664:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4664:2: ( ruleAtributo )
            // InternalBlockchain.g:4665:3: ruleAtributo
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
    // InternalBlockchain.g:4674:1: rule__Entidad__AtributosAssignment_4_1 : ( ruleAtributo ) ;
    public final void rule__Entidad__AtributosAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4678:1: ( ( ruleAtributo ) )
            // InternalBlockchain.g:4679:2: ( ruleAtributo )
            {
            // InternalBlockchain.g:4679:2: ( ruleAtributo )
            // InternalBlockchain.g:4680:3: ruleAtributo
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
    // InternalBlockchain.g:4689:1: rule__Operacion__EsUserDefinedAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Operacion__EsUserDefinedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4693:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:4694:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:4694:2: ( ruleEBoolean )
            // InternalBlockchain.g:4695:3: ruleEBoolean
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
    // InternalBlockchain.g:4704:1: rule__Operacion__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4708:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4709:2: ( ruleEString )
            {
            // InternalBlockchain.g:4709:2: ( ruleEString )
            // InternalBlockchain.g:4710:3: ruleEString
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
    // InternalBlockchain.g:4719:1: rule__Operacion__ParametrosAssignment_4_0 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4723:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:4724:2: ( ruleParametro )
            {
            // InternalBlockchain.g:4724:2: ( ruleParametro )
            // InternalBlockchain.g:4725:3: ruleParametro
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
    // InternalBlockchain.g:4734:1: rule__Operacion__ParametrosAssignment_4_1_1 : ( ruleParametro ) ;
    public final void rule__Operacion__ParametrosAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4738:1: ( ( ruleParametro ) )
            // InternalBlockchain.g:4739:2: ( ruleParametro )
            {
            // InternalBlockchain.g:4739:2: ( ruleParametro )
            // InternalBlockchain.g:4740:3: ruleParametro
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
    // InternalBlockchain.g:4749:1: rule__Operacion__RetornoAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Operacion__RetornoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4753:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4754:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4754:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4755:3: ( ruleEString )
            {
             before(grammarAccess.getOperacionAccess().getRetornoTipoDatoCrossReference_6_1_0()); 
            // InternalBlockchain.g:4756:3: ( ruleEString )
            // InternalBlockchain.g:4757:4: ruleEString
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


    // $ANTLR start "rule__Operacion__LineasAssignment_10"
    // InternalBlockchain.g:4768:1: rule__Operacion__LineasAssignment_10 : ( ruleLinea ) ;
    public final void rule__Operacion__LineasAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4772:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:4773:2: ( ruleLinea )
            {
            // InternalBlockchain.g:4773:2: ( ruleLinea )
            // InternalBlockchain.g:4774:3: ruleLinea
            {
             before(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getOperacionAccess().getLineasLineaParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Operacion__LineasAssignment_10"


    // $ANTLR start "rule__Estado__TipodatoAssignment_1"
    // InternalBlockchain.g:4783:1: rule__Estado__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Estado__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4787:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4788:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4788:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4789:3: ( ruleEString )
            {
             before(grammarAccess.getEstadoAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:4790:3: ( ruleEString )
            // InternalBlockchain.g:4791:4: ruleEString
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
    // InternalBlockchain.g:4802:1: rule__Estado__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Estado__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4806:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4807:2: ( ruleEString )
            {
            // InternalBlockchain.g:4807:2: ( ruleEString )
            // InternalBlockchain.g:4808:3: ruleEString
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
    // InternalBlockchain.g:4817:1: rule__Atributo__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Atributo__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4821:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4822:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4822:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4823:3: ( ruleEString )
            {
             before(grammarAccess.getAtributoAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:4824:3: ( ruleEString )
            // InternalBlockchain.g:4825:4: ruleEString
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


    // $ANTLR start "rule__Atributo__NameAssignment_1"
    // InternalBlockchain.g:4836:1: rule__Atributo__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4840:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4841:2: ( ruleEString )
            {
            // InternalBlockchain.g:4841:2: ( ruleEString )
            // InternalBlockchain.g:4842:3: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Atributo__NameAssignment_1"


    // $ANTLR start "rule__Parametro__TipodatoAssignment_0"
    // InternalBlockchain.g:4851:1: rule__Parametro__TipodatoAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parametro__TipodatoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4855:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4856:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4856:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4857:3: ( ruleEString )
            {
             before(grammarAccess.getParametroAccess().getTipodatoTipoDatoCrossReference_0_0()); 
            // InternalBlockchain.g:4858:3: ( ruleEString )
            // InternalBlockchain.g:4859:4: ruleEString
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
    // InternalBlockchain.g:4870:1: rule__Parametro__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parametro__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4874:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4875:2: ( ruleEString )
            {
            // InternalBlockchain.g:4875:2: ( ruleEString )
            // InternalBlockchain.g:4876:3: ruleEString
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
    // InternalBlockchain.g:4885:1: rule__ExpresionLogica__IzqAssignment_2 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__IzqAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4889:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4890:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4890:2: ( ruleExpresion )
            // InternalBlockchain.g:4891:3: ruleExpresion
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
    // InternalBlockchain.g:4900:1: rule__ExpresionLogica__OperadorAssignment_4 : ( ruleOperadorLogico ) ;
    public final void rule__ExpresionLogica__OperadorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4904:1: ( ( ruleOperadorLogico ) )
            // InternalBlockchain.g:4905:2: ( ruleOperadorLogico )
            {
            // InternalBlockchain.g:4905:2: ( ruleOperadorLogico )
            // InternalBlockchain.g:4906:3: ruleOperadorLogico
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
    // InternalBlockchain.g:4915:1: rule__ExpresionLogica__DerAssignment_6 : ( ruleExpresion ) ;
    public final void rule__ExpresionLogica__DerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4919:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4920:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4920:2: ( ruleExpresion )
            // InternalBlockchain.g:4921:3: ruleExpresion
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
    // InternalBlockchain.g:4930:1: rule__ExpresionAritmetica__IzqAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__IzqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4934:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4935:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4935:2: ( ruleExpresion )
            // InternalBlockchain.g:4936:3: ruleExpresion
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
    // InternalBlockchain.g:4945:1: rule__ExpresionAritmetica__OperadorAssignment_5 : ( ruleOperador ) ;
    public final void rule__ExpresionAritmetica__OperadorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4949:1: ( ( ruleOperador ) )
            // InternalBlockchain.g:4950:2: ( ruleOperador )
            {
            // InternalBlockchain.g:4950:2: ( ruleOperador )
            // InternalBlockchain.g:4951:3: ruleOperador
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
    // InternalBlockchain.g:4960:1: rule__ExpresionAritmetica__DerAssignment_7 : ( ruleExpresion ) ;
    public final void rule__ExpresionAritmetica__DerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4964:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:4965:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:4965:2: ( ruleExpresion )
            // InternalBlockchain.g:4966:3: ruleExpresion
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
    // InternalBlockchain.g:4975:1: rule__Variable__TipodatoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TipodatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4979:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:4980:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:4980:2: ( ( ruleEString ) )
            // InternalBlockchain.g:4981:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTipodatoTipoDatoCrossReference_1_0()); 
            // InternalBlockchain.g:4982:3: ( ruleEString )
            // InternalBlockchain.g:4983:4: ruleEString
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
    // InternalBlockchain.g:4994:1: rule__Variable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:4998:1: ( ( ruleEString ) )
            // InternalBlockchain.g:4999:2: ( ruleEString )
            {
            // InternalBlockchain.g:4999:2: ( ruleEString )
            // InternalBlockchain.g:5000:3: ruleEString
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


    // $ANTLR start "rule__Condicional__ExpresionlogicaAssignment_2"
    // InternalBlockchain.g:5009:1: rule__Condicional__ExpresionlogicaAssignment_2 : ( ruleExpresionLogica ) ;
    public final void rule__Condicional__ExpresionlogicaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5013:1: ( ( ruleExpresionLogica ) )
            // InternalBlockchain.g:5014:2: ( ruleExpresionLogica )
            {
            // InternalBlockchain.g:5014:2: ( ruleExpresionLogica )
            // InternalBlockchain.g:5015:3: ruleExpresionLogica
            {
             before(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpresionLogica();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getExpresionlogicaExpresionLogicaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Condicional__ExpresionlogicaAssignment_2"


    // $ANTLR start "rule__Condicional__ValidadorAssignment_4"
    // InternalBlockchain.g:5024:1: rule__Condicional__ValidadorAssignment_4 : ( ruleLinea ) ;
    public final void rule__Condicional__ValidadorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5028:1: ( ( ruleLinea ) )
            // InternalBlockchain.g:5029:2: ( ruleLinea )
            {
            // InternalBlockchain.g:5029:2: ( ruleLinea )
            // InternalBlockchain.g:5030:3: ruleLinea
            {
             before(grammarAccess.getCondicionalAccess().getValidadorLineaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLinea();

            state._fsp--;

             after(grammarAccess.getCondicionalAccess().getValidadorLineaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Condicional__ValidadorAssignment_4"


    // $ANTLR start "rule__ExpresionNumerica__ValueAssignment_2"
    // InternalBlockchain.g:5039:1: rule__ExpresionNumerica__ValueAssignment_2 : ( ruleEDouble ) ;
    public final void rule__ExpresionNumerica__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5043:1: ( ( ruleEDouble ) )
            // InternalBlockchain.g:5044:2: ( ruleEDouble )
            {
            // InternalBlockchain.g:5044:2: ( ruleEDouble )
            // InternalBlockchain.g:5045:3: ruleEDouble
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
    // InternalBlockchain.g:5054:1: rule__ExpresionTexto__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__ExpresionTexto__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5058:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5059:2: ( ruleEString )
            {
            // InternalBlockchain.g:5059:2: ( ruleEString )
            // InternalBlockchain.g:5060:3: ruleEString
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
    // InternalBlockchain.g:5069:1: rule__ExpresionBoolean__ValueAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__ExpresionBoolean__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5073:1: ( ( ruleEBoolean ) )
            // InternalBlockchain.g:5074:2: ( ruleEBoolean )
            {
            // InternalBlockchain.g:5074:2: ( ruleEBoolean )
            // InternalBlockchain.g:5075:3: ruleEBoolean
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
    // InternalBlockchain.g:5084:1: rule__ExpresionReferenciada__IdAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__ExpresionReferenciada__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5088:1: ( ( ruleEInt ) )
            // InternalBlockchain.g:5089:2: ( ruleEInt )
            {
            // InternalBlockchain.g:5089:2: ( ruleEInt )
            // InternalBlockchain.g:5090:3: ruleEInt
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
    // InternalBlockchain.g:5099:1: rule__ExpresionReferenciada__ReferenciaAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ExpresionReferenciada__ReferenciaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5103:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5104:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5104:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5105:3: ( ruleEString )
            {
             before(grammarAccess.getExpresionReferenciadaAccess().getReferenciaNamedElementCrossReference_3_0()); 
            // InternalBlockchain.g:5106:3: ( ruleEString )
            // InternalBlockchain.g:5107:4: ruleEString
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
    // InternalBlockchain.g:5118:1: rule__ExpresionRelacional__IzqAssignment_1 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__IzqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5122:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5123:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5123:2: ( ruleExpresion )
            // InternalBlockchain.g:5124:3: ruleExpresion
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
    // InternalBlockchain.g:5133:1: rule__ExpresionRelacional__OperadorRelacionalAssignment_2 : ( ruleOperadorRelacion ) ;
    public final void rule__ExpresionRelacional__OperadorRelacionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5137:1: ( ( ruleOperadorRelacion ) )
            // InternalBlockchain.g:5138:2: ( ruleOperadorRelacion )
            {
            // InternalBlockchain.g:5138:2: ( ruleOperadorRelacion )
            // InternalBlockchain.g:5139:3: ruleOperadorRelacion
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
    // InternalBlockchain.g:5148:1: rule__ExpresionRelacional__DerAssignment_3 : ( ruleExpresion ) ;
    public final void rule__ExpresionRelacional__DerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5152:1: ( ( ruleExpresion ) )
            // InternalBlockchain.g:5153:2: ( ruleExpresion )
            {
            // InternalBlockchain.g:5153:2: ( ruleExpresion )
            // InternalBlockchain.g:5154:3: ruleExpresion
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


    // $ANTLR start "rule__Primitivo__TipoAssignment_1"
    // InternalBlockchain.g:5163:1: rule__Primitivo__TipoAssignment_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Primitivo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5167:1: ( ( ruleDatoPrimitivo ) )
            // InternalBlockchain.g:5168:2: ( ruleDatoPrimitivo )
            {
            // InternalBlockchain.g:5168:2: ( ruleDatoPrimitivo )
            // InternalBlockchain.g:5169:3: ruleDatoPrimitivo
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
    // InternalBlockchain.g:5178:1: rule__Primitivo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitivo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5182:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5183:2: ( ruleEString )
            {
            // InternalBlockchain.g:5183:2: ( ruleEString )
            // InternalBlockchain.g:5184:3: ruleEString
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
    // InternalBlockchain.g:5193:1: rule__Mapa__TipoDatoKeyAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5197:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5198:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5198:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5199:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoKeyTipoDatoCrossReference_2_0()); 
            // InternalBlockchain.g:5200:3: ( ruleEString )
            // InternalBlockchain.g:5201:4: ruleEString
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
    // InternalBlockchain.g:5212:1: rule__Mapa__TipoDatoValueAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Mapa__TipoDatoValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5216:1: ( ( ( ruleEString ) ) )
            // InternalBlockchain.g:5217:2: ( ( ruleEString ) )
            {
            // InternalBlockchain.g:5217:2: ( ( ruleEString ) )
            // InternalBlockchain.g:5218:3: ( ruleEString )
            {
             before(grammarAccess.getMapaAccess().getTipoDatoValueTipoDatoCrossReference_4_0()); 
            // InternalBlockchain.g:5219:3: ( ruleEString )
            // InternalBlockchain.g:5220:4: ruleEString
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
    // InternalBlockchain.g:5231:1: rule__Mapa__NameAssignment_7 : ( ruleEString ) ;
    public final void rule__Mapa__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlockchain.g:5235:1: ( ( ruleEString ) )
            // InternalBlockchain.g:5236:2: ( ruleEString )
            {
            // InternalBlockchain.g:5236:2: ( ruleEString )
            // InternalBlockchain.g:5237:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800010780000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001032000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x05FE1C2000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x05FE000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x05E6040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x05E60C0000FF0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x05E60C007F000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x05FE000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x05FE002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002000840L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x05E6000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x05E6000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000780000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000800000000000L});

}