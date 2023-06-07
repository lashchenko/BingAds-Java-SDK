
package com.microsoft.bingads.v13.customerbilling;

import java.util.concurrent.Future;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ICustomerBillingService", targetNamespace = "https://bingads.microsoft.com/Billing/v13")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICustomerBillingService {


    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.GetBillingDocumentsInfoResponse>
     */
    @WebMethod(operationName = "GetBillingDocumentsInfo", action = "GetBillingDocumentsInfo")
    public Response<GetBillingDocumentsInfoResponse> getBillingDocumentsInfoAsync(
        @WebParam(name = "GetBillingDocumentsInfoRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetBillingDocumentsInfoRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBillingDocumentsInfo", action = "GetBillingDocumentsInfo")
    public Future<?> getBillingDocumentsInfoAsync(
        @WebParam(name = "GetBillingDocumentsInfoRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetBillingDocumentsInfoRequest parameters,
        @WebParam(name = "GetBillingDocumentsInfoResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBillingDocumentsInfoResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.GetBillingDocumentsInfoResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiBatchFault_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "GetBillingDocumentsInfo", action = "GetBillingDocumentsInfo")
    @WebResult(name = "GetBillingDocumentsInfoResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public GetBillingDocumentsInfoResponse getBillingDocumentsInfo(
        @WebParam(name = "GetBillingDocumentsInfoRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetBillingDocumentsInfoRequest parameters)
        throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.GetBillingDocumentsResponse>
     */
    @WebMethod(operationName = "GetBillingDocuments", action = "GetBillingDocuments")
    public Response<GetBillingDocumentsResponse> getBillingDocumentsAsync(
        @WebParam(name = "GetBillingDocumentsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetBillingDocumentsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetBillingDocuments", action = "GetBillingDocuments")
    public Future<?> getBillingDocumentsAsync(
        @WebParam(name = "GetBillingDocumentsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetBillingDocumentsRequest parameters,
        @WebParam(name = "GetBillingDocumentsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBillingDocumentsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.GetBillingDocumentsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiBatchFault_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "GetBillingDocuments", action = "GetBillingDocuments")
    @WebResult(name = "GetBillingDocumentsResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public GetBillingDocumentsResponse getBillingDocuments(
        @WebParam(name = "GetBillingDocumentsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetBillingDocumentsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiBatchFault_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.AddInsertionOrderResponse>
     */
    @WebMethod(operationName = "AddInsertionOrder", action = "AddInsertionOrder")
    public Response<AddInsertionOrderResponse> addInsertionOrderAsync(
        @WebParam(name = "AddInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        AddInsertionOrderRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddInsertionOrder", action = "AddInsertionOrder")
    public Future<?> addInsertionOrderAsync(
        @WebParam(name = "AddInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        AddInsertionOrderRequest parameters,
        @WebParam(name = "AddInsertionOrderResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddInsertionOrderResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.AddInsertionOrderResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "AddInsertionOrder", action = "AddInsertionOrder")
    @WebResult(name = "AddInsertionOrderResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public AddInsertionOrderResponse addInsertionOrder(
        @WebParam(name = "AddInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        AddInsertionOrderRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.UpdateInsertionOrderResponse>
     */
    @WebMethod(operationName = "UpdateInsertionOrder", action = "UpdateInsertionOrder")
    public Response<UpdateInsertionOrderResponse> updateInsertionOrderAsync(
        @WebParam(name = "UpdateInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        UpdateInsertionOrderRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "UpdateInsertionOrder", action = "UpdateInsertionOrder")
    public Future<?> updateInsertionOrderAsync(
        @WebParam(name = "UpdateInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        UpdateInsertionOrderRequest parameters,
        @WebParam(name = "UpdateInsertionOrderResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<UpdateInsertionOrderResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.UpdateInsertionOrderResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "UpdateInsertionOrder", action = "UpdateInsertionOrder")
    @WebResult(name = "UpdateInsertionOrderResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public UpdateInsertionOrderResponse updateInsertionOrder(
        @WebParam(name = "UpdateInsertionOrderRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        UpdateInsertionOrderRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.SearchInsertionOrdersResponse>
     */
    @WebMethod(operationName = "SearchInsertionOrders", action = "SearchInsertionOrders")
    public Response<SearchInsertionOrdersResponse> searchInsertionOrdersAsync(
        @WebParam(name = "SearchInsertionOrdersRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        SearchInsertionOrdersRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "SearchInsertionOrders", action = "SearchInsertionOrders")
    public Future<?> searchInsertionOrdersAsync(
        @WebParam(name = "SearchInsertionOrdersRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        SearchInsertionOrdersRequest parameters,
        @WebParam(name = "SearchInsertionOrdersResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SearchInsertionOrdersResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.SearchInsertionOrdersResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "SearchInsertionOrders", action = "SearchInsertionOrders")
    @WebResult(name = "SearchInsertionOrdersResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public SearchInsertionOrdersResponse searchInsertionOrders(
        @WebParam(name = "SearchInsertionOrdersRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        SearchInsertionOrdersRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.GetAccountMonthlySpendResponse>
     */
    @WebMethod(operationName = "GetAccountMonthlySpend", action = "GetAccountMonthlySpend")
    public Response<GetAccountMonthlySpendResponse> getAccountMonthlySpendAsync(
        @WebParam(name = "GetAccountMonthlySpendRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetAccountMonthlySpendRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetAccountMonthlySpend", action = "GetAccountMonthlySpend")
    public Future<?> getAccountMonthlySpendAsync(
        @WebParam(name = "GetAccountMonthlySpendRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetAccountMonthlySpendRequest parameters,
        @WebParam(name = "GetAccountMonthlySpendResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetAccountMonthlySpendResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.GetAccountMonthlySpendResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "GetAccountMonthlySpend", action = "GetAccountMonthlySpend")
    @WebResult(name = "GetAccountMonthlySpendResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public GetAccountMonthlySpendResponse getAccountMonthlySpend(
        @WebParam(name = "GetAccountMonthlySpendRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        GetAccountMonthlySpendRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.DispatchCouponsResponse>
     */
    @WebMethod(operationName = "DispatchCoupons", action = "DispatchCoupons")
    public Response<DispatchCouponsResponse> dispatchCouponsAsync(
        @WebParam(name = "DispatchCouponsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        DispatchCouponsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DispatchCoupons", action = "DispatchCoupons")
    public Future<?> dispatchCouponsAsync(
        @WebParam(name = "DispatchCouponsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        DispatchCouponsRequest parameters,
        @WebParam(name = "DispatchCouponsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DispatchCouponsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.DispatchCouponsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "DispatchCoupons", action = "DispatchCoupons")
    @WebResult(name = "DispatchCouponsResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public DispatchCouponsResponse dispatchCoupons(
        @WebParam(name = "DispatchCouponsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        DispatchCouponsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.RedeemCouponResponse>
     */
    @WebMethod(operationName = "RedeemCoupon", action = "RedeemCoupon")
    public Response<RedeemCouponResponse> redeemCouponAsync(
        @WebParam(name = "RedeemCouponRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        RedeemCouponRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "RedeemCoupon", action = "RedeemCoupon")
    public Future<?> redeemCouponAsync(
        @WebParam(name = "RedeemCouponRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        RedeemCouponRequest parameters,
        @WebParam(name = "RedeemCouponResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<RedeemCouponResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.RedeemCouponResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "RedeemCoupon", action = "RedeemCoupon")
    @WebResult(name = "RedeemCouponResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public RedeemCouponResponse redeemCoupon(
        @WebParam(name = "RedeemCouponRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        RedeemCouponRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns jakarta.xml.ws.Response<com.microsoft.bingads.v13.customerbilling.SearchCouponsResponse>
     */
    @WebMethod(operationName = "SearchCoupons", action = "SearchCoupons")
    public Response<SearchCouponsResponse> searchCouponsAsync(
        @WebParam(name = "SearchCouponsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        SearchCouponsRequest parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "SearchCoupons", action = "SearchCoupons")
    public Future<?> searchCouponsAsync(
        @WebParam(name = "SearchCouponsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        SearchCouponsRequest parameters,
        @WebParam(name = "SearchCouponsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SearchCouponsResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.microsoft.bingads.v13.customerbilling.SearchCouponsResponse
     * @throws AdApiFaultDetail_Exception
     * @throws ApiFault_Exception
     */
    @WebMethod(operationName = "SearchCoupons", action = "SearchCoupons")
    @WebResult(name = "SearchCouponsResponse", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
    public SearchCouponsResponse searchCoupons(
        @WebParam(name = "SearchCouponsRequest", targetNamespace = "https://bingads.microsoft.com/Billing/v13", partName = "parameters")
        SearchCouponsRequest parameters)
        throws AdApiFaultDetail_Exception, ApiFault_Exception
    ;

}
