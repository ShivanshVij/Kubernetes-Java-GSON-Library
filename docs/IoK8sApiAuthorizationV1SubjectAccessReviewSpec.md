
# IoK8sApiAuthorizationV1SubjectAccessReviewSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**extra** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here. |  [optional]
**groups** | **List&lt;String&gt;** | Groups is the groups you&#39;re testing for. |  [optional]
**nonResourceAttributes** | [**IoK8sApiAuthorizationV1NonResourceAttributes**](IoK8sApiAuthorizationV1NonResourceAttributes.md) | NonResourceAttributes describes information for a non-resource access request |  [optional]
**resourceAttributes** | [**IoK8sApiAuthorizationV1ResourceAttributes**](IoK8sApiAuthorizationV1ResourceAttributes.md) | ResourceAuthorizationAttributes describes information for a resource access request |  [optional]
**uid** | **String** | UID information about the requesting user. |  [optional]
**user** | **String** | User is the user you&#39;re testing for. If you specify \&quot;User\&quot; but not \&quot;Groups\&quot;, then is it interpreted as \&quot;What if User were not a member of any groups |  [optional]



