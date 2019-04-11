/**
 * Whats App API
 * Whats App API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: irma.tabakis@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.InlineResponse200User;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse200 {
  
  @SerializedName("number_of_favorited_messages")
  private BigDecimal numberOfFavoritedMessages = null;
  @SerializedName("user")
  private InlineResponse200User user = null;

  /**
   * If currentUserId is null, the number of favorited messages will be the total number of favorited messages of the queried user. If currentUserId is not null, this value will be the number of favorited messages the currentUserId favorited of the user being queried.
   **/
  @ApiModelProperty(value = "If currentUserId is null, the number of favorited messages will be the total number of favorited messages of the queried user. If currentUserId is not null, this value will be the number of favorited messages the currentUserId favorited of the user being queried.")
  public BigDecimal getNumberOfFavoritedMessages() {
    return numberOfFavoritedMessages;
  }
  public void setNumberOfFavoritedMessages(BigDecimal numberOfFavoritedMessages) {
    this.numberOfFavoritedMessages = numberOfFavoritedMessages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse200User getUser() {
    return user;
  }
  public void setUser(InlineResponse200User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return (this.numberOfFavoritedMessages == null ? inlineResponse200.numberOfFavoritedMessages == null : this.numberOfFavoritedMessages.equals(inlineResponse200.numberOfFavoritedMessages)) &&
        (this.user == null ? inlineResponse200.user == null : this.user.equals(inlineResponse200.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.numberOfFavoritedMessages == null ? 0: this.numberOfFavoritedMessages.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("  numberOfFavoritedMessages: ").append(numberOfFavoritedMessages).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}