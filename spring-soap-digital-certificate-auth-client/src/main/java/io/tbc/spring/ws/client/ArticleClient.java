package io.tbc.spring.ws.client;

import com.medium.article.GetArticleRequest;
import com.medium.article.GetArticleResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @author somnath.musib
 */
public class ArticleClient extends WebServiceGatewaySupport {

    public GetArticleResponse getArticle(int id){
        GetArticleRequest getArticleRequest = new GetArticleRequest();
        getArticleRequest.setId(id);
        //getWebServiceTemplate().marshalSendAndReceive(getArticleRequest);
        GetArticleResponse getArticleResponse =  (GetArticleResponse) getWebServiceTemplate().marshalSendAndReceive(getArticleRequest);
        return getArticleResponse;
    }
}
