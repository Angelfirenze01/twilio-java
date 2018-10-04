/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml;

import com.twilio.converter.Promoter;
import com.twilio.http.HttpMethod;
import com.twilio.twiml.voice.Connect;
import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.voice.Echo;
import com.twilio.twiml.voice.Enqueue;
import com.twilio.twiml.voice.Gather;
import com.twilio.twiml.voice.Hangup;
import com.twilio.twiml.voice.Leave;
import com.twilio.twiml.voice.Pause;
import com.twilio.twiml.voice.Play;
import com.twilio.twiml.voice.Queue;
import com.twilio.twiml.voice.Record;
import com.twilio.twiml.voice.Redirect;
import com.twilio.twiml.voice.Reject;
import com.twilio.twiml.voice.Say;
import com.twilio.twiml.voice.Sms;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.util.List;

/**
 * Test class for {@link VoiceResponse}
 */
public class VoiceResponseTest {
    @Test
    public void testEmptyElement() {
        VoiceResponse elem = new VoiceResponse.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        VoiceResponse elem = new VoiceResponse.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CResponse%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithExtraAttributes() {
        VoiceResponse elem = new VoiceResponse.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithChildren() {
        VoiceResponse.Builder builder = new VoiceResponse.Builder();

        builder.connect(new Connect.Builder().action(URI.create("https://example.com")).method(HttpMethod.GET).build());

        builder.dial(new Dial.Builder("number")
                    .action(URI.create("https://example.com"))
                    .method(HttpMethod.GET)
                    .timeout(1)
                    .hangupOnStar(true)
                    .timeLimit(1)
                    .callerId("caller_id")
                    .record(Dial.Record.DO_NOT_RECORD)
                    .trim(Dial.Trim.TRIM_SILENCE)
                    .recordingStatusCallback(URI.create("https://example.com"))
                    .recordingStatusCallbackMethod(HttpMethod.GET)
                    .recordingStatusCallbackEvents(Promoter.listOfOne(Dial.RecordingEvent.IN_PROGRESS))
                    .answerOnBridge(true)
                    .ringTone(Dial.RingTone.AT)
                    .build());

        builder.echo(new Echo.Builder().build());

        builder.enqueue(new Enqueue.Builder("name")
                    .action(URI.create("https://example.com"))
                    .method(HttpMethod.GET)
                    .waitUrl(URI.create("https://example.com"))
                    .waitUrlMethod(HttpMethod.GET)
                    .workflowSid("workflow_sid")
                    .build());

        builder.gather(new Gather.Builder()
                    .inputs(Promoter.listOfOne(Gather.Input.DTMF))
                    .action(URI.create("https://example.com"))
                    .method(HttpMethod.GET)
                    .timeout(1)
                    .speechTimeout("speech_timeout")
                    .maxSpeechTime(1)
                    .profanityFilter(true)
                    .finishOnKey("finish_on_key")
                    .numDigits(1)
                    .partialResultCallback(URI.create("https://example.com"))
                    .partialResultCallbackMethod(HttpMethod.GET)
                    .language(Gather.Language.AF_ZA)
                    .hints("hints")
                    .bargeIn(true)
                    .debug(true)
                    .build());

        builder.hangup(new Hangup.Builder().build());

        builder.leave(new Leave.Builder().build());

        builder.pause(new Pause.Builder().length(1).build());

        builder.play(new Play.Builder(URI.create("https://example.com")).loop(1).digits("digits").build());

        builder.queue(new Queue.Builder("name")
                    .url(URI.create("https://example.com"))
                    .method(HttpMethod.GET)
                    .reservationSid("reservation_sid")
                    .postWorkActivitySid("post_work_activity_sid")
                    .build());

        builder.record(new Record.Builder()
                    .action(URI.create("https://example.com"))
                    .method(HttpMethod.GET)
                    .timeout(1)
                    .finishOnKey("finish_on_key")
                    .maxLength(1)
                    .playBeep(true)
                    .trim(Record.Trim.TRIM_SILENCE)
                    .recordingStatusCallback(URI.create("https://example.com"))
                    .recordingStatusCallbackMethod(HttpMethod.GET)
                    .transcribe(true)
                    .transcribeCallback(URI.create("https://example.com"))
                    .build());

        builder.redirect(new Redirect.Builder(URI.create("https://example.com")).method(HttpMethod.GET).build());

        builder.reject(new Reject.Builder().reason(Reject.Reason.REJECTED).build());

        builder.say(new Say.Builder("message").voice(Say.Voice.MAN).loop(1).language(Say.Language.DA_DK).build());

        builder.sms(new Sms.Builder("message")
                    .to(new com.twilio.type.PhoneNumber("+15558675310"))
                    .from(new com.twilio.type.PhoneNumber("+15017122661"))
                    .action(URI.create("https://example.com"))
                    .method(HttpMethod.GET)
                    .statusCallback(URI.create("https://example.com"))
                    .build());

        VoiceResponse elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response>" +
                "<Connect action=\"https://example.com\" method=\"GET\"/>" +
                "<Dial action=\"https://example.com\" answerOnBridge=\"true\" callerId=\"caller_id\" hangupOnStar=\"true\" method=\"GET\" record=\"do-not-record\" recordingStatusCallback=\"https://example.com\" recordingStatusCallbackEvent=\"in-progress\" recordingStatusCallbackMethod=\"GET\" ringTone=\"at\" timeLimit=\"1\" timeout=\"1\" trim=\"trim-silence\">number</Dial>" +
                "<Echo/>" +
                "<Enqueue action=\"https://example.com\" method=\"GET\" waitUrl=\"https://example.com\" waitUrlMethod=\"GET\" workflowSid=\"workflow_sid\">name</Enqueue>" +
                "<Gather action=\"https://example.com\" bargeIn=\"true\" debug=\"true\" finishOnKey=\"finish_on_key\" hints=\"hints\" input=\"dtmf\" language=\"af-ZA\" maxSpeechTime=\"1\" method=\"GET\" numDigits=\"1\" partialResultCallback=\"https://example.com\" partialResultCallbackMethod=\"GET\" profanityFilter=\"true\" speechTimeout=\"speech_timeout\" timeout=\"1\"/>" +
                "<Hangup/>" +
                "<Leave/>" +
                "<Pause length=\"1\"/>" +
                "<Play digits=\"digits\" loop=\"1\">https://example.com</Play>" +
                "<Queue method=\"GET\" postWorkActivitySid=\"post_work_activity_sid\" reservationSid=\"reservation_sid\" url=\"https://example.com\">name</Queue>" +
                "<Record action=\"https://example.com\" finishOnKey=\"finish_on_key\" maxLength=\"1\" method=\"GET\" playBeep=\"true\" recordingStatusCallback=\"https://example.com\" recordingStatusCallbackMethod=\"GET\" timeout=\"1\" transcribe=\"true\" transcribeCallback=\"https://example.com\" trim=\"trim-silence\"/>" +
                "<Redirect method=\"GET\">https://example.com</Redirect>" +
                "<Reject reason=\"rejected\"/>" +
                "<Say language=\"da-DK\" loop=\"1\" voice=\"man\">message</Say>" +
                "<Sms action=\"https://example.com\" from=\"+15017122661\" method=\"GET\" statusCallback=\"https://example.com\" to=\"+15558675310\">message</Sms>" +
            "</Response>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        VoiceResponse.Builder builder = new VoiceResponse.Builder();

        builder.addText("Hey no tags!");

        VoiceResponse elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response>" +
            "Hey no tags!" +
            "</Response>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        VoiceResponse.Builder builder = new VoiceResponse.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Response>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        VoiceResponse.Builder builder = new VoiceResponse.Builder();
        VoiceResponse elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Response>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithGenericNodeAttributes() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        GenericNode node = genericBuilder.option("key", "value").addText("someText").build();

        VoiceResponse.Builder builder = new VoiceResponse.Builder();
        VoiceResponse elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Response>" +
            "<genericTag key=\"value\">" +
            "someText" +
            "</genericTag>" +
            "</Response>",
            elem.toXml()
        );
    }
}